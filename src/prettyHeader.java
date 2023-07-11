import java.util.Scanner;

public class prettyHeader {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("What is your Message?");
        String msg = in.nextLine();
        String msgWHeader = SafeInput.prettyHeader(in, msg);
        System.out.print(msgWHeader);
    }
}
