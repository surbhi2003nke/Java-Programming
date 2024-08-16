import java.util.Scanner;
public class Prime {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("The count of Prime-numbers required : ");
        int ctn = myObj.nextInt();
        int num=2;
        System.out.print("The first "+ctn+" prime numbers are : ");

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
                ctn--;
            }
            num++;
        }
        myObj.close();
    }
}
