public class VowelCheck {
    public static void main(String[] args) {
        String str = "Apple";
        if (!str.isEmpty()) {
            char firstChar = Character.toLowerCase(str.charAt(0));
            if ("aeiou".indexOf(firstChar) != -1) {
                System.out.println("Starts with Vowel");
            } else {
                System.out.println("Does not start with Vowel");
            }
        } else {
            System.out.println("Invalid string!");
        }
    }
}
