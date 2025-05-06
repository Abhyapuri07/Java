class ConstructorChaining{
    ConstructorChaining(){
        System.out.println("mai hu naa!!!");
    }
    ConstructorChaining(int a){
        this();
        System.out.println(a);
    }
    ConstructorChaining(int a, int b){
        this(5);
        System.out.println(a+b);
    }
}
class Cons{
    public static void main(String[] args){
        ConstructorChaining obj = new ConstructorChaining(5,10);
    }
}