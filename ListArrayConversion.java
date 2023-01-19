import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ListArrayConversion {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("cat");
        list.add("dog");
        list.add("parr");

        Object[] listArray = list.toArray();
        String[] anotherListArray = list.toArray(new String[0]);
        System.out.println(listArray.length);

        List arraytoList = Arrays.asList(listArray);
        /*
         * the above conversion is fixed and linked with each other
         * if changes made on listArray will affect the arrtolist
         * and the add and remove methods are not supported
         * but the set methode is available
         * !!!
         * */
        System.out.println(Arrays.toString(listArray));
        System.out.println(arraytoList);

        listArray[1] = "lion";
        System.out.println(Arrays.toString(listArray));
        System.out.println(arraytoList);
        /*
        * [cat, dog, parr]
            [cat, dog, parr]
            [cat, lion, parr]
            [cat, lion, parr]
        *
        * */

        //here is one more way for converting array to list
        List<String> newlist = Arrays.asList("test","test1");
        System.out.println(newlist);



    }
}
