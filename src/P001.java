public class P001 {
    private int sum=0;
    public void run(){
        for(int i=1;i<1000;i++){
            if(i%3==0 || i%5==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
