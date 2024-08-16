import java.util.Scanner;

public class MaximumNum {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter three different numbers : ");
        int num1 = myObj.nextInt();
        int num2 = myObj.nextInt();
        int num3 = myObj.nextInt();

        int greatestNumber;
        if(num1 > num2){
            if(num1 > num3){
                greatestNumber = num1;
            }else{
                greatestNumber = num3;
            }
        }else{
            if(num2 > num3){
                greatestNumber = num2;
            }else{
                greatestNumber = num3;
            }
        }

        System.out.print("The Maximum of the three numbers is : "+greatestNumber);

        myObj.close();
    }
}
