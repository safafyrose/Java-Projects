public class constructor_chaining {
    constructor_chaining() {
        System.out.println("Default Constructor");
    }

    constructor_chaining(int x, int y) {
        this();
        System.out.println(x + y);
    }

    constructor_chaining(int z, int q, int p) {
        this(10, 10);
        System.out.println(z * q * p);
    }

    constructor_chaining(int a, int b, int c, int d) {
        this(10, 10, 10);
        System.out.println("Constructor Chaining");
    }

    public static void main(String args[])
    {
        constructor_chaining cc1 = new constructor_chaining(10,10,10,10);
    }

}
