import java.util.Scanner;

public class CtoFTableDisplay {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double cToF = 0.0;

        cToF = CtoF(in, "What is the temperature in Celsius?");
        System.out.print("The Converted temperature in Fahrenheit is: " + cToF);
        System.out.println("\nCelsius\tFahrenheit");
        System.out.println("--------------------");
        for(int tempC = -100; tempC <= 100; tempC++){
            double tempF = (tempC * 9.0 / 5.0) + 32;
            System.out.printf("%d\t\t%.2f%n", tempC, tempF);
        }
    }

    /**
     * Converts C to F and ensures a valid entry
     * @param pipe a Scanner for input from user
     * @param prompt prompt to indicate what to input
     * @return converted farenheit value from celsius
     */
    private static double CtoF(Scanner pipe, String prompt){
        double c = 0.0;
        double f = 0.0;
        String trash = "";
        boolean done = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble()){
                c = pipe.nextDouble();
                pipe.nextLine();
                f = (c * 9/5) + 32;
                done = true;
            }else {
                trash=pipe.nextLine();
                System.out.print("\nYou said the temperature is: " + trash);
                System.out.println("You must enter a valid temperature");
                done=false;
            }

        }while(!done);
        return f;
    }
}
