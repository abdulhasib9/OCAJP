package LambdaExpressions;

import java.util.function.Function;

public class FunctionInterfaceDemo {
    public static void main(String[] args) {
        Function<String,Integer> map = str->str.length();
        int length = map.apply("Afghanistan");
        System.out.println(length);
    }
}
