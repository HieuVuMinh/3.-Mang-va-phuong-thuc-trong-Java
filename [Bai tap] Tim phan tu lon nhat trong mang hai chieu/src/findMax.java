import java.util.Arrays;
import java.util.Scanner;

public class findMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row");
        int row = sc.nextInt();
        System.out.println("Enter column");
        int column = sc.nextInt();

        int[][] array ;
        array = new int[row][column];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                System.out.print("Enter element at " + "[" + i + "]" + "[" + j + "] : ");
                array[i][j] = sc.nextInt();
            }
            System.out.print("\n");
        }
        // Hiển thị mảng 2 chiều
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }
        // Tìm phần tử lớn nhất
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max){
                    max = array[i][j];
                }
            }
        }
        System.out.println("Max = " + max);
    }
}
