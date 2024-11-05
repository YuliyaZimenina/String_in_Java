public class StringDemo {
    public static void main(String[] args) {
        //Different ways to declare Strings
        String firstString = new String("Strings in Java are objects.");
        String secondString = "They are created in different ways.";
        String thirdString = new String(secondString);

        System.out.println(firstString);
        System.out.println(secondString);
        System.out.println(thirdString);

    }
}