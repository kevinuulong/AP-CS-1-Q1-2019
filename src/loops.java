/**
 * loops
 */
public class loops {

    public static void main(String[] args) {
        /*int j = 1;
        while (j <= 20) {
            System.out.println(j);
            j++;
        }

        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }
        */
        
        /*for (int i = -5; i <= 30; i++) {
            System.out.println("2^"+i+"=" + power(2,i));
        }*/
        /*System.out.println(max(4,1));
        String a = "ABC";
        String b = "CDE";*/

        //System.out.println(a.compareTo(b));

        triangle(1000);
        System.out.println(factorial(13));
}
    public static double power(int b, int x){
        double output = 1;
        if (x>=0) {
            //output = Math.pow(b,x);
            for (int i = 0; i < x; i++) {
                output *= b;
            }
        } else {
            for (int j = 0; j > x; j--) {
                output /= b;
            }
        }
        return output;
    }
    public static int max(int a, int b){
        if(a>b){
            return a;
        } else if(b>a){
            return b;
        } else{
            return 0;
        }
    }

    public static int min(int a, int b){
        if(a>b){
            return b;
        } else if(b>a){
            return a;
        } else{
            return 0;
        }
    }

    public static String rps(String a, String b){
        switch (a) {
            case "rock":
                if(b.equals("rock")){
                    return "tie"; 
                } else if(b.equals("paper")){
                    return "b wins";
                } else if(b.equals("scissors")){
                    return "b wins";
                } else{
                    return "error";
                }
            case "paper":
                if(b.equals("rock")){
                    return "a wins"; 
                } else if(b.equals("paper")){
                    return "tie";
                } else if(b.equals("scissors")){
                    return "a wins";
                } else{
                    return "error";
                }
            case "scissors":
                if(b.equals("rock")){
                    return "b wins"; 
                } else if(b.equals("paper")){
                    return "a wins";
                } else if(b.equals("scissors")){
                    return "tie";
                } else{
                    return "error";
                }
        
            default:
                break;
        }
        return "error";
    }

    public static void triangle(int n){
        System.out.println((n*(n+1)/2));
    }

    public static double factorial(double n){
        double output = 1;
        for (int i = 1; i < n; i++){
            output *= i;
        }
        return output;
    }
}