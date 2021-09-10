package io.greet;

@FunctionalInterface
public interface Greeting {
    public void perform();
    // Lambda 사용을 위해선 다른 유형의 메서드를 추가 할 수 없음.
//    int add(int a, int b);
//    public void another();
}
