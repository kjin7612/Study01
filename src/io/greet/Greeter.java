package io.greet;

public class Greeter {

    public void greet(Greeting greeting){
        greeting.perform();
//        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        // Interface
        Greeting helloWorldGreeting = new HelloWorldGreeting();
//        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
//
        // lambda expression
        Greeting lambdaGreeting = () -> System.out.println("Hello World! - Lambda");
//        Greeting myLambdaFunction = () -> System.out.println("Hello World - Lambda");
//        MyLambda myLambdaFunction = () -> System.out.println("Hello World - Lambda");
//        MyAdd addFunction = (int a, int b) -> a + b;
//        greeter.greet(helloWorldGreeting);

        Greeting innerClassGreeting = new Greeting() {
            // anonymous class
            @Override
            public void perform() {
                System.out.println("Hello world! - inner Class");
            }
        };

        greeter.greet(() -> System.out.println("Hello World!"));
        greeter.greet(lambdaGreeting);
        greeter.greet(innerClassGreeting);

//        innerClassGreeting.perform();
//        helloWorldGreeting.perform();
    }
}

//interface MyLambda{
//    void foo();
//}

//interface MyAdd{
//    int add(int x, int y);
//}
