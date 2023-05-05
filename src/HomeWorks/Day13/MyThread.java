package HomeWorks.Day13;

public class MyThread {

    public static void main(String[] args) {
        StringBuilder sharedStringBuilder = new StringBuilder("a");
        Thread thread1 = new MyThread1(sharedStringBuilder);
        Thread thread2 = new MyThread1(sharedStringBuilder);
        Thread thread3 = new MyThread1(sharedStringBuilder);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class MyThread1 extends Thread {
    private final StringBuilder sharedStringBuilder;

    public MyThread1(StringBuilder sharedStringBuilder) {
        this.sharedStringBuilder = sharedStringBuilder;
    }

    @Override
    public void run() {
        synchronized (sharedStringBuilder) {
            for (int i = 0; i < 100; i++) {
                System.out.print(sharedStringBuilder);
            }
            sharedStringBuilder.setCharAt(0, (char) (sharedStringBuilder.charAt(0) + 1));
        }
    }
}

