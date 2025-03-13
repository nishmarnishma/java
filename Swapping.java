public class Swapping {
    public static void main(String[] args) {
        int a = 20;
        int b = 40;
        System.out.println("Before Swapping:");
        System.out.println("Value of a is" + a);
        System.out.println("Value of b is" + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping:");
        System.out.println("Value of a is" + a);
        System.out.println("Value of b is" + b);
    }
}
