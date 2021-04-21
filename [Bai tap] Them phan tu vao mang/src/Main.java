import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập độ dài mảng");
        int size = sc.nextInt();

        do {
            System.out.println("Nhập phần tử trong mảng");
            size = sc.nextInt();
        }while (size != 0);
        AddElementToList[] array = new AddElementToList[size];

        int i = 0;
        while (i < array.length){
            System.out.println("Enter element " + (i+1) + " of array");
            array[i] = sc.nextInt();
            i++;
        }



//        int size;
//        int[]array;
//
//        do{
//            System.out.println("Enter size of Array");
//            size = sc.nextInt();
//        }while (size == 0);
//
//        array = new int[size];
//        int i = 0;
//        while (i < array.length){
//            System.out.println("Enter element " + (i+1) + " of array");
//            array[i] = sc.nextInt();
//            i++;
//        }
//        System.out.println("Array: ");
//        System.out.println(Arrays.toString(array));
//    }
//
//    public static void displayElement(int[]array, size){
//
    }


}
