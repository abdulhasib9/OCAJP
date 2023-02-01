package exceptiondemo;

public class FinallyBlock {
    public static void main(String[] args) {
        String item [] = new String[5];
        try{
             String element = firstUpperCase(item);
            System.out.println(element);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finally Block");
        }
    }
    public static String firstUpperCase (String [] array){
        return array[0];
    }
}
