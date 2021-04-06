import java.util.Scanner;

public class findMin {
    static void findMin(int [] arr){
        int min = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
                count++;
            }
        }
        System.out.print("\n Số nhỏ nhất = " + min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size;
        int [] array;
        do {
            System.out.println("Enter length of array");
            size = sc.nextInt();
            if (size > 20){
                System.out.println("Size should not exceed 20");
            }
        }while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.println("Enter element " + (i + 1) + " of array");
            array[i] = sc.nextInt();
            i++;
        }

        System.out.println("Array: ");
        for (int element : array){
            System.out.print(element + "\t");
        }

        //find min
        findMin(array);
    }
}
