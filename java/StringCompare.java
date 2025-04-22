class StringCompare{
    public static void main(String[] args){
        String str1 = "hellow";
        String str2 = "yellow";
        int count = 0;
        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i)==str2.charAt(i))
               count++;
        }
        System.out.println(count);
    }
}