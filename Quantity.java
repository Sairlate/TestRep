import java.util.*;

public class Quantity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] array = sc.nextLine().toLowerCase().replaceAll(" ", "").toCharArray();
        Arrays.sort(array);
        int count = 0;
        char symbol ='ф';
        for (int i=0;i<array.length;i++){
            if(array[i] == symbol){
                count++;
            }
        }
        System.out.println("Количество символов "+ symbol + " в строке равно "+ count);
    }
}
