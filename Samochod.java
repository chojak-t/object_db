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
   public java.lang.String rejestracja;
   
   @Basic(optional = false) 
   public java.lang.String vin;
   
   @Basic(optional = false) 
   public java.lang.String nrSilnika;
   
   @Basic(optional = false) 
   public double stanLicznika;
   
   @Basic(optional = false) 
   public java.lang.String marka;
   
   @Basic(optional = false) 
   public java.lang.String model;
   
   /** Klient posiada samochód */
   @ManyToMany(mappedBy = "klient")
   public java.util.Collection<Klient> klient;
   
   @ManyToMany(mappedBy = "zlecenie")
   public java.util.Collection<Zlecenie> zlecenie;
   
   public java.lang.Object wyswietlWlascicielaSamochodu() {
      // TODO: implement
      return null;
   }

   public java.util.Collection<Klient> getKlient() {
      if (klient == null)
         klient = new java.util.HashSet<Klient>();
      return klient;
   }
   
   public java.util.Iterator getIteratorKlient() {
      if (klient == null)
         klient = new java.util.HashSet<Klient>();
      return klient.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newKlient */
   public void setKlient(java.util.Collection<Klient> newKlient) {
      removeAllKlient();
      for (java.util.Iterator iter = newKlient.iterator(); iter.hasNext();)
         addKlient((Klient)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newKlient */
   public void addKlient(Klient newKlient) {
      if (newKlient == null)
         return;
      if (this.klient == null)
         this.klient = new java.util.HashSet<Klient>();
      if (!this.klient.contains(newKlient))
      {
         this.klient.add(newKlient);
         newKlient.addSamochod(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldKlient */
   public void removeKlient(Klient oldKlient) {
      if (oldKlient == null)
         return;
      if (this.klient != null)
         if (this.klient.contains(oldKlient))
         {
            this.klient.remove(oldKlient);
            oldKlient.removeSamochod(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllKlient() {
      if (klient != null)
      {
         Klient oldKlient;
         for (java.util.Iterator iter = getIteratorKlient(); iter.hasNext();)
         {
            oldKlient = (Klient)iter.next();
            iter.remove();
            oldKlient.removeSamochod(this);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Zlecenie> getZlecenie() {
      if (zlecenie == null)
         zlecenie = new java.util.HashSet<Zlecenie>();
      return zlecenie;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorZlecenie() {
      if (zlecenie == null)
         zlecenie = new java.util.HashSet<Zlecenie>();
      return zlecenie.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newZlecenie */
   public void setZlecenie(java.util.Collection<Zlecenie> newZlecenie) {
      removeAllZlecenie();
      for (java.util.Iterator iter = newZlecenie.iterator(); iter.hasNext();)
         addZlecenie((Zlecenie)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newZlecenie */
   public void addZlecenie(Zlecenie newZlecenie) {
      if (newZlecenie == null)
         return;
      if (this.zlecenie == null)
         this.zlecenie = new java.util.HashSet<Zlecenie>();
      if (!this.zlecenie.contains(newZlecenie))
      {
         this.zlecenie.add(newZlecenie);
         newZlecenie.addSamochod(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldZlecenie */
   public void removeZlecenie(Zlecenie oldZlecenie) {
      if (oldZlecenie == null)
         return;
      if (this.zlecenie != null)
         if (this.zlecenie.contains(oldZlecenie))
         {
            this.zlecenie.remove(oldZlecenie);
            oldZlecenie.removeSamochod(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllZlecenie() {
      if (zlecenie != null)
      {
         Zlecenie oldZlecenie;
         for (java.util.Iterator iter = getIteratorZlecenie(); iter.hasNext();)
         {
            oldZlecenie = (Zlecenie)iter.next();
            iter.remove();
            oldZlecenie.removeSamochod(this);
         }
      }
   }

}