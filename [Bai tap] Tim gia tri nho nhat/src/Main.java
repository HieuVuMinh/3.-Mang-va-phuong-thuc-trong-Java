import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
     int[] arr = new int[6];
     arr[0] = 1;
     arr[1] = 13;
     arr[2] = 8;
     arr[3] = 6;
     arr[4] = 2;
     arr[5] = 4;
     findMin(arr);
    }
    public static void findMin(int array[]){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]){
                min = array[i];
            }
        }
        System.out.println("Số nhỏ nhất trong mảng là: " + min);
    }
}
