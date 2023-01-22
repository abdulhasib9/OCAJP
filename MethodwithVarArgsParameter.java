import java.util.Arrays;

public class MethodwithVarArgsParameter {

    public static void main(String[] args) {
        method1("car","bike","boat");
        method1(1,"cat");
        method1("1 Item");

    }
    public static void method1(String ... items){
        for(String item: items){
            System.out.println(item);
        }
        System.out.println(Arrays.toString(items));
    }

    public static void method1(int index,String... items){
        System.out.println(index);
        System.out.println(Arrays.toString(items));
    }
    //public static void method1(String ...items,int index){} /* this does not compiles because the variable argument should be last element in argument list*/
}
