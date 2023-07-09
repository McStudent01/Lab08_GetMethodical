import java.util.Scanner;


public class Reggie {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(in, "Enter your SSN", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("SSN recieved:" + ssn);

        String ucStudentMNo = SafeInput.getRegExString(in, "Enter your UC student M number", "(M|m)\\d{5}");
        System.out.println("UC student M number recieved:" + ucStudentMNo);

        String menuChoice = SafeInput.getRegExString(in, "Enter your menu choice", "[OoSsVvQq]");
        System.out.println("Menu choice recieved:" + menuChoice);
    }
}
