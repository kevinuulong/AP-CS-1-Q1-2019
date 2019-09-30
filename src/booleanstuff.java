//import org.graalvm.compiler.core.common.type.ArithmeticOpTable.BinaryOp.Xor;

/**
 * booleanstuff
 */
public class booleanstuff {

    public static void main(String[] args) {
        //System.out.println("Truth Table");
        boolean x, y;
        x = false;
        y = true;
        System.out.println(xor(x, y));

        for (int i = 0; i < 10; i++) {
            double j = Math.floor(Math.random()*10000)/100;
            System.out.println(j);
            System.out.println(lettergrade(j));
        }
        /*
        System.out.println("x   \t| y \t| x&&y  | x||y  | !=x   | !y    | !x||!y");
        System.out.println("---------------------------------------------------------");
        x = false;
        y = false;

        System.out.println(x+"\t| "+(y)+"\t| "+(x&&y)+"\t| "+(x||y)+"\t| "+(!x)+"\t| "+(!y)+"\t|"+(!x||!y));
        x = true;
        y = false;

        System.out.println(x+"\t| "+(y)+"\t| "+(x&&y)+"\t| "+(x||y)+"\t| "+(!x)+"\t| "+(!y)+"\t|"+(!x||!y));

        x = false;
        y = true;

        System.out.println(x+"\t| "+(y)+"\t| "+(x&&y)+"\t| "+(x||y)+"\t| "+(!x)+"\t| "+(!y)+"\t|"+(!x||!y));

        x = true;
        y = true;

        System.out.println(x+"\t| "+(y)+"\t| "+(x&&y)+"\t| "+(x||y)+"\t| "+(!x)+"\t| "+(!y)+"\t|"+(!x||!y));
        */
        /*double x = 0.7;
        double y = 0.9;
        x += 0.1;
        y -= 0.1;
        System.out.println(x==y);
        double tol = 1.0E-5;
        equals(x,y,tol);
        System.out.println(x==y);*/

    }

    public static boolean equals(double x, double y, double tolerance) {
        return Math.abs(x - y) <= tolerance;
    }

    public static boolean xor(boolean x, boolean y) {
        return (x || y) && !(x || y);
    }

    public static char lettergrade(double percent){
        if ((int)percent>=89.5){
            return 'A';
        } else if((int)percent>=79.5){
            return 'B';
        } else if((int)percent>=69.5){
            return 'C';
        } else if((int)percent>=59.5){
            return 'D';
        } else {
            return 'F';
        }
    }
}