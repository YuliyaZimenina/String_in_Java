// Demonstration of some string operations

public class StringOperations {
    public static void main(String[] args) {
        String firstString = "In the field of web application programming, " +
                "Java language ranks first";
        String secondString = new String(firstString);
        String thirdString = "Strings in Java sre extremely efficient";
        int result, index;
        char ch;

        System.out.println("The length of firstString is: " + firstString.length());
        // Display firstString character by character
        for (int i = 0; i < firstString.length(); i++)
            System.out.print(firstString.charAt(i) + " / ");
        System.out.println();

        //String comparison
        if (firstString.equals(secondString)) {
            System.out.println("The firsString is equal the secondString");
        } else {
            System.out.println("The firstString isn't equal the secondString");
        }

        System.out.println();

        if (firstString.equals(thirdString)) {
            System.out.println("The firsString is equal the thirdString");
        } else {
            System.out.println("The firsString isn't equal the thirdString");
        }

        System.out.println();

        result = firstString.compareTo(thirdString);
        if (result == 0){
            System.out.println("The firsString is equal the thirdString");
        }else if(result < 0){
            System.out.println("The firsString is less than the thirdString");
        }else {
            System.out.println("The firsString is greater than the thirdString");
        }

        System.out.println();

        //Assigning a new value to the secondString
        secondString = "One Two Three One Zero Five";
        //Finding the index of occurrence of a substring in a string
        index = secondString.indexOf("One");
        System.out.println("The index of first occurrence of substring One: " + index);
        System.out.println();
        index = secondString.lastIndexOf("One");
        System.out.println("The index of last occurrence of substring One: " + index);
    }
}
