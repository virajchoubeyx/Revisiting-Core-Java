package Inheritance;

import java.util.Scanner;

public class B extends A{

    B(){
        System.out.println("In constructor B");
    }
    public static void main(String[] args) {
        // B obj = new B();
        Scanner sc = new Scanner(System.in);
        boolean ans = checknumiseven(sc.nextInt());
        System.out.println(ans);
        sc.close();
        // -- now calling constructor
        new B();
        // output
        // 8 is even?
        // true
        // In constructor A
        // In constructor B
    }
}
