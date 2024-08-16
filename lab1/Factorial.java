import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = myObj.nextInt();

        int factorial = 1;
        for(int i=1; i<=num; i++)
        {
            factorial *= i;
        }

        System.out.println("Factorial of the given number is : " + factorial);

        myObj.close();
        
    }
}
