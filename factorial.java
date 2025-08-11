public  class factorial{
    public static void main(String[] args){
        int n = 5;
        int c=1;
        if (n==0 || n==1){
            System.out.println(1);
        }
        else{
            for (int i =1;i<n;i++){
                c += c*i;
            }
        }
        System.out.println("factorial :"+c);
    }
}