package thread;

public class MyThread extends Thread{
    public MyThread() {
        System.out.println("thread start");
    }
    @Override
    public void run(){
//        쓰레드 작업내용
        // #약간의 시간 지연
        for (long i = 0; i < 100000000; i++) { }
        System.out.println(getName() + "우선 순위: " + getPriority());
//        Thread myThread = new MyThread();
//     또는   MyThread myThread = new MyThread();
//        myThread.start();

    }
}
