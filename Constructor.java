package EncapsulationDemo;

public class Constructor {
    public static void main(String[] args) {
        // Creating an object of Demo2 with constructor arguments
        Demo2 obj = new Demo2(5, 6);
    }
}
   class Demo2 {
    int a;
    int b;

    // Constructor with parameters
    public Demo2(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println(a);
        System.out.println(b);
    }
}


