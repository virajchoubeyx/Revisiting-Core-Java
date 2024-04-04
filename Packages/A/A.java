package Packages.A;
import Packages.B.B;

public class A extends B{

    public void pro(){
        System.out.println("method in A");
    }
    public static void main(String[] args) {
        System.out.println("Hello"+ new A().x);
    }
}
