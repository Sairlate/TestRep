import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Median {
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
            if (swapped != true) {
                break;
            }
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[random.nextInt(21)];
        System.out.println("Массив чисел до сортировки:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50); // присваиваем элементу массива рандомное число от 0 до 49
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubbleSort(arr);
        System.out.println("Массив чисел после сортировки");
        System.out.println(Arrays.toString(arr));
        double num;
        if (arr.length % 2 == 0) {
            num = (arr[(arr.length / 2) - 1] + arr[arr.length / 2]) / 2.0;
            // можно и так, но вот еще вариант num = (double) (arr[(count/2)-1] + arr[count/2])/2;
        } else {
            num = arr[(arr.length - 1) / 2];
        }
        System.out.println("Медиана: " + num);
    }
}
