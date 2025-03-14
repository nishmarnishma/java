public class VowelCheck2 {
    public static void main(String[] args) {
        String str = "Dog";
        if (!str.isEmpty()) {
            char firstChar = Character.toLowerCase(str.charAt(0));
            if ("aeiou".indexOf(firstChar) != -1) {
                System.out.println("Starts with a Vowel");
            } else {
                System.out.println("Does not start with vowel");
            }
        } else {
            System.out.println("Invalid input!");
        }
    }
}
