import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingArrayList {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("40");
        stringList.add("323");
        stringList.add("60");
        stringList.add("10");
        stringList.add("403");
        //Collections class is a helper class for the arraylist like Arrays class for the Arrays
        Collections.sort(stringList);
        System.out.println(stringList);
        /*
        * remember these elements are string not numbers
        * string sort alphabetically not numerically
        * the result will be
        * [10, 323, 40, 403, 60]
        *
        * */

        //numbers demo
        List<Integer> integersList = Arrays.asList(22,3,4,223,45); //fixed size list
        Collections.sort(integersList);
        System.out.println(integersList);

    }
}
