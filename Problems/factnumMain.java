class factnum {
    // Function to calculate factorial of a number.
    int factorial(int n) {
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
        
    }
}
class factnumMain {
public static void main(String[] args) {
    factnum obj=new factnum();
       int result=obj.factorial(7);
        System.out.print("The factorial of 7 is"+result);
}
}

