import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Hotelzimmerresevierungssystem {
    public static int zeilenAnzählen(String file) throws FileNotFoundException{
        Scanner scanner= new Scanner(new File(file));
        int i=0;
        while (scanner.hasNext()){String line = scanner.nextLine();


            i++;

        }
   return i; }


    public static String [] euberpreufen(String file, int index) throws FileNotFoundException {
        String []hotelName= new String[zeilenAnzählen(file)];
        Scanner scanner= new Scanner(new File(file));
        int i=0;
        while (scanner.hasNext()){ String line = scanner.nextLine();
            if ( i>0){


            String[] value= line.split(",");
            hotelName[i]= value[index].trim();
                System.out.println(hotelName[i]);
            i++;}
            else { i++;}

        }scanner.close();

    return hotelName;}

    public static int [] euberpreufenParsINt(String file, int index) throws FileNotFoundException {
        int []hotelName= new int[zeilenAnzählen(file)];
        Scanner scanner= new Scanner(new File(file));
        int i=0;
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            if ( i>0){


            String[] value= line.split(",");
            hotelName[i]= Integer.parseInt(value[index].trim());

            i++;}
            else { i++;}

        }scanner.close();
       // System.out.print(Arrays.toString(hotelName));
    return hotelName;}
    public static String [] splitinSplit(String file) throws FileNotFoundException {
        String []hotelName= new String[zeilenAnzählen(file)];
        Scanner scanner= new Scanner(new File(file));
        int i=0;
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            if ( i>0){

            String[] value= line.split(";");
            String [] value_2=value[1].split(",");
            hotelName[i]= value_2[0].trim();

            i++;}
            else { i++;}

        }scanner.close();
        //System.out.print(Arrays.toString(hotelName));
        return hotelName;}


    public static void verfügbarkeit(String fileHotel,String fileAutor_2) throws FileNotFoundException {
        String []Hotel=  euberpreufen(fileHotel, 0);
        String []Autor =  splitinSplit(fileAutor_2);
        int []verfügbarkeit =  euberpreufenParsINt(fileHotel, 1);

        for (int j = 1; j < Autor.length; j++) {


        for (int i = 1; i < Hotel.length; i++) {
            if(verfügbarkeit[i]>=5){

                System.out.println("Reservation at " + Hotel[i]+" for " +Autor[j]+" (number of guests: 5) successful: 5 free romms were reserved");
                verfügbarkeit[i]= verfügbarkeit[i]-5;
                break;


            } else if (verfügbarkeit[i]<5) {
                System.out.println("Reservation at " + Hotel[i]+" for " +Autor[j]+" (number of guests: 5) failed: "
                        + Hotel[i]+" has " + verfügbarkeit[i]+ " free romms");

            }


        }}
        
    }

    public static String [] koawach(String fileHotel,String fileAutor_2) throws FileNotFoundException {
        String []Hotel=  euberpreufen(fileHotel, 0);
        String []Autor =  euberpreufen(fileAutor_2, 0);


        for (int j = 1; j < Autor.length; j++) {


            for (int i = 1; i < Hotel.length; i++) {
                if(Autor[j].equals(Hotel[i])){

                    Autor[j]="t";

                }


            }
        }

    return Autor;}
    public static void main(String[] args) throws FileNotFoundException {
        String AutorFile= "C:/Users/ghamd/IdeaProjects/programmierung_2/src/Autoren.csv";
    String Hotelfile = "C:/Users/ghamd/IdeaProjects/programmierung_2/src/Groupss.csv";
      // verfügbarkeit(Hotelfile, AutorFile);
       // System.out.println(Arrays.toString(koawach(Hotelfile, AutorFile)));
        euberpreufen(Hotelfile, 1);









    }
}
