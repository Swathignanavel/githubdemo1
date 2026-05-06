/*class Palindrome {
    public static void main(String[] args) {
       int n = 52342;
       while(n>0){
           rev=rev*10+(n%10);
           n=n/10;
       }
       if(rev==x){
           System.out.println("Palindrome");
       } else{
           System.out.println("Not Palindrome");
       }
    }
}*/
class Palindrome {
    public static void main(String[] args) {
        int n=6776;
        int num=n;
        int sum=0;
        while(n>0){
            int ld=n%10;
            sum=sum*10+(ld);
            n=n/10;
        }
        if(sum==num){
            System.out.println("it is an palindrome");
        }
        else{
            System.out.println("it is not an palindrome");
        }
        }
        }