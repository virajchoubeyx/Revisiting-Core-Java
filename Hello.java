class A{
    // this is the class

    int x; // this is instance level variable
    static int y; // this is the class level/static variable
    // both are global variables. (by default assigned value is 0)

    A(){
        // this is constructor
        System.out.println("this is constructor");
    }

    public static void main(String[] args) {
        // main method
        System.out.println("Hello World");
        // now going to execute the constructor.
        new A();

        int z = 10; // instance level local variable
        System.out.println(z);
        // can't make static variable here
    }
}