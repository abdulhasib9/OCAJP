public class ForEachLoop {
    public static void main(String[] args) {
        String[] names = {"hasib","noman","sahar"};
        for (int i = 0; i <names.length ; i++) {
            System.out.println(names[i]);
        }

        for(String item:names){
            System.out.println(item);
        }

        System.out.println("StringBuilders -----------------------------");
        StringBuilder [] builders = {

                new StringBuilder("for"),
                new StringBuilder("foreach")
        };

        for(StringBuilder builder: builders)
            System.out.println(builder);

        for(StringBuilder builder: builders){
            builder.append("123400");
        }
        for (StringBuilder builder: builders)
            System.out.println(builder);

        String pet="cat";
       // for(String item:pet){} this does not compiles because pet is not array
        for(char c : pet.toCharArray()){
            System.out.println(c);
        }
    }
}
