import java.util.Scanner;

public class chuyenDoiNhietDo {

    static double fahrenheitToCelsius(double fahrenheit){
        return (5.0 / 9) * (fahrenheit - 32);
    }
    static double celsiusToFahrenheit(double celsius){
        return ((celsius * 9) / 5.0) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter number: ");
            double number = sc.nextDouble();
            System.out.println("1. Fahrenheit to Celsius\n" + "\n" +
                    "2. Celsius to Fahrenheit\n" + "\n" +
                    "0. Exit ");
            System.out.println("Enter selection");
            int selection = sc.nextInt();

            switch (selection) {
                case 1:
                    System.out.println(fahrenheitToCelsius(number));
                    break;
                case 2:
                    System.out.println(celsiusToFahrenheit(number));
                    break;
                case 0:
                    break;
            }
        }while (true);
    }
}
