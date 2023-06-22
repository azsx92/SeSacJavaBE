package thread;

public class VideoFileRunnable implements Runnable {

    @Override
    public void run() {

        //(비디오프레임번호) 1~5 저장 + 출력
        int[] intArray = new int[]{1,2,3,4,5};

        for (int i = 0; i < intArray.length; i++) {
            System.out.print("(비디오 프레임)" + intArray[i]+"-");
            try{Thread.sleep(200); } catch (InterruptedException e ){};

        }
    }
}
