class Box {
    double width, height, depth, vol;

    void volume() {
        vol = width * height * depth;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Box box = new Box();
        
        // Set dimensions for box
        box.width = 2;
        box.height = 3;
        box.depth = 4;

        box.volume();
        System.out.println("Volume of box: " + box.vol + " cubic units");
    }
}

