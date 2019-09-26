import java.util.*;

public class NightOut
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double total = 0.00;
        
        System.out.println("How much did dinner cost?");
        total = input.nextDouble();
        
        System.out.println("How much is mini-golf for one person>");
        total += input.nextDouble()*2;
        
        System.out.println("How much was dessert?");
        total += input.nextDouble();
        
        System.out.println("Grand Total: $"+total);
    }
}
