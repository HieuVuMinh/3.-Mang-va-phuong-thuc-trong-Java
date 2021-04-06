import java.util.Arrays;
import java.util.Scanner;

public class deleteElement {
    static int[] deleteElement(int[] arr, int index) {
        int[] newArray = new int[arr.length - 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = arr[i];
        }
        for (int i = index + 1; i < arr.length; i++) {
            newArray[i - 1] = arr[i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size;
        int[] array;
        do {
            System.out.println("Enter length of array");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter element " + (i + 1) + " of array");
            array[i] = sc.nextInt();
            i++;
        }
// In mảng đã nhập
        System.out.println("Array: ");
        System.out.println(Arrays.toString(array));

// Xóa phần tử tại vị trí nhập vào nhờ gọi phương thức
        System.out.println("Enter element to delete");
        int number = sc.nextInt();
        int [] arr = deleteElement(array, number);
        System.out.println(Arrays.toString(arr));

    }
}
