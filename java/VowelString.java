class VowelString{
    public static void main(String[] args){
        String str = "fsoibkgsdlweuwefoAJSRCBCI";
        int count = 0;
        for(int i = 0; i<str.length(); i++){
            switch(str.charAt(i)){
                case 'a' :
                case 'e' :
                case 'i' :
                case 'o' :
                case 'u' :
                case 'A' :
                case 'E' :
                case 'I' :
                case 'O' :
                case 'U' :
                count++;
                default:

            }
        }
        System.out.println(count);
    }
}