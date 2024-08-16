class Box {
    double width, height, depth;

    Box(){
        width = 1; height = 1; depth = 1;  
    }

    Box(double w, double h, double d){
        width = w; height = h; depth = d;
    }

    Box(double side) {
        width = height = depth = side;
    }

    double volume() {
        return width * height * depth;
    }
}

public class Main5 {
    public static void main(String[] args) {

        Box box1 = new Box();
        Box box2 = new Box(2, 3, 4);
        Box box3 = new Box(5);
        
        System.out.println("Volume of box1 (default dimensions): " + box1.volume() + " cubic units");
        System.out.println("Volume of box2: " + box2.volume() + " cubic units");
        System.out.println("Volume of box3 (cube): " + box3.volume() + " cubic units");

    }
}

