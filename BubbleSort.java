import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        boolean swapped;
        for (int i = 0; i < n; i++) {
            swapped = false;
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        System.out.println("Массив чисел до сортировки:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(500); // присваиваем элементу массива рандомное число от 0 до 499
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubbleSort(arr);
        System.out.println("Массив чисвел после сортировки");
        System.out.println(Arrays.toString(arr));
    }
}
