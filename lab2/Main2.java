
class Box{
    double width, height, depth;

    double volume() {
        return width * height * depth;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Box box = new Box();

        // Set dimensions for box
        box.width = 2;
        box.height = 3;
        box.depth = 4;

        System.out.println("Volume of box: " + box.volume() + " cubic units");
    
    }
}
