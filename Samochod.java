package warsztat;

/***********************************************************************
 * Module:  Samochod.java
 * Author:  satan
 * Purpose: Defines the Class Samochod
 ***********************************************************************/

import java.util.*;
import javax.persistence.*;

@Entity
public class Samochod {
   @Id
   public String rejestracja;
   
   @Basic(optional = false) 
   public String vin;
   
   @Basic(optional = false) 
   public String nrSilnika;
   
   @Basic(optional = false) 
   public double stanLicznika;
   
   @Basic(optional = false) 
   public String marka;
   
   @Basic(optional = false) 
   public String model;
   
   /** Klient posiada samochód */
   @ManyToMany
   public List<Klient> klient;
   
   @ManyToMany
   public List<Zlecenie> zlecenie;
   
   public Samochod(){}
   
   public Klient wyswietlWlascicielaSamochodu() {
      // TODO: implement
      return null;
   }

    public String getRejestracja() {
        return rejestracja;
    }

    public void setRejestracja(String rejestracja) {
        this.rejestracja = rejestracja;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getNrSilnika() {
        return nrSilnika;
    }

    public void setNrSilnika(String nrSilnika) {
        this.nrSilnika = nrSilnika;
    }

    public double getStanLicznika() {
        return stanLicznika;
    }

    public void setStanLicznika(double stanLicznika) {
        this.stanLicznika = stanLicznika;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<Klient> getKlient() {
        return klient;
    }

    public void setKlient(List<Klient> klient) {
        this.klient = klient;
    }

    public List<Zlecenie> getZlecenie() {
        return zlecenie;
    }

    public void setZlecenie(List<Zlecenie> zlecenie) {
        this.zlecenie = zlecenie;
    }
   
   
}