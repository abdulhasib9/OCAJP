import java.util.*;

public class IteratingList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(23);
        numbers.add(233);
        numbers.add(232);
        numbers.add(12113);
        numbers.add(3233);
        numbers.add(623);

        ListForLoop:
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Index " + i + " : " + numbers.get(i));
            //numbers.remove(2); //index out of bound
        }

        //iterating to the list using foreach loop
        int count = 0;
        listForeachLoop:
        for (Integer num : numbers) {
            System.out.println("Index " + count++ + " " + num);
            //numbers.remove(2); //concurrent modification

        }

        //iterating throw list using iterator
        System.out.println("--------------------------- Iterators ------------------------");
        for (Iterator<Integer> numberIterator = numbers.iterator(); numberIterator.hasNext();){
            Integer number = numberIterator.next();
            System.out.println("Number : " +number);
            numberIterator.remove();

        }

        //using ListIterator
        numbers.addAll(Arrays.asList(233,45,656,34,5,67,3,2));
        for(ListIterator<Integer> integerListIterator = numbers.listIterator(3);integerListIterator.hasPrevious();){
            Integer number = integerListIterator.previous();
            System.out.println("List Number : "+number);
            integerListIterator.remove();

        }

        System.out.println(numbers);
    }
}
