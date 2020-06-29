import java.util.Scanner;

public class P_N_Z_Number {

    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int number,P = 0, N = 0, Z = 0;

        char choice;

        do
        {
            System.out.print("Enter the number ");
            number = console.nextInt();

            if(number > 0)
            {
                P++;
            }
            else if(number < 0)
            {
                N++;
            }
            else
            {
                Z++;
            }

            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);

        }while(choice=='y' || choice == 'Y');

        System.out.println("Positive numbers: " + P);
        System.out.println("Negative numbers: " + N);
        System.out.println("Zero numbers: " + Z);
    }

}
