import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        // Testing getNonZeroLenString

        Scanner nonZeroTest = new Scanner(System.in);
        String testGetNonZero = "";
        testGetNonZero = SafeInput.getNonZeroLenString(nonZeroTest, "Enter your name");
        System.out.println("Your name is: " + testGetNonZero);


        // Testing getInt method
        Scanner intTest = new Scanner(System.in);
        int testInt = 0;
        testInt = SafeInput.getInt(intTest, "Enter a number");
        System.out.println("The integer you put in is: " + testInt);

       // Testing getDouble method

        Scanner doubleTest = new Scanner(System.in);
        double testDouble = 0.0;
        testDouble = SafeInput.getDouble(doubleTest, "Enter a double number");
        System.out.println("The double number you put in is: " + testDouble);

        // Testing getRangedInt method

        Scanner rangedIntTest = new Scanner(System.in);
        int testRangedInt = 0;
        testRangedInt = SafeInput.getRangedInt(rangedIntTest, "Enter a number between 4 - 142", 4, 142);
        System.out.println("The integer you entered is: " + testRangedInt);

        // Testing getRangedDouble

        Scanner rangedDoubleTest = new Scanner(System.in);
        double testRangedDouble = 0.0;
        testRangedDouble = SafeInput.getRangedDouble(rangedDoubleTest, "Enter a double between 2.3 - 4.7",2.3, 4.7);
        System.out.println("The double integer you entered is: " + testRangedDouble);

        // Testing getYNConfirm method

        Scanner getYNConfirmTest = new Scanner(System.in);
        boolean yNContinue = SafeInput.getYNConfirm(getYNConfirmTest, "Do you want to continue? [Y or N]");
        System.out.print("You chose to continue: " + yNContinue);


        // Testing getRegEx method

        Scanner getRegExPatternTest = new Scanner(System.in);
        String testGetRegExPattern = "";
        testGetRegExPattern = SafeInput.getRegExString(getRegExPatternTest, "\n Enter your phone number", "\\d{3}-\\d{3}-\\d{4}");
        System.out.println("You entered: " + testGetRegExPattern);
    }
}