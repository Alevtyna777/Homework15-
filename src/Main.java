import java.util.Arrays;


import static Algorythms.Algorythm.quickSorter;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 3, 6, 1, 8, 7};

        quickSorter(array, 0, array.length - 1);

        System.out.println("Відсортований масив: " + Arrays.toString(array));
    }
}
