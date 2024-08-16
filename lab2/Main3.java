
class Area{
    double area(double side){ //square
        return side * side;
    }

    double area(double length, double width){ //rectangle
        return length * width;
    }

    double area(double half, double base, double height){ //triangle
        return half * base * height;
    }
}

public class Main3 {
    public static void main(String[] args){
        Area Square = new Area();
        Area Rectangle = new Area();
        Area Triangle = new Area();

        System.out.println("Area of the Square : " + Square.area(2.5) + " cubic units");
        System.out.println("Area of the Rectangle : " + Rectangle.area(6.4, 10) + " cubic units");
        System.out.println("Area of the Triangle : " + Triangle.area(0.5, 8, 10) + " cubic units");

    }
}
