
class Box {
    double width, height, depth;

    Box(double w, double h, double d) {
        this.width = w; this.height = h; this.depth = d;
    }


    void setDimensions(double w, double h, double d) {
        this.width = w; this.height = h; this.depth = d;
    }

    double volume() {
        return this.width * this.height * this.depth;
    }

    void displayDimensions() {
        System.out.println("Width: " + this.width);
        System.out.println("Height: " + this.height);
        System.out.println("Depth: " + this.depth);
    }
}

public class Main6 {
    public static void main(String[] args) {
        //instance of Box
        Box box = new Box(2, 3, 4);

        // Display initial dimensions and volume
        System.out.println("Initial dimensions and volume:");
        box.displayDimensions();
        System.out.println("Volume: " + box.volume() + " cubic units");

        // Modify dimensions using setDimensions method
        box.setDimensions(5, 6, 7);

        // Display updated dimensions and volume
        System.out.println("\nUpdated dimensions and volume:");
        box.displayDimensions();
        System.out.println("Volume: " + box.volume() + " cubic units");
    }
}
