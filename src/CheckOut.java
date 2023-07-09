import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);



        boolean shop_more = SafeInput.getYNConfirm(in, "Wants to continue Shopping");

        double sumOfItems = 0;

        while (shop_more) {

            double price = SafeInput.getRangedDouble(in, "Enter price", 0.50, 10.00);

            sumOfItems += price;

            shop_more = SafeInput.getYNConfirm(in, "Wants to continue Shopping");

        }



        System.out.printf("Total cost :%.2f", sumOfItems);



    }
}
