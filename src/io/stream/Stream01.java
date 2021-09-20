package io.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Stream01 {
    private ArrayList<Integer> arrInt( int inputInt ){
        ArrayList<Integer> arrRtn = new ArrayList<>();
//        for (int i = 0; i < inputInt; i++) {
//            arrRtn.add(i);
//        }
        arrRtn.add(14);
        arrRtn.add(15);
        arrRtn.add(17);
        arrRtn.add(11);
        arrRtn.add(13);
        arrRtn.add(19);
        arrRtn.add(12);
        arrRtn.add(18);
        arrRtn.add(10);
        arrRtn.add(16);

        return arrRtn;
    }

    public static void main(String[] args) {
        Stream01 st = new Stream01();
        ArrayList<Integer> arr = st.arrInt(10);
//        System.out.println(arr);

        System.out.println("Stream 정렬");
        arr.stream()
            .sorted()
            .forEach( i -> System.out.println(i));

        System.out.println("Stream 역정렬");
        arr.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(i -> System.out.println(i));

        System.out.println("Stream 재 대입");
        arr.stream()
                .sorted(Comparator.reverseOrder())
                .iterator();
//                .forEach(i -> {
//                    System.out.println(i);
//                });

        System.out.println("TEST 영역: " + arr.stream().max(Integer::compare));
        System.out.println("TEST 영역: " + arr.stream().min(Integer::compare));
        System.out.println("TEST 영역: " + arr.stream().count());
        System.out.println("TEST 영역: " + arr);
        System.out.println("TEST 영역: " + arr.stream().sorted().collect(Collectors.toList()));
        // 확장 for 문
//        System.out.println("역순 for문");
//        for (int i = 1; i <= arr.size(); i++) {
//            System.out.println(arr.size() - i);
//        }
//
//        System.out.println("확장 for문");
//        for (int i : arr) {
//            System.out.println(i);
//        }
//
//        System.out.println("확장 Lambda");
//        arr.forEach( i -> System.out.println(i));
    }
}
