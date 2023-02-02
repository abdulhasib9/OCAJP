public class ComparableInterface implements Comparable<ComparableInterface>{
    private int points;
    public ComparableInterface (int points){
        this.points =points;
    }
    @Override
    public int compareTo(ComparableInterface other ) {
       return points -other.points;
    }

    public static void main(String[] args) {
        ComparableInterface demo1 = new ComparableInterface(23);
        ComparableInterface demo2 = new ComparableInterface(30);

        if(demo1.compareTo(demo2)>0)  {
            System.out.println("demo1 is greater than demo 2");
        }else if (demo1.compareTo(demo2)<0){
            System.out.println("demo 2 is greater than demo 1");
        }else
            System.out.println("demo1 is equal to demo 2");
    }
}

