import java.util.Scanner;

public class Possitive_Num_Multiplication_Table {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Any Positive Number = ");
        int n=s.nextInt();
        for(int i=1; i <= 10; i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }

}


