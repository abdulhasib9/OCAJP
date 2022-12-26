public class UnaryOperators {
    public static void main(String[] args) {
        /*
         *  + (indicates a literal number is positive)
         *  - (indicates a literal number is neagative or negates expression)
         *  ++ (increment value by 1)
         *  -- (Decrements value by 1)
         *  ! (Inverts a boolean logincal value)
         */

         //example 1

         int x = +3; //the + sign is redundant 
         System.out.println("x =" +x);
         double y = -x;
         System.out.println("y ="+y);
         y = -y;
         System.out.println("x = "+x+ " y = "+y);

         //example 2
         boolean a = true;
         boolean b = !a;
         System.out.println("a = "+a + " b = "+b);

        // int myint = !5 ; //this code does not compile
        //! operator can not applied to integers
        
    }
}
