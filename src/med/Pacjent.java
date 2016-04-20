/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package med;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//klasa opisujaca pacjenta
public class Pacjent {

    String ImieINazwisko;
    String Imie;
    String Nazwisko;
    String Pesel;
    String Plec;
    String Ubezpieczenie;
    boolean Badanie;
    Date data;
    Boolean Hbs;
    Boolean Hiv;
    Boolean Hcv;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Boolean isHbs() {
        return Hbs;
    }

    public void setHbs(Boolean Hbs) {
        this.Hbs = Hbs;
    }

    public Boolean isHiv() {
        return Hiv;
    }

    public void setHiv(Boolean Hiv) {
        this.Hiv = Hiv;
    }

    public Boolean isHcv() {
        return Hcv;
    }

    public void setHcv(Boolean Hcv) {
        this.Hcv = Hcv;
    }
   
    public String getImie() {
        return Imie;
    }

    public void setImie(String Imie) {
        this.Imie = Imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public void setNazwisko(String Nazwisko) {
        this.Nazwisko = Nazwisko;
    }
 

    Pacjent() {
       
    }
    
    
    public String getImieINazwisko() {
        return ImieINazwisko;
    }

    public void setImieINazwisko(String ImieINazwisko) {
        this.ImieINazwisko = ImieINazwisko;
    }

    public String getPesel() {
        return Pesel;
    }

    public void setPesel(String Pesel) {
        this.Pesel = Pesel;
    }
    
     public String getPlec() {
        return Plec;
    }

    public void setPlec(String Plec) {
        this.Plec = Plec;
    }


     public String getUbezpieczenie() {
        return Ubezpieczenie;
    }

    public void setUbezpieczenie(String Ubezpieczenie) {
        this.Ubezpieczenie = Ubezpieczenie;
    }

    public boolean isBadanie() {
        return Badanie;
    }

    public void setBadanie(boolean Badanie) {
        this.Badanie = Badanie;
    }
    
    
}
