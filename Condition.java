public class Condition {
    public static void main(String[] args) {
        int mark = 42;
        if (mark >= 90) {
            System.out.println("A grade");
        } else {
            if (mark >= 40) {
                System.out.println("B grade");
            } else {
                System.out.println("C grade");
            }
        }
    }

}
