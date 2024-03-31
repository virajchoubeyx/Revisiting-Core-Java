class A{
    // this is the class
    A(){
        // this is constructor
        System.out.println("this is constructor");
    }

    public static void main(String[] args) {
        // main method
        System.out.println("Hello World");
        // now going to execute the constructor.
        new A();
    }
}