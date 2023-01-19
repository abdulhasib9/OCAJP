import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchingArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("30");
        list.add("21");
        list.add("12");
        list.add("23");
        list.add("540");

        System.out.println(Collections.binarySearch(list,"21"));
        //the above statement will return - value because for binary search the list needs to be sorted

        Collections.sort(list);
        System.out.println(list);
        int index = Collections.binarySearch(list,"10");
        System.out.println(index);
    }
}
