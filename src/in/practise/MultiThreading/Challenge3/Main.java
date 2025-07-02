package in.practise.MultiThreading.Challenge3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        HelloThread t1  = new HelloThread(1);
        HelloThread t2  = new HelloThread(2);
        HelloThread t3 = new HelloThread(3);

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
    }
}
