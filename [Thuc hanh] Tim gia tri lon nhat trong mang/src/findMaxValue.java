import java.util.Scanner;

public class findMaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size;
        int[] array;
        do {
            System.out.println("Enter length of array: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + " :");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.print("Array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        // Find max

        int max = array[0];
        int count = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                count = j +1;
            }
        }
        System.out.print("Max = " + max + " at position " + count + "\n");
    }
}
