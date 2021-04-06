import java.util.Arrays;
import java.util.Scanner;

public class gopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of array1");
        int size1 = sc.nextInt();
        System.out.println("Enter length of array2");
        int size2 = sc.nextInt();

        int array1[] = new int[size1];
        int array2[] = new int[size2];
// Nhập 2 mảng vừa khai báo
        int i = 0;
        while (i < array1.length){
            System.out.println("Enter element " + (i + 1) + " of array1");
            array1[i] = sc.nextInt();
            i++;
        }
        int j = 0;
        while (j < array2.length){
            System.out.println("Enter element " + (j + 1) + " of array2");
            array2[j] = sc.nextInt();
            j++;
        }
// Tạo mảng thứ 3
        int array3[] = new int[array1.length + array2.length];
        for (int k = 0; k < array1.length; k++){
            array3[k] = array1[k];
        }
        for (int k = array1.length + 1; k <= array3.length; k++){
            array3[k - 1] = array2[k - 3];
        }
        System.out.println(Arrays.toString(array3));
    }
}
