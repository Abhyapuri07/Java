class atm{
    private int a;
    public void setRupees(int a){
        this.a=a;
    }
    public int getRupees(){
        return a;
    }
}
class ATM1{
    public static void main(String[] args){
        atm obj = new atm();
        obj.setRupees(501);
        System.out.println(obj.getRupees());
    }
}