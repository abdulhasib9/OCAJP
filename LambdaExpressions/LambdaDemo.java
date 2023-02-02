package LambdaExpressions;

public class LambdaDemo {
    public static void main(String[] args) {
     //   greet(new ConsolePrinter());

        //printing the same message using anonymous inner classes
        greet(new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        });
    }
    public static void greet(Printer printer){
        printer.print("Hello world");
    }
}
