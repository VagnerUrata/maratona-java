package academy.devdojo.maratonajava.introducao.Arrays;

public class ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];
        for (int[] arrayBase: arrayInt){
            for (int num: arrayBase){
                System.out.println(num);
            }

        }
    }
}
