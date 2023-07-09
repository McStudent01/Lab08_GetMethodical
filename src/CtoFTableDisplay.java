public class CtoFTableDisplay
{
    public static double CtoF(double celsius)
    {
        return (celsius * 9.0) / 5.0 + 32.0;
    }
    public static void main(String[] args) {
        int celsius = -100;
        while (celsius <= 100) {
            int fahrenheit = (int) Math.round(CtoF(celsius));
            System.out.printf("%d\t%d\n", celsius, fahrenheit);
            celsius++;
        }
    }
}
