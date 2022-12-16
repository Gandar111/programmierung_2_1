public class Duck implements Walkable_inter {

public String name;

    public Duck(String name) {
        this.name=name;
    }

    @Override
    public void walk() {
        System.out.println(name+ " is walking");
    }


}

