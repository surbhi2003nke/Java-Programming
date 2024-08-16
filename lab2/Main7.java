
class Arithmetic{

    double addition(double num1, double num2){
        return num1 + num2;
    }

    double subtract(double num1, double num2){
        return num1 - num2;
    }

    double multiply(double num1, double num2){
        return num1 * num2;
    }

    double divide(double num1, double num2){
            return num1 / num2;
    }
}

public class Main7 {
    public static void main(String[] args){
        Arithmetic ari = new Arithmetic();
        double num1 = 2.5; double num2 = 10;

        System.out.println("Addition : num1 + num2 = " + ari.addition(num1, num2));
        System.out.println("Susbraction : num1 - num2 = " + ari.subtract(num1, num2));
        System.out.println("Multiplication : num1 * num2 = " + ari.multiply(num1, num2));
        System.out.println("Division : num1 / num2 = " + ari.divide(num1, num2));

    }
}
