import java.util.Scanner;

public class findElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        do {
            System.out.println("Enter name student u wanna check:");
            String name = sc.nextLine();
            int count = -1;
            for (String element : students) {
                count++;
                if (element.equals(name)) {
                    System.out.printf("%s is available in Array at %d\n", element, count);
                    break;
                }
            }
        } while (true);
    }
}
