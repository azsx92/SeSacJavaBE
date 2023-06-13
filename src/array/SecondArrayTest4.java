package array;

public class SecondArrayTest4 {
    public SecondArrayTest4() {

//        1~5 , 6~20 만들어 보기
/*
        int[][] numsArr = new int[2][];
        int[] arr1 = new int[5];
        int[] arr2 = new int[15];

        for (int i = 0; i < arr1.length; i++) {
          arr1[i] += i+1;
        }

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] += i+6;
        }
        numsArr[0] = arr1;
        numsArr[1] = arr2;

        for (int[] m: numsArr) {
            for (int n: m) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
*/

//        System.out.println(arr[0]);
//        System.out.println(arr[1]);

        int[][] numArr = new int[2][];
        numArr[0] = new int[5];
        numArr[1] = new int[15];

        int k= 1;
        for (int[] m: numArr) {
            for (int n : m) {
               m[n] = k++;
                System.out.print(m[n] + " ");
            }
            System.out.println();
        }
    }
}
