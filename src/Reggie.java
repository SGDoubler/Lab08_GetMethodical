import java.util.Scanner;

public class Reggie {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String SSN = "";
        String userID = "";
        String menu = "O - Open S - Save V - View Q - Quit";

        SSN = SafeInput.getRegExString(in,"What is your SSN?","^\\d{3}-\\d{2}-\\d{4}$");
        userID = SafeInput.getRegExString(in,"What is your UC User ID?", "^(M|m)\\d{5}$");
        menu = SafeInput.getRegExString(in,"What option would you like [O]pen, [S]ave, [V]iew, [Q]uit?","^[OoSsVvQq]$");

        System.out.print("\nYour SSN is: " + SSN);
        System.out.print("\nYour userID is: " + userID);
        if (menu.equalsIgnoreCase("O")){
            System.out.println("\nYour menu choice was chose Open");
        } else if (menu.equalsIgnoreCase("S")) {
            System.out.println("\nYour menu choice was Save");
        } else if (menu.equalsIgnoreCase("V")) {
            System.out.println("\nYour menu choice was View");
        }else {
            System.out.println("\nYour menu choice was Quit");
        }

    }
}
