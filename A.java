import java.util.Scanner;

class A{
    A(int x){
        // this is the custom constructor which has parameter in it.
        System.out.println("constructor made by me - "+ x);
    }

    public static void main(String[] args) {
        // main method
        // A obj = new A(); // error - constructor A() is undefined.

        new A(25); // working
        // 
        Scanner sc = new Scanner(System.in);
    }
}
