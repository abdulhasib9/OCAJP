import java.lang.reflect.Array;

public class Arrays {
    public static void main(String[] args) {
        int [] num = new int[]{23,55,66};
        for(int i:num)
            System.out.println(i);

        String[] animals = {"dog","parrot","cat"};
        String[] myAnimals = animals;
        String[] otherAnimals ={"dog","parrot","cate"};

        System.out.println(animals.equals(myAnimals));
        System.out.println(animals==myAnimals);
        System.out.println(Arrays.equals(animals,otherAnimals));
        
    }
}