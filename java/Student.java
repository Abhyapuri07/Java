class XYZ{
    private String name;
    private int marks;
    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    public void setmarks(int marks){
        this.marks=marks;
    }
    public int getmarks(){
        return marks;
    }
}

class Student{
    public static void main(String[] args){
    XYZ obj= new XYZ();
        obj.setname("Abhya");
        obj.setmarks(700);
        System.out.println(obj.getname());
        System.out.println(obj.getmarks());
    }
}