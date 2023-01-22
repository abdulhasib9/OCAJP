public class PassByValue {
    public static void main(String[] args) {
        String name ="abdul hasib";
        test(name);
        System.out.println(name);

        //pass by reference
        StringBuilder sb = new StringBuilder("Jack");
        testsb(sb);
        System.out.println(sb);
    }
    public static void test (String name){
        name = "test";
        System.out.println(name);
        name ="yousufzai";
        System.out.println(name);
    }
    public static void testsb(StringBuilder sb){
        System.out.println(sb);
        sb.append(" Hello world");
        System.out.println(sb);
    }
}
