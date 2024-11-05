// Using strings to control a switch statement
public class StringAndSwitch {
    public static void main(String[] args) {
        String command = "Cancel";
        switch (command){
            case "Connect":
                System.out.println("Connect");
                break;
            case "Cancel":
                System.out.println("Cancel");
                break;
            case "Disconnect":
                System.out.println("Disconnect");
                break;
            default:
                System.out.println("Wrong command!");
                break;
        }
    }
}
