import java.util.Scanner;

public class SafeInput
{

    /**
     * Get a String which contains at least one character
     * @param pipe   The Scanner opened to read System.in
     * @param prompt The prompt for the user.
     * @return a String respnse that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";
        do
        {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0); // until we have some characters

        return retString;
    }
    /**
     * Get an int value within a specified numeric range
     * @param pipe - Scanner instance to read the data System.in in most cases
     * @param prompt - input prompt msg should not include range info
     */
}