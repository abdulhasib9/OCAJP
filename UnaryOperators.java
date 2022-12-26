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
        
        //example 3
        // increment and decrement has higher order than (=,-,/,*)
        int newInt =5;
        int newOtherInt = newInt++; // this first assign the newInt value to newOtherInt and then it increment newInt by 1
        System.out.println("newInt = "+newInt +" newOtherInt = "+newOtherInt);

        //example4
        double newDouble =0;
        System.out.println( " newDouble = "+newDouble);
        System.out.println("newDouble after increment = "+ ++newDouble);//1
        System.out.println("agian newDouble = " + newDouble);//1
        System.out.println("decrement the new Double "+newDouble --);//1
        System.out.println( " newDouble = "+newDouble);//0

        /*
         * EXAM DEMO QUESTIONS
         * 
         * 1: What is the output of e and f?
         * double e =3;
         * double f = ++e * 5 / e-- + --e;
         * 
         * Answer: e =2 and f=7.
         * Explaination:
         * e=3;
         * f = ++e * 5 / e-- + --e;
         * f = 4 * 5 /e-- + --e;
         * f = 20 / 4 +2;
         * f = 5+2;
         * f=7;
         * e=2;
         * 
         * 
         *
         * 
         */

    }
}
