public class OddNumSeries {
    public static void main(String[] args){
        int n=5;
        int sum=0;
        int count=0;
        for(int i=1;i<=2*n-1;i++){
            if(i%2!=0){
                sum=sum+i;
                count=count+sum;
            }
        }
        System.out.println(count);
    }
    
}

    

