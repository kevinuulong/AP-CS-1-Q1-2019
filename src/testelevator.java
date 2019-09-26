public class testelevator{
    public static void main(String[] args) {
        elevator e1 = new elevator();
        System.out.println(e1);
        elevator e2 = new elevator(1, false, true, false);
        System.out.println(e2);
    }
}