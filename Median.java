import java.util.Random;

public class Median {
    public static void main(String[] args) {
        Random random = new Random();
        int nums = 0;
        int[] arr = new int[10];
        System.out.println("Массив чисел:");
        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(50);
            System.out.print(arr[i] + " ");
            nums += arr[i];
        }
        System.out.println();
        System.out.println("Медиана: " + nums/arr.length);
    }
}
