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
   @ManyToMany(mappedBy = "klient")
   public List<Klient> klient;
   
   @ManyToMany(mappedBy = "zlecenie")
   public List<Zlecenie> zlecenie;
   
   public Klient wyswietlWlascicielaSamochodu() {
      // TODO: implement
      return null;
   }
   
   
}