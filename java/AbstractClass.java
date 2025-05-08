abstract class Payment{
    abstract void pay(int a);
    void print(){
        System.out.println("payment done");
    }
}
    class upipayment extends Payment{
        void pay(int a){
            System.out.println("payment done via upi " + a);
        }
    }

class CardPayment extends Payment{
    void pay(int a){
        System.out.println("payment done via card " + a);
        }
}


class AbstractClass{
    public static void main(String[] args){
        Payment obj = new upipayment();
        obj.pay(5000);
        obj.print();
        Payment obj1 = new CardPayment();
        obj1.pay(11000);
        obj1.print();
       
    }
}