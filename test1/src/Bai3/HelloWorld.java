package Bai3;

public class HelloWorld {
    public static void main(String []args) {
        elapsedTime();
     }
     public static void elapsedTime() {
        long t1, t2;
        t1 = System.nanoTime();
        for (int i = 0; i < 10000000; i++) {
            fib(11);
        }
        t2 = System.nanoTime();
        System.out.println("Running time = " + ((t2 - t1) / 1000000) + "ms");
    }
    public static long fib(long n) {
    	int f0 = 0;
        int f1 = 1;
        int fn = 1;
 
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }

}
