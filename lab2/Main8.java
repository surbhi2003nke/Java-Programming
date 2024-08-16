
class Callbyval {
    int val;

    Callbyval() {
        val = 156; 
    }

    public static void modify(int val) {
        val = 20;
    }
}

class Callbyref {
    int value;

    Callbyref() {
        value = 146; 
    }
    
    public static void modifyObject(Callbyref obj) {
        obj.value = 10; 
    }
}


public class Main8 {
    public static void main(String[] args) {

        Callbyref obj = new Callbyref();
        Callbyref.modifyObject(obj);
        System.out.println("Object after modifyObject: " + obj.value); 

        Callbyval obj1 = new Callbyval();
        Callbyval.modify(obj1.val);
        System.out.println("Value of val after modify: " + obj1.val); 
    }
}