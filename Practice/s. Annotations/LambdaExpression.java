interface A {
    public int add(int a,int b);
}

public class LambdaExpression {
    public static void main(String[] args) {
        A obj = (a,b) -> a+b;
        System.out.println(obj.add(3, 2));
    }
}
