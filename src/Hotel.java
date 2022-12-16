import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Hotel {
   public String name, anzahl;// anzahl der verfügbare Zimmer


    public Hotel(){

        this.anzahl=null;
        this.name=null;
    }
    public Hotel( String name,  String anzahl){
        this.name=name;
        this.anzahl= anzahl;

    }

    public String getAnzahl() {

        return anzahl;
    }



    public String getName() {
        return name;
    }
    public ArrayList<String> Namesepeichern(){
        ArrayList<String> arrName= new ArrayList<>();

       arrName.add(getName());




    return arrName;}
    public ArrayList<Integer> Anzahlspeichern(){
        ArrayList<Integer> arrAnzahl= new ArrayList<>();
        arrAnzahl.add(Integer.parseInt(getAnzahl()));
   return arrAnzahl; }

        public static int zeilenAnzählen(String file) throws FileNotFoundException {
            Scanner scanner= new Scanner(new File(file));
            int i=0;
            while (scanner.hasNext()){String line = scanner.nextLine();

                i++;

            }
            return i; }
    public void einlesen( String file) throws FileNotFoundException {
        String []hotelName= new String[zeilenAnzählen(file)];
        Scanner scanner= new Scanner(new File(file));
        int i=0;
        while (scanner.hasNext()){
            String line = scanner.nextLine();

            String[] value= line.split(",");
            hotelName[i]= value[2].trim();

            i++;

        }scanner.close();
        System.out.print(Arrays.toString(hotelName));
    }
}
