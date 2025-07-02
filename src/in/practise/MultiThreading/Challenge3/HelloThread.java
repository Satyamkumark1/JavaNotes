package in.practise.MultiThreading.Challenge3;

public class HelloThread extends  Thread {

    private int ThreadNumber = 1;

    public HelloThread(int thread) {
        ThreadNumber = thread;
    }

    @Override
    public void run() {
        System.out.printf("  %s Thread starting  %d\n", Thread.currentThread().getName() , ThreadNumber);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf(" %s Thread Ending  %d\n", Thread.currentThread().getName() , ThreadNumber);
    }
}


