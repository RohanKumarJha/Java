class A {
    public void show() {
        System.out.println("This is Parent class");
    }
}
class B extends A {
    @Override
    public void show() {
        System.out.println("This is Child class");
    }
}

public class Annotations {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}