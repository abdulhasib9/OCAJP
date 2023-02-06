package LambdaExpressions;

import java.util.List;
import java.util.function.Consumer;

public class ChainingConsumers {
    public static void main(String[] args) {
        List<String> list = List.of("Hasib","Yousufzai" );
        Consumer<String> print = System.out::println;
        Consumer <String> printToUpperCase = item->System.out.println(item.toUpperCase());

        list.forEach(print.andThen(printToUpperCase));
    }
}
