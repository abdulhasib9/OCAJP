public class NumericPromotion{
    public static void main(String[] args) {
        /*when two values has different types java will promot on of th values 
         to th larger data type*/

        //promotion is converting smaller types into bigger types
        int x=5;
        double y = 10.44;
        //the console message below will append the numbers to the string output
        System.out.println("x+y= "+x+y);
        //this is the proper way to perform arthemitic operation using the console
        //we need to wrap the variables inside the brackets 
        System.out.println("x + y = "+(x+y));

        //example 2
        byte b =10;
        int c =5;
        double d =10.5;

        double result = b+c+d;
        /*
         * first b is promoting to the int 
         * the c is promoting to the double 
         * no compilation errors because we use larger data types for the result
         * this is promotion
         */

        System.out.println("Result = "+result);

        System.out.println("============ Casting =============");
        //casting is converting bigger types to smaller types
        //example 1
        double cast1 = 22.5;
        int resultCast = 5+ (int) cast1;
        System.out.println("the casting result := "+resultCast);

        //example 2
        int anotherCast = 23;
        byte byteCast = 120;
        int anotherCastResult = anotherCast +byteCast;
        /*
         * the statment below prints - value because 
         * buffer over flow happens
         * because the byte data type can not hold than 127 (0-127)
         */
        int anotherByteCastResult = (byte) anotherCast +byteCast;
        System.out.println("int reslut =  "+anotherCastResult);
        System.out.println("Byte Result = "+anotherByteCastResult);
        
        //Some of the exam practice Questions
        /*
         * 1: What is the data type of x+y?
         * double x = 44.25;
         * float y = 3.35;
         * 
         * Answer: the code does not compile because there is no letter (f)
         * after the variable y litteral
         * 
         * 2: What is the data type of x/y?
         * short x=14;
         * short y=6;
         *
         * Answer: the data type of x / y is int because short is promoted into int 
         * and the result will be int
         * 
         * 3: What is the data type of x*y/z?
         * short x=14;
         * float y=12.4f;
         * double z =30;
         * 
         * Answer: the result of x*y/z will be the double becaues the smaller type is promoted to larger
         */
    

    }
}