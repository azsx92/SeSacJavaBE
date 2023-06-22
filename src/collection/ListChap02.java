package collection;

import java.util.*;

public class ListChap02 {
    public ListChap02() {
        //#방법1. 동적 크기를 가지는 리스트 객체 생성
        List<Integer> aList1 = new ArrayList<Integer>(); //capacity(10)
        List<Integer> aList2 = new ArrayList<Integer>(30); //capacity(30)
        List<String> aList3 = new Vector<String>(); //capacity(10)
        List<String> aList4 = new Vector<String>(20); //capacity(20)
        List<String> aList5 = new LinkedList<String>(); //capacity(10)
        //List<Double> aList6 = new LinkedList<Double>(20); //(불가능) capacity 지정 불가능
//#방법2. 정적 크기를 기지는 리스트 객체 생성
        List<Integer> aList7 = Arrays.asList(1,2,3,4);
        List<String> aList8 = Arrays.asList("안녕","방가");
        aList7.set(1,7); // [1 7 3 4]
        aList8.set(0, "감사"); //["감사", "방가"]
        aList7.add(5); // 예외 UnsupportedOperationException
        aList8.remove(0); // 예외 UnsupportedOperationException
    }
}
