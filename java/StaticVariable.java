class StaticVariable{
     static int a = 29;
    public static void main(String[] args){
        System.out.println(a);
        System.out.println(StaticVariable.a);
        StaticVariable obj = new StaticVariable();
        System.out.println(obj.a);
    }
}