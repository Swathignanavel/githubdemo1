public class PerfectNum {
    public static void main(String[] args){
        int n=46;
        int sum=1;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                sum=sum+i;
            }
            if(n/i!=i){
                sum=sum+(n/i);}
                    }
                if(sum==n){
                    System.err.println("perfect num");
                }  
                else{
                    System.out.println("not a perfect num");
                }
            }
}
   

    
