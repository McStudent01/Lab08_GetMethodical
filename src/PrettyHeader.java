import java.util.Scanner;
public class PrettyHeader
{
    public static void main(String[] args)
    {
        String msg = "Message Centered Here";

        for(int i =0;i<60;i++)
        {
            System.out.print("*");
        }

        System.out.print("\n");
        System.out.print("***");

        int firstHalf = (54-msg.length())/2;
        int secondHalf = 0;

        if(msg.length()%2==0)
        {
            secondHalf = (54-msg.length())/2;
        }
        else
        {
            secondHalf = 1+(54-msg.length())/2;
        }
        for(int i =0;i<firstHalf;i++)
        {
            System.out.print(" ");
        }
        System.out.print(msg);
        for(int i =0;i<secondHalf;i++)
        {
            System.out.print(" ");
        }
        System.out.println("***");
        for(int i =0;i<60;i++)
        {
            System.out.print("*");
        }
    }
}