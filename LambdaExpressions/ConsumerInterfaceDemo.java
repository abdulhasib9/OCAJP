package LambdaExpressions;

import java.util.List;

public class ConsumerInterfaceDemo {
    public static void main(String[] args) {
        List <Integer> list = List.of(23,44,653,2);

        //imperative programming (implementing logic using instruction ) (how something should be done)
        for(Integer item :list)
            System.out.println(item);
        //declarative programming (what needs to be done)
        list.forEach(System.out::println);
    }
}
