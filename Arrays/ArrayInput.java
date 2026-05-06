import java.util.Scanner;
class ArrayInput {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("the elements are");
            arr[i]=scan.nextInt();
        }
         for(int i=0;i<n;i++){
              System.out.print("the output elements are");
             
        System.out.println(arr[i]);
    }
    }
}
    

