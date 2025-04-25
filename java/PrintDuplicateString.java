class PrintDuplicateString{
    public static void main(String[] args){
        String str = "hellloooo";
        String newStr= "";
        //char[] ch = str.toCharArray();
        for(int i =0; i<str.length() ; i++){
            char ch= str.charAt(i);
            if(newStr.indexOf(ch)==-1){
                newStr=newStr+ch;
            }
        }
        System.out.print(newStr);
    }
 }