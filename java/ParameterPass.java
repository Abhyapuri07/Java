class ParameterPass{
    static void Sum(int a){
        int sum = 0;
        for(int i=a; i>0;){
            int digit = i%10;
            sum = sum + digit;
            i = i/10;
            
        }
        System.out.println(sum);

    }
    public static void main(String[] args){
            Sum(123);
    }
}