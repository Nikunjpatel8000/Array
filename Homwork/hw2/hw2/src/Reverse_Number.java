import java.util.Scanner;

public class Reverse_Number {

    public static void main(String args[])
    {
        int a=0;
        int b=0;
        System.out.println("Input your number: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        while( a > 0 )
        {

            b = b * 10 + a%10;
            a = a/10;
        }

        System.out.println("Reverse number is: " +b );
    }

}
