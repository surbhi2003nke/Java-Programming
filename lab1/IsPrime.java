import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = myObj.nextInt();
        
        boolean isprime = true;
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num % i == 0){
                isprime = false;
                break;
            }
        }

        if(isprime == false){
            System.out.print("The number is not Prime");
        }else{
            System.out.print("The number is Prime");
        }

        myObj.close();
    }
}
