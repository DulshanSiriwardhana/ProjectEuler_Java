public class P002 {
    int sum=0;

    public int fibonaci(int n){
        if(n==1 || n==0){
            return 1;
        }
        return fibonaci(n-1)+fibonaci(n-2);
    }

    public void run(){
        int x=0;
        while (true){
            x++;
            int fib=fibonaci(x);
            if(fib>4000000){
                System.out.println(sum);
                return;
            }
            if(fib%2==0){
                sum+=fib;
            }
        }
    }
}
