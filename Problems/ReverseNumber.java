class ReverseNumber {
    public static void main(String[] args) {
        int n=54321;
        int revnum=0;
        while(n>0){
            int ld=n%10;
            revnum=revnum*10+(ld);
            n=n/10;
        }
        System.out.println("Reversed number: " + revnum);
    }
}