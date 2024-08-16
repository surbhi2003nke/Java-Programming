import java.util.Scanner;

public class grades {
    public static void main(String[] args){
        Scanner myobj = new Scanner(System.in);
        System.out.print("Enter the Percentage : ");
        float Percentage = myobj.nextFloat();

        String grade;
        if(Percentage >= 90){
            grade = "A+";
        }else if(Percentage >= 80){
            grade = "A";
        }else if(Percentage >= 70){
            grade = "B";
        }else if(Percentage >= 60){
            grade = "C";
        }else if(Percentage >= 50){
            grade = "D";
        }else if(Percentage >= 40){
            grade = "E";
        }else{
            grade = "F";
        }

        System.out.println(grade);
        myobj.close();
    }
}
