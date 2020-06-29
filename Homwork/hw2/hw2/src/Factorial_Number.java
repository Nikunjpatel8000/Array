import java.util.Scanner;

public class Factorial_Number {

    public static void main(String[] args) {
        int number;
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();
        long a = 1;
        int b = 1;
        while(b<=number)
        {
            a = a * b;
            b++;
        }
        System.out.println("Factorial of "+number+" is: "+a);
    }

}
