public class PerfectSquare{
    public static void main(String[] args){
        int n=10000000;

        int count=0;
        for(int i=1;i*i<n;i++){
        
            count++;
        } 
        System.out.println(count);
    
}
}
