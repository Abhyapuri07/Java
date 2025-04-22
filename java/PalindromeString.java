class PalindromeString{
    public static void main(String[] args){
        String str = "hello";
        String str1 = "";
        for(int i=str.length()-1; i>=0; i--){
            str1+=str.charAt(i);
        }
        if(str==str1){
            System.out.println("Palindrome");
            }
        else{
            System.out.println("Not Palindrome");
        }
        }
    }
