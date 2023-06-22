package synchronize;

public class PlusThread extends Thread{
//    동기화(synchronized)의 필요성 - 두 개의 Thread가 하나의 객체를 공유하는 경우
    MyData myData;

    public PlusThread(MyData myData) {
        this.myData = myData;
    }

    @Override
    public void run() {
        myData.plusData();
        System.out.println(getName()+"실행 결과: " +myData.data);
    }

}
