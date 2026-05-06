import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
        System.out.println("Enter the value");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int count=0;
        //int divs;
        for(int i=1;i<=n;i++){
            if(n%i==0){
            //System.out.println(i);
    if(i%3==0){
        count++;
        }
            }
        }
        System.out.println(count);
        }
        }
    

