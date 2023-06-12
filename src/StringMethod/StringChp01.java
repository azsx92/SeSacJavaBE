package StringMethod;

public class StringChp01 {
    public StringChp01() {
        // 01 객체 내의 값 변경 불가능 -> 값 변경시 새로운 객체를 생성하여 작성
        String str1 = new String("안녕");
        String str2 = str1;
        str1 = "안녕하세요.";

        //System.out.println(str1);
        //System.out.println(str2);

//        02 // 01 객체 내의 값 변경 불가능 -> 값 변경시 새로운 객체를 생성하여 작성
        str1 = "안녕" + "하세요"+"!";
        System.out.println(str1);  //안녕하세요!
//        System.out.println(str1.splt(,1));

        str2 =  "반갑";
        str2 +=  "습니다.";
        str2 +=  "!";
        System.out.println(str2);// 반갑습니다.
        System.out.println();

    }
}
