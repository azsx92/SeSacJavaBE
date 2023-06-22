package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {
    public ArrayListVsLinkedList() {
        //#. ArrayList 및 LinkedList  객체 선언
        List<Integer> aList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        long startTime = 0, endTime = 0;

//        ☞ ArrayList<E> vs. LinkedList<E> 성능비교
//        - 데이터의 추가(add) 시간 비교

        //#1. 데이터 추가 시간 측정비교
        //@1-1 ArrayList 데이터 추가시간 측정
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            aList.add(0, i);
        }
//        aList.add(i) 의 경우  차이가 크지
//        않음(뒤에 추가되어 데이터의 shift가 일어나지 않음)

        endTime = System.nanoTime();
        System.out.println("ArrayList 데이터 추가시간: " + (endTime - startTime) + "ns");
        //약 250 배차;
//        ArrayList 데이터 추가시간: 1009859700ns
//        LinkedList 데이터 추가시간: 4064800ns
//@1-2 LinkedList 데이터 추가시간 측정
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(0, i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList 데이터 추가시간: " + (endTime - startTime) + "ns");

//        ☞ ArrayList<E> vs. LinkedList<E> 성능비교
//                - 데이터의 검색(get) 시간 비교
//@2-1. ArrayList 데이터 검색 시간 측정
        startTime = System.nanoTime();
        for (int i = 0; i < aList.size(); i++) {
            aList.get(i);
        }

        endTime = System.nanoTime();
        System.out.println("ArrayList 데이터 검색시간: " + (endTime - startTime) + "ns");
//@2-2. LinkedList 데이터 검색 시간 측정
        startTime = System.nanoTime();
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.get(i);
        }
        //약 4400배 차이
//        ArrayList 데이터 검색시간: 1207600ns LinkedList 데이터 검색시간: 5332310400ns
        endTime = System.nanoTime();
        System.out.println("LinkedList 데이터 검색시간: " + (endTime - startTime) + "ns");

//     ☞ ArrayList<E> vs. LinkedList<E> 성능비교
        //#3. 데이터의 제거 (remove) 시간 비교
//@3-1. ArrayList 데이터 제거 시간 측정
        startTime = System.nanoTime();
        for (int i = 0; i < aList.size(); i++) {
            aList.remove(0);
        }

        endTime = System.nanoTime();
        System.out.println("ArrayList 데이터 제거시간: " + (endTime - startTime) + "ns");
//@3-2. LinkedList 데이터 제거 시간 측정
        startTime = System.nanoTime();
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.remove(0);
        }
//        500배차이
//        ArrayList 데이터 제거시간: 706482900ns LinkedList 데이터 제거시간: 1409700ns
        endTime = System.nanoTime();
        System.out.println("LinkedList 데이터 제거시간: " + (endTime - startTime) + "ns");

    }
}
