
import java.util.Scanner;

/**
 *
 * @author wulft
 */
public class SafeInput 
{
    public static int getRangedInt(Scanner pipe, String prompt, int lo, int hi)
    {
        int result = 0;
        boolean done = false;
        String trash = "";
        do
        {            
            // Code and control logic to loop until validated
            System.out.print(prompt + "[" + lo + " - " + hi + "]: ");
            if(pipe.hasNextInt())
            {
                result = pipe.nextInt();
                pipe.nextLine(); // clear input buffer
                if(result >= lo && result <= hi)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a value in range [" + lo + " - " + hi + "]: " + result);
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must entedr an int [" + lo + " - " + hi + "]: " + trash);
            }
       
        }while(!done);
        
        return result;
    } 
}
