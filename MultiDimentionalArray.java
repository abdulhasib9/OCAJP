import java.util.Arrays;

public class MultiDimentionalArray {
    public static void main(String[] args) {
        int[][] numbers = {{1, 3}, {32, 43, 23}};

        //    System.out.println(Arrays.toString(numbers));
        for (int[] items : numbers) {
            System.out.println(Arrays.toString(items));
            for (int item : items)
                System.out.println(item);
        }

        //3d arrays
        int[][][] cube = {
                {{223, 443, 43}, {232}, {2323, 4243, 23}},
                {{223, 443, 423}, {2322}, {2322323, 443, 23}},
                {{223, 443, 433}, {232}, {2323, 44233, 23}},
        };

        for (int[][] arrays : cube) {
            for (int[] items : arrays) {
                for(int item: items)
                    System.out.print(item + "  ");
            }
        }

    }
}