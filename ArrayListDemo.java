import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayListDemo {
    public static void main(String[] args) {
        List mylist = new ArrayList();
        mylist.add("hasib");
        mylist.add("noman");
        System.out.println(mylist);

        //2nd example
        ArrayList<String> list = new ArrayList<>();

        list.add("cat");
        list.add("parrot");
        list.add("dog");
        list.add(1,"lion"); //this will change parrot to lion
        list.add("eagle");
        System.out.println(list);


    }
}
