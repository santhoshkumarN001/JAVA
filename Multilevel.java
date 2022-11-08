class Multilevel {
    
    public static void main(String[] args) throws   Exception {
        Color d = new Color();
        d.cl("red");
        d.read("audi");
        d.rate(30000000);
    }
}
class Car extends Multilevel{
    void read(String s){
        
        System.err.println("Reading ="+ s);
    }
}
class Price extends Car{
    void rate(int s){
        System.err.println("rate =" + s);
    }
}
class Color extends Price{
    void cl(String s){
        System.err.println("Color ="+s);   
    }
}
