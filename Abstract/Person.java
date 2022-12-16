public class Person implements Walkable_inter {
    private  String name;
    public Person(String name){
        this.name=name;
    }

    @Override
    public void walk() {
        System.out.println(name+ " is walking");
    }
}
