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
    

    }
}