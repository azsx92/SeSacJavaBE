package threadWaiting;

public class DataBox {
    int data;
    public synchronized void inputData(int data) throws InterruptedException {
        this.data = data;
        System.out.println("입력 데이터: " + data);
    }

    public synchronized void outputData()
            throws InterruptedException {
        System.out.println("출력 데이터: " + data);
    }
}
