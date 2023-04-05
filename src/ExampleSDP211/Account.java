package ExampleSDP211;

public class Account /*implements Accountable<String>*/ {
    private String id;
    private int sum;
    <T>Account(T id, int sum){
        this.id = id.toString();
        this.sum = sum;
    }

    public String getId(){return id;}
    public int getSum(){return sum;}
    public void setSum(int sum){this.sum = sum;}

}
class Transaction<T extends Account> {
    private T from;
    private T to;
    private int sum;

    Transaction(T from, T to, int sum) {
        this.from = from;
        this.to = to;
        this.sum = sum;
    }

    public void execute() {
        if (from.getSum() > sum) {
            from.setSum(from.getSum() - sum);
            to.setSum(to.getSum() + sum);
            System.out.printf("Account %s: %d\nAccount %s: %d\n",
                    from.getId(), from.getSum(), to.getId(), to.getSum());
        }
        else {
            System.out.println("Operation is invalid. Sum of the cash in your account not enough!");
        }
    }
}