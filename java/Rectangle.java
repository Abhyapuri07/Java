class Shape{
    private int length;
    private int breadth;

    public void setlength(int length){
        this.length=length;
    }
    public int getlength(){
        return length;
    }

    public void setbreadth(int breadth){
        this.breadth=breadth;
    }
    public int getbreadth(){
        return breadth;
    }


    public int area(){
        return length*breadth;
    }
}



    class Rectangle{
        public static void main(String[] args){
            Shape obj = new Shape();
            obj.setlength(23);
            obj.setbreadth(6);
            System.out.println(obj.getlength());
            System.out.println(obj.getbreadth());
            System.out.println(obj.area());
        }
    }