import java.util.Arrays;
import java.util.Random;

public class Array {
        public static void main(String[] args) {
            int[] arr = {7, 7, 7, 7, 7, 7, 7, 7, 7, 7};
            for (int i = 0; i < arr.length; i++);
            System.out.println(Arrays.toString(arr));

            int[] arr2 = {7, 7, 7, 7, 7, 7, 7, 7, 7, 7};
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = i + i - 1;
            }
            System.out.println(Arrays.toString(arr2));

            Random rand = new Random();
            int arr3[] = new int[10];
            for (int i = 0; i < arr3.length; i++) {
                arr3[i] = rand.nextInt(10);
            }
            System.out.println(Arrays.toString(arr3));

            int revers = arr3.length;
            int a;
            for (int i = 0; i < revers / 2; i++) {
                a = arr3[revers - i - 1];
                arr3[revers - i - 1] = arr3[i];
                arr3[i] = a;
            }
            for (int i = 0; i < arr3.length; i++);
            System.out.println(Arrays.toString(arr3));

            int s = 0;
            for (int i = 0; i < arr3.length; i++) {
                if (arr3[i] > 0 && arr3[i] < 5) {
                    s++;
                }
            }
            System.out.println("The number of elements in the array is less than 5: " + s);
        }
}
