
class Box{
    double width, height, depth;

    Box(double w, double h, double d) {
        width = w; height = h; depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

public class Main4{
    public static void main(String[] args) {
        Box simple_box = new Box(3.1, 6, 10);

        System.out.println("Volume of simple_box: " + simple_box.volume() + " cubic units");
    
    }
}