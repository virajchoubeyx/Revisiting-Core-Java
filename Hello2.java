// import java.lang.*;
// import java.util.Scanner;

class B{
// this is another class B

    B(){
        // this is constructor
        System.out.println("inside constructor");
    }

    void pro(){
        // a method which is instance level
        System.out.println("method pro- instance method");
    }

    static void add(){
        // a method which is class level or static method
        System.out.println("method add - static method");
    }

    public static void main(String Coolagrs[]){
        // yes you can play with parameter name, it is just a normal array
        
        B obj = new B(); // object is created to refer the other members of a class

        // Error - will come when non-static method will be called directly with class name.
        // pro(); error: non-static method pro() cannot be referenced from a static context

        obj.pro(); // is the right way to call

        add(); // can be called directly coz it's static method
    }
}
