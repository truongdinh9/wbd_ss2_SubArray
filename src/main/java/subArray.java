import java.util.Arrays;
import java.util.Scanner;

public class subArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println("we have Array= "+ Arrays.toString(array));
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        do {
            if (i == 1) {
                System.out.println("Input index ");
                int index = scanner.nextInt();
                if(index<10&&index>=0) {
                    System.out.println("Input Value of array[" + index + "]");
                    array[index] = scanner.nextInt();
                    System.out.println("Array= " + Arrays.toString(array));
                }else System.out.println("index must be >=0 and <10 ");
            }
            System.out.println("Press 0 to quit or Press 1 to Continue ");
             i = scanner.nextInt();

        } while (i != 0);
    }
}
