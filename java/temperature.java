class temp{
    private double celsius;
    public void setcelsius(int celsius){
        this.celsius=celsius;
    }

    public double getcelsius(){
        return celsius;
    }

    public double toFahrenheit(){
        return (celsius*9/5)+32;
    }
}

class temperature{
    public static void main(String[] args){
        temp obj = new temp();
        obj.setcelsius(23);
        System.out.println(obj.getcelsius());
        System.out.println(obj.toFahrenheit());
    }
}