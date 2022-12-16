import java.util.Arrays;

public class Circle extends eltern {
    public final double radius;

    public Circle(double radius) {
        super("Circle");

        this.radius = radius;
    }

    @Override
    public void func() {
        System.out.println(" Berechne folgende Sachen: ");
    }

    @Override
    public double getarea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getprimeter() {
        return 2*Math.PI*radius;}
    public void print_2(eltern[] arr){
        for (eltern s:arr) {
            s.func();
        }
    }

    public static void main(String[] args) {
       eltern [] shape= new eltern[2];
       shape[0]= new kind_1("t",44,5);
       shape[1]= new Circle(6);
        System.out.println(shape[0]);


    }

}
