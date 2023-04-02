package ExampleSDP211;

public abstract class Person {
    private String name;
    public String getName(){
        return name;
    }

    public Person(String name){
        this.name = name;
    }
    public abstract void display();
}

class Employee extends Person{
    private String company;

    public String getCompany(){
        return company;
    }
    public Employee(String name, String company){
        super(name);
        this.company = company;
    }

    public void display() {
        System.out.printf("Employee name: %s\nCompany: %s", this.getName(), company);
    }
}

class Client extends Person{
    public int sum;
    private String company;
    public Client(String name, String company, int sum){
        super(name);
        this.company = company;
        this.sum = sum;
    }

    public int Sum() { return this.sum; }

    public void display() {
        System.out.printf("Client name: %s\nCompany: %s", this.getName(), company);
    }
}

interface Printable{
    void print();
}

class Book implements Printable{
    String name;
    String author;
    Book(String name, String author){
        this.name = name;
        this.author = author;
    }
    public void print(){
        System.out.println(this.name + " " + this.author);
    }


}

class Journal implements Printable{
    String name;
    String author;
    Journal(String name, String author){
        this.name = name;
        this.author = author;
    }
    public void print(){
        System.out.println(this.name + " - " + this.author);
    }

    public String getName(){
        return this.name;
    }
}

interface Calculation{
    default int sum (int a, int b){
        return sumAll(a, b);
    }
    private int sumAll(int... val){
        int result = 0;
        for (int i: val){
            result += i;
        }
        return result;
    }
}

class Calculate implements Calculation, Printable{

    @Override
    public void print() {

    }
}