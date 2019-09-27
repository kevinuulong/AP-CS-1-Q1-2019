import java.util.Random;

/**
 * wrapper
 */
public class wrapper {

    public static void main(String[] args) {
        Integer myint = new Integer(2);
        Boolean bool = new Boolean(false);
        System.out.println(myint);
        System.out.println(bool);
    }
    public static int randInt(int a, int b){
        return (int) Math.floor(Math.random()*(b-a+1));
    }
}