class ThreadDemo extends Thread {

    public void run() {
        System.out.println("Hello World from Thread class");
    }
}

class RunnableDemo implements Runnable {

    public void run() {
        System.out.println("Hello World from Runnable Interface");
    }
}

public class pra_6_1{
    public static void main(String[] args) {
        ThreadDemo td = new ThreadDemo();
        Thread rd = new Thread(new RunnableDemo());
        td.start();
        rd.start();
    }

}