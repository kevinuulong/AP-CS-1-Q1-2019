//import org.graalvm.compiler.core.common.type.ArithmeticOpTable.BinaryOp.Xor;

/**
 * booleanstuff
 */
public class booleanstuff {

    public static void main(String[] args) {
        System.out.println("Truth Table");
        boolean x, y;
        x = false;
        y = true;
        System.out.println(xor(x, y));
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
    /*    if (x||y) {
            if (x&&y) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }*/
        return (x || y) && !(x || y);
    }
}