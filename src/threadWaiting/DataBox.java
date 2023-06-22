package threadWaiting;

public class DataBox {
//    Step 1. 쓰기 쓰레드 동작 (데이터출력)
//    Step 2. 읽기 쓰레드 깨우기 (notify())
//    Step 3. 쓰기 쓰레드 일시정지 (wait())
//    Step 4. 읽기 쓰레드 동작 (데이터읽기)
//    Step 5. 쓰기 쓰레드 깨우기 (notify())
//    Step 6. 읽기 쓰레드 일시정지 (wait())
//    Step 1~6. 반복
    boolean isEmpty = true;
    int data;

    public synchronized void inputData(int data) throws InterruptedException {
        if (!isEmpty) {
            wait();
        }
        isEmpty = false;

        this.data = data;
        System.out.println("입력 데이터: " + data);
        notify();
    }
    public synchronized void outputData() throws InterruptedException {
        if (isEmpty) {
            wait();
        }
        isEmpty = true;

        this.data = data;
        System.out.println("출력 데이터: " + data);
        notify();
    }
}
