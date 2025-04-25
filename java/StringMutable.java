class StringMutable{
    public static void main(String[] args){
        StringBuilder str = new StringBuilder("hello");
        System.out.println(str);
        System.out.println(str.capacity());
        str.append("hiiiihsdgospwglksgkjdfusgwegifmsdh");
        System.out.println(str);
        System.out.println(str.capacity());
    }
}