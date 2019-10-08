public class recursion {
    public static void main(String[] args) {
        //countdown(10);
        //countup(10);
        System.out.println(fib(5));
    }

    public static void countdown(int n){
        if (n>=0){
            System.out.println(n);
            countdown(n-1);
        }
    }
    public static void countup(int n){
        if (n>=0){
            countup(n-1);
            System.out.println(n);
        }
    }
    public static int factorial(int n){
        int output = 1;
        for (int i = 1; i<=n;i++){
            output*=i;
        }
        return output;
    }
    public static int rfactorial(int n){
        return n == 0 ? 1 : n*rfactorial(n-1);
    }
    public static int fib(int a){
        return a <= 1 ? a : fib(a-1)+fib(a-2);
    }
}
