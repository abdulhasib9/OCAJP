public class BreakStatement {
    public static void main(String[] args) {

        String [] animals ={"dog","cat","wolf","lion"};

        AnimalsForEachLoop:
        for(String item:animals){
            if(item.equals("wolf"))
                break AnimalsForEachLoop;

            System.out.println(item);
        }

        int index =0;
        while(index<animals.length){
            if(animals[index].equals("wolf"))
                break;
            System.out.println(animals[index]);
            index++;
        }
    }
}
