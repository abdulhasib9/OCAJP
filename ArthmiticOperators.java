public class ArthmiticOperators {
    public static void main(String[] args) {
        //example 1
        int a = 4;
        int b=3-2*a--; //first a is used and then decremented.
        //3-2*4
        //3-8
        //-5
        System.out.println( "a= "+a+" b= "+b);
        //the result is a= 3 & b=-5

        //example 2
        long c =2;
        long d =4+3*c++;
        System.out.println("c= "+c+"d= "+d);

        //example 3
        int result=10-3*(2+1)-4/(1+3);
        System.out.println("result= "+result);

        //modulase operator
        //example 1
        int i=10;
        int j=3;
        int k=i%j;
        System.out.println("k= "+k);
    }
}
