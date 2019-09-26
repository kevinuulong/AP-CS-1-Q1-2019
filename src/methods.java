import java.util.Scanner;

public class methods{
    public static void main(String[] args) {
        System.out.println(prompt("Say your name"));
    }
    public static int add(int x, int y){
        return x+y;
    }

    public static double square(double a, double b){
        double output = 0;
        output = Math.pow(a, b);
        return output;
    }

    public static String prompt(String instruction){
        System.out.println(instruction+":");
        Scanner input = new Scanner(System.in);
        String uinput = input.nextLine();
        input.close();
        return uinput;

        

    }

    
}