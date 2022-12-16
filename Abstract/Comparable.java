import java.util.Comparator;

public class Comparable implements Compare <Comparable>{
    private int x;
    public Comparable(int x){
        this.x=x;
    }
    @Override
    public int compareTo(Comparable another_x) {
        if (this.x < another_x.x) return -1;
        if (this.x > another_x.x) return 1;
        return 0;
    }
    public static void main(String[] args) {
        Comparable objekt_1= new Comparable(33);
        Comparable objekt_2= new Comparable(22);
        Comparable objekt_3= new Comparable(33);
        System.out.println(objekt_1.compareTo(objekt_2));
        System.out.println(objekt_1.compareTo(objekt_3));
    }
}
