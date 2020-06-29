import java.util.Scanner;

public class Arm_Strong_Number {
                                                 //0-9999 in arm strong number is 0,1,153,307,371,407,1634
    public static void main(String[] args) {

        int a, b, c;
        int total = 0;
        System.out.println("Ënter The Number");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        scanner.close();
        b = a;

        for( ;b!=0;b /= 10)
        {
            c = b % 10;
            total = total + c*c*c*c;
        }

        if(total == a)
            System.out.println( "This is an Armstrong ");
        else
            System.out.println( " This is not an Armstrong ");
    }
}
