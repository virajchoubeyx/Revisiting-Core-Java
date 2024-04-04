class Student{
    String name;
    int age;
    static int minage = 10;

    Student(){
        minage = 25;
    }
    public static void main(String[] args) {
        minage = 18;
        System.out.println(new Student().age); // 0
        System.out.println(new Student().name); // null
        System.out.println(minage);
    }
}