public class kind_1 extends eltern {
    public double width, height;
    public kind_1(String feld_1, double height, double width) {
        super(feld_1);
        this.height=height;
        this.width=width;
    }

    @Override
    public void func() {

    }

    @Override
    public double getarea() {
        return width*height;
    }

    @Override
    public double getprimeter() {
        return 2*(width+height);
    }


    public static void main(String[] args) {
        kind_1 objekt = new kind_1("d",3,4);
        objekt.print();
        System.out.println(objekt.getarea());
        System.out.println(objekt.getarea());
    }
}
