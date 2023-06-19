package thread;

public class MyThread extends Thread{
    public MyThread() {
        System.out.println("thread start");
    }
    @Override
    public void run(){
//        쓰레드 작업내용
        Thread myThread = new MyThread();
//     또는   MyThread myThread = new MyThread();
        myThread.start();

    }
}
