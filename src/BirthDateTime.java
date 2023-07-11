import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        int birthDate = 0;
        int birthHours = 0;
        int birthMin = 0;
        birthMonth = SafeInput.getRangedInt(in, "What is your birth month [1-12]", 1,12);
        in.nextLine();
        if (birthMonth == 1 || birthMonth == 3 || birthMonth == 5 || birthMonth == 7 || birthMonth == 8 || birthMonth == 10 || birthMonth == 12)
        {
            birthDate = SafeInput.getRangedInt(in, "What is your date of birth? [1-31]",1,31);
            in.nextLine();
        } else if (birthMonth == 4 || birthMonth ==6 || birthMonth == 9 || birthMonth == 11) {
            birthDate = SafeInput.getRangedInt(in,"what is your date of birth? [1-31]", 1,30);
            in.nextLine();
        }else {
            birthDate = SafeInput.getRangedInt(in,"what is your date of birth? [1-31]", 1,28);
            in.nextLine();
        }
        birthHours = SafeInput.getRangedInt(in,"What hour were you born [1-24]",1,24);
        in.nextLine();
        birthMin = SafeInput.getRangedInt(in,"How many minutes past the hour were you born [1-59]",1,59);
        in.nextLine();

        System.out.print("\n You were born on: " + birthMonth + "-" + birthDate + " at " + birthHours + ":" + birthMin);
    }
}
