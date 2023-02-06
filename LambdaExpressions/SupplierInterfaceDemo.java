package LambdaExpressions;

import java.util.function.Supplier;

public class SupplierInterfaceDemo {
    Supplier<Double> getRandom = ()->Math.random();
    Double random = getRandom.get();

    public static void main(String[] args) {
        System.out.println(new SupplierInterfaceDemo().random);
    }
}
