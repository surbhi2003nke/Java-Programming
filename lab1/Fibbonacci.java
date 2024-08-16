import java.util.Scanner;

public class Fibbonacci {
    static int fib(int num){
        if(num <= 1){
            return num;
        }
        else{
            return fib(num-1) + fib(num-2);
        }
    }
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the number of terms : ");
        int num = myObj.nextInt();

        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < num; i++) {
            System.out.print(fib(i) + " ");
        }

        myObj.close();

    }
}
