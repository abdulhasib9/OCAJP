package exceptiondemo;

public class ExceptionsDemo {
    public static void main(String[] args) {
        //Throwable is parent of all exceptions
      //  test(); ->this needs to be handle

        //handling arithmetic exception
        try {
            int result =   divide(2,0);
            System.out.println("result "+ result);
        }catch (ArithmeticException arithmeticException){
            System.out.println(arithmeticException.getMessage());
        }

        anotherTest();

        try{
          test();
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }


    }

    public static void test() throws Exception {
        throw new Exception("Throws Exception!!");
    }
    public static void anotherTest() throws RuntimeException {
        throw new RuntimeException("Wrong Parameter");
    }
    public static int divide (int a,int b){
        return a/b;
    }
}
