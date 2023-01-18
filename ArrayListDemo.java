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

        //remove method
        list.remove("cat");
        System.out.println(list);
        list.remove("lion");
        list.remove(0);
        System.out.println(list);

        //set method
        list.set(0,"Jaguar");
       // list.set(9,"test"); this will throw index out of bound exception because it is invalid index

        //isEmpty function
        System.out.println(list.isEmpty()); //boolean expression

        //Size Method
        System.out.println(list.size());

        //clear method
        list.clear();
        System.out.println(list.isEmpty());


        list.add("cat");
        list.add("parrot");
        list.add("dog");

        //contains
        System.out.println(list.contains("cat")); // returns boolean value

        //equals method
        List<String> list1 = new ArrayList<>();
        list.add("cat");

        List<String> list2 = new ArrayList<>();
        list1.add("cat");
        System.out.println(list1.equals(list2)); //true
        System.out.println(list1 == list2); //false

        list1.add("dog");
        list2.add(0,"dog");
        list2.add("cat");
        System.out.println(list1.equals(list2));
        /*
        * the above statement will print false
        * because the elements and order should be the same
        * */
        System.out.println(list1);
        System.out.println(list2);
    }
}
