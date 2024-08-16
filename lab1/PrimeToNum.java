import java.util.Scanner;
public class PrimeToNum {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int ctn = myObj.nextInt();
        int num=2;
        System.out.print("The prime numbers upto "+ctn+" are : ");

        while(ctn>0){
            boolean isprime = true;
            for(int i=2; i<=Math.sqrt(num); i++){
                if(num % i == 0){
                    isprime = false;
                    break;
                }
            }
            if(isprime == true){
                System.out.print(num + " ");
            }
            ctn--;
            num++;
        }
        myObj.close();
    }
}

