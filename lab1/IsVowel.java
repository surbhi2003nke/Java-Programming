import java.util.Scanner;
public class IsVowel {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the Character : ");
        String ch = myObj.next();
        char character = ch.toLowerCase().charAt(0);

        switch (character) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("The Character is a vowel.");
                break;
            default:
                System.out.println("The Character is not a vowel.");
        }
        myObj.close();
    }
}
