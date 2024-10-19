            // BASIC WAY
// interface A {
//     public void show();
// }

// class B implements A {
//     public void show() {
//         System.out.println("This is child class");
//     }
// }

// public class FunctionalInterface {
//     public static void main(String[] args) {
//         A obj = new B();
//         obj.show();
//     }
// }

                // BASIC WAY
interface A {
    public void show();
}

public class FunctionalInterface {
    public static void main(String[] args) {
        A obj = new A() 
        {
            public void show() {
                System.out.println("This is the advance way to write function interface");
            }
        };
        obj.show();
    }
}