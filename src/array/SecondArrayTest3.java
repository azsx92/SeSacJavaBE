package array;

public class SecondArrayTest3 {
    public SecondArrayTest3() {
        //   1~5 ,6~20

//       void printNumArr3(){
//        20230612 sesac 수업 2차원배열 예제
            int[][] numsArr = new int[2][];
            int[] nums1 = new int[5];
            int[] nums2 = new int[15];

            for(int i = 0; i < nums1.length; i++){
                nums1[i] = i+1;
            }

            for(int i = 0; i < nums2.length; i++){
                nums2[i] = i+6;
            }

            numsArr[0] = nums1;
            numsArr[1] = nums2;

            for(int[] arr : numsArr){
                for(int n : arr){
                    System.out.print(n + " ");
                }
                System.out.println();
            }
//        }

/*
        int[][] c = new int[2][];
        c[0] = new int[5];
        c[1] = new int[15];

        int k=1;
        for(int i[] : c) {
            for(int j:i) {
                i[j] = k++;
                System.out.print(i[j]+" ");
            }
            System.out.println();
        }
        */


    }
}
