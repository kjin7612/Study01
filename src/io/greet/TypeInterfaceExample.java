package io.greet;

public class TypeInterfaceExample {
    public static void main(String[] args) {
//        StringLengthLambda myLambda = (String s) -> s.length();
//        StringLengthLambda myLambda = (s) -> s.length();
//        StringLengthLambda myLambda = s -> s.length();
//        System.out.println(myLambda.getLength("Hello Lambda"));

        printLambda(s -> s.length());
    }

    public static void printLambda(StringLengthLambda l){
//        System.out.println(l.getLength("Hello Lambda"));
    }

    interface StringLengthLambda{
        int getLength(String s);
    }
}
