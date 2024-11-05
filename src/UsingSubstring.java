public class UsingSubstring {
    public static void main(String[] args) {
        String originalString = "Java is the engine of progress in development";
        // Create a substring from a String object
        String subStringFromString = originalString.substring(12, 30);
        System.out.println("Original string: " + originalString);
        System.out.println("Substring: " + subStringFromString);
    }
}
