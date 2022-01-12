import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import static java.time.LocalDate.*;

public class Person {

    private String Imie;
    private String Nazwisko;
    private String Dzial;
    private String Wyplata;
    private String rok_Urodzenia;

    public Person( String Imie, String Nazwisko,String rok_Urodzenia, String Dzial, String Wyplata ) {
        this.Imie = Imie;
        this.Nazwisko = Nazwisko;
        this.Dzial = Dzial;
        this.Wyplata = Wyplata;
        this.rok_Urodzenia = rok_Urodzenia;



    }

    public String getImie() {
        return Imie;
    }


    public String getNazwisko() {
        return Nazwisko;
    }




    public String getDzial() {
        return Dzial;
    }



    public String getWyplata() {
        return Wyplata;
    }

    public String getrok_Urodzenia(){
        Calendar calendar = Calendar.getInstance();
        int rok=calendar.get(Calendar.YEAR);
        String wiek;

         rok_Urodzenia= String.valueOf(rok-Integer.parseInt(rok_Urodzenia));

        return rok_Urodzenia;
    }



}