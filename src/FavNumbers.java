import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int favNumber = 0;
        double favDouble = 0;
        favNumber = SafeInput.getInt(in, "Enter your favorite number");
        System.out.println("your favorite number is: " + favNumber);
        in.nextLine();
        favDouble = SafeInput.getDouble(in, "Enter your favorite double number");
        System.out.println("Your favorite double number is: " + favDouble);

    }
}
