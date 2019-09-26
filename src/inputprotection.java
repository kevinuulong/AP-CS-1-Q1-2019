import java.util.Scanner;

/**
 * inputprotection
 */
public class inputprotection {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int output = 0;
        System.out.print("Enter an Integer: ");
        String in = input.nextLine();
        System.out.println("You said: "+in);

        input.close();
    }
}