public class TrailorsZero {
    //finding the number of trailing zeros in N!
//example 5!=120 output=1 it has only one zero66 {
    public static void main(String[] args) {
        int n=100;
        int fact=1;
        int count=0;
        int res;
        for(int i=1;i<=n;i++){
            fact=fact*i;
            //System.out.println(fact);
        }
        while(fact>0){
            res=fact%10;
            if(res==0){
                count++;
        }
       fact=fact/10;
        }
        System.out.println(count);
    }

}
