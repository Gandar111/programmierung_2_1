public class Pyramid implements Nennung, interface_2 {
    public String name_;
    Double breite, length;
    public Pyramid(String name_, double length, double breite){
        this.name_=name_;
        this.breite= breite;
        this.length=length;
    }

    @Override
    public void getName() {
        System.out.println(" Die Area von "+name_+" ist: "+area());
    }

    @Override
    public double area() {
        return length*breite;
    }
}
