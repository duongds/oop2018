package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        if(b==0) return a;
        return gcd(b,a%b);
        // TODO: Tim ucln 2 so a,
    }

    /**
     *
     * @param n
     * @return
     */
    public static int fibonacci(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        else return fibonacci(n-1) +fibonacci(n-2);
        // TODO: Tim so fibonacci thu n
    }
    public static void main(String Args[]){
        System.out.println(gcd(5,3));
        System.out.println(fibonacci(6));
    }
}
