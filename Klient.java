package warsztat;

/***********************************************************************
 * Module:  Klient.java
 * Author:  satan
 * Purpose: Defines the Class Klient
 ***********************************************************************/

import java.util.*;
import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Klient {
   @Id @GeneratedValue
   public int idKlient;
   
   @Basic(optional = false) 
   public java.lang.String imieKlient;
   
   @Basic(optional = false) 
   public java.lang.String nazwiskoKlient;
   
   @Basic(optional = false) 
   public int telefonKlient;
   
   @Basic(optional = false) 
   public java.lang.String adresEmail;
   
   @Basic(optional = false) 
   public java.lang.String rodzajDokumentu;
   
   @Basic(optional = false) 
   public java.lang.String nrDokumnetu;
   
   @Basic(optional = false) 
   public java.lang.String seriaDokumentu;
   
   /** Klient posiada samochód */
   @ManyToMany()
   public java.util.Collection<Samochod> samochod;
   
   @ManyToMany()
   public java.util.Collection<FakturaVat> fakturaVat;
   
   /** @pdOid 1bd36205-9f1b-4862-b029-1ddbf5b146e2 */
   public java.lang.Object pokazSamochodyKlienta() {
      // TODO: implement
      return null;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Samochod> getSamochod() {
      if (samochod == null)
         samochod = new java.util.HashSet<Samochod>();
      return samochod;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorSamochod() {
      if (samochod == null)
         samochod = new java.util.HashSet<Samochod>();
      return samochod.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newSamochod */
   public void setSamochod(java.util.Collection<Samochod> newSamochod) {
      removeAllSamochod();
      for (java.util.Iterator iter = newSamochod.iterator(); iter.hasNext();)
         addSamochod((Samochod)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newSamochod */
   public void addSamochod(Samochod newSamochod) {
      if (newSamochod == null)
         return;
      if (this.samochod == null)
         this.samochod = new java.util.HashSet<Samochod>();
      if (!this.samochod.contains(newSamochod))
      {
         this.samochod.add(newSamochod);
         newSamochod.addKlient(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldSamochod */
   public void removeSamochod(Samochod oldSamochod) {
      if (oldSamochod == null)
         return;
      if (this.samochod != null)
         if (this.samochod.contains(oldSamochod))
         {
            this.samochod.remove(oldSamochod);
            oldSamochod.removeKlient(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllSamochod() {
      if (samochod != null)
      {
         Samochod oldSamochod;
         for (java.util.Iterator iter = getIteratorSamochod(); iter.hasNext();)
         {
            oldSamochod = (Samochod)iter.next();
            iter.remove();
            oldSamochod.removeKlient(this);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<FakturaVat> getFakturaVat() {
      if (fakturaVat == null)
         fakturaVat = new java.util.HashSet<FakturaVat>();
      return fakturaVat;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorFakturaVat() {
      if (fakturaVat == null)
         fakturaVat = new java.util.HashSet<FakturaVat>();
      return fakturaVat.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newFakturaVat */
   public void setFakturaVat(java.util.Collection<FakturaVat> newFakturaVat) {
      removeAllFakturaVat();
      for (java.util.Iterator iter = newFakturaVat.iterator(); iter.hasNext();)
         addFakturaVat((FakturaVat)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newFakturaVat */
   public void addFakturaVat(FakturaVat newFakturaVat) {
      if (newFakturaVat == null)
         return;
      if (this.fakturaVat == null)
         this.fakturaVat = new java.util.HashSet<FakturaVat>();
      if (!this.fakturaVat.contains(newFakturaVat))
         this.fakturaVat.add(newFakturaVat);
   }
   
   /** @pdGenerated default remove
     * @param oldFakturaVat */
   public void removeFakturaVat(FakturaVat oldFakturaVat) {
      if (oldFakturaVat == null)
         return;
      if (this.fakturaVat != null)
         if (this.fakturaVat.contains(oldFakturaVat))
            this.fakturaVat.remove(oldFakturaVat);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllFakturaVat() {
      if (fakturaVat != null)
         fakturaVat.clear();
   }

    public int getIdKlient() {
        return idKlient;
    }

    public void setIdKlient(int idKlient) {
        this.idKlient = idKlient;
    }

}