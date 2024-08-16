

class Sta {
    static int val = 0;
    static int var; 

    static {
        System.out.println("Static block entered and executed");
        var = 10;
    }

    Sta() {
        val++; 
        System.out.println("In constructor");
    }
}


public class Main9 {
    public static void main(String[] args) {
        new Sta();
        System.out.println(Sta.val); 
        System.out.println(Sta.var); 

        new Sta();
        System.out.println(Sta.val); 
    }
}