public class Swap {
    public static void main(String[] args) {

        int a = 123;
        int b = 526;
        System.out.println("Before swap : a, b ="+a+","+ + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap : a, b = "+a+","+ + b);




    }
}
