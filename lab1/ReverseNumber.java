import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = myObj.nextInt();

        int ans = 0;
        while(num != 0) {
            ans = ans*10 + num%10;
            num /= 10;
        }
        System.out.print("The Reversed number is : "+ans);
        myObj.close();
    }
}
