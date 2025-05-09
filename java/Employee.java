class EMP{
    private int id;
    private String name;
    private int salary;

    public void setid(int id){
        this.id=id;
    }
    public int getid(){
        return id;
    }


    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }


    public void setsalary(int salary){
        this.salary=salary;
    }
    public int getsalary(){
        return salary;
    }
}

class Employee{
    public static void main(String[] args){
        EMP obj = new EMP();
        obj.setid(123);
        obj.setname("Abhya");
        obj.setsalary(55000);
        System.out.println(obj.getid());
        System.out.println(obj.getname());
        System.out.println(obj.getsalary());
    }
}