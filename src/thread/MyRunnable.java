package thread;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        //스레드 작업내용
        Runnable r = new MyRunnable();
//        또는
//        MyRunnable r = new MyRunnable();

        Thread myThread = new Thread(r);

        myThread.start();
    }
}
