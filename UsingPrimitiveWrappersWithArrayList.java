import java.util.ArrayList;
import java.util.List;

public class UsingPrimitiveWrappersWithArrayList {
    public static void main(String[] args) {
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(33.3);
        doubleList.add(new Double(43)); //unnecessary casting
        doubleList.add(44.34d);
        doubleList.remove(33.3);
        System.out.println(doubleList);

        doubleList.add(33.34);

        doubleList.remove(1); //this removes the element at index 1
        System.out.println(doubleList);
        doubleList.remove(new Double(44.34)); //this removes the value 44.34 from the array list
        System.out.println(doubleList);

        List<Integer>   integersList   = new ArrayList<>();
        int index0 = integersList.get(0); //this will throw index out of bound exception
        System.out.println(index0);
    }

}
