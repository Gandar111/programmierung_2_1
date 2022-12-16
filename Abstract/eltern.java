public abstract class eltern {
    public String feld_1;


    public  eltern(String feld_1){
        this.feld_1=feld_1;
    }

    public String getFeld_1() {
        return feld_1;
    }



    public abstract void func();
    public abstract double getarea();
    public abstract double getprimeter();

    public void print(){
        System.out.println(" Berechnen Sie bitte, die Area und die primeter! ");
    }


}
