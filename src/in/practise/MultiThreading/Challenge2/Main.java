package in.practise.MultiThreading.Challenge2;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        ThreadState t1 = new ThreadState();
        System.out.printf("Created Thread %s\n" ,t1.getState());
        t1.start();
        t1.join();

        System.out.printf("thread finished %s\n" , t1.getState());

    }
}
