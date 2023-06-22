package thread;

public class VideoFileThread extends Thread{
    @Override
    public void run() {

        /*
        * //(비디오프레임번호) 1~5 저장 + 출력
        * */
        int[] intArray = new int[] {1,2,3,4,5};
//        (자막 보호) 하나~다섯 저장

        for (int i = 0; i < intArray.length; i++) { // (비디오프레임 번호) 1~5 저장
            System.out.print("(비디오 프레임) " + intArray[i]+"-");
            try{
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
