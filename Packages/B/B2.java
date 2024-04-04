package Packages.B;
import Packages.A.*;

class C extends A{
    public static void main(String[] args) {
        C obj = new C();

        System.out.println(obj.x);
        // -- 
        obj.add();
        // 
        obj.pro();
    }
}

