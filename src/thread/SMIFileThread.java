package thread;

public class SMIFileThread extends Thread{
    @Override
    public void run() {
//        super.run();
        String[] strArray = new String[] {"하나","둘","셋","넷","다섯"};
        try{
            Thread.sleep(10);
        } catch (InterruptedException e1) {
        }

        for (int i = 0; i < strArray.length; i++) { // (비디오프레임 번호) 1~5 저장
            System.out.println("(자막) " + strArray[i]);
            try{
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}