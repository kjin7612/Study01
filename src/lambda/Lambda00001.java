package lambda;

public class Lambda00001 {


    public static void main(String[] args) {
        ILambda printString;

        printString = () -> System.out.println("TEST");

    }

    interface ILambda{
        void test();
    }
}
