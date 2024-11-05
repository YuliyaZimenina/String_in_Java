// Demonstration of using an array of strings

public class ArraysOfStrings {
    public static void main(String[] args) {
        String [] arrayOfStrings = {"This content", "is", "just", "a test."};
        System.out.println("Original array:" );
        for (String s : arrayOfStrings)
            System.out.print(s + " ");
        System.out.println("\n");

        //Changing strings
        arrayOfStrings[1] = "became";
        arrayOfStrings[3] = "another test";
        System.out.println("Modified array: ");
        for (String s : arrayOfStrings)
            System.out.print(s + " ");
    }
}
