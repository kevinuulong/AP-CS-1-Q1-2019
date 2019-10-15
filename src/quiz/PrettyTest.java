package quiz;

public class PrettyTest {
    public static void main(String[] args) {
        Pretty p = new Pretty("Hello, world!");
        System.out.println(p.underline());
        System.out.println(p.box());
        System.out.println(p);
    }
}
