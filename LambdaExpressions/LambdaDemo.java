package LambdaExpressions;

public class LambdaDemo {
    public LambdaDemo(String message){}
    public static void main(String[] args) {
        String prefix = "_";
       greet(new ConsolePrinter());


        //printing the same message using anonymous inner classes
        greet(new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        });

        //printing the message using lambda expression
        greet(message -> System.out.println(prefix+message));
        greet(LambdaDemo::new);

        //method reference
        greet(System.out::println);
        greet(LambdaDemo::new);
    }
    public static void greet(Printer printer){
        printer.print("Hello world");
    }
}
