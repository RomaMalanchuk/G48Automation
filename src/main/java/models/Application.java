package models;

public class Application {
    public static void main(String[] args) {
        A a_class = new A();
        B b_class = new B();
        b_class.my_method(a_class.my_method());
    }
}
