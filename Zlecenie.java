package warsztat;

import java.util.*;

public class Zlecenie {
   
   public int id;
   
   public java.lang.String nazwaZlecenia;
  
   public java.lang.String opisZlecenia;
  
   public double kwotaZlecenia;

   public java.util.Date dataZlozenia;

   public java.util.Date terminWykonania;

   public java.util.Date dataWykonania;

   public boolean czyKosztorysZaakceptowany;

   public double kwotaKosztorysu;

   public java.util.Date dataWystawieniaKosztorysu;

   public java.lang.String statusZlecenia;
   
   /** Pracownik ma przypisywane zlecenie. */
   public java.util.Collection pracownikZlecenieWykonawca;

   public java.util.Collection<Stanowisko> stanowisko;

   public Pracownik pracownik_zlecenie_wystawca;

   public java.util.Collection<Samochod> samochod;
   
   /** @pdOid 6147d24a-5637-412b-8d09-5df437e058ea */
   public java.lang.Object wyswietlSredniCzasNaZlecenie() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid c5160c89-b0e3-4195-a893-6d9f915ce846 */
   public java.lang.Object pokazZleceniaBezFaktur() {
      // TODO: implement
      return null;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Stanowisko> getStanowisko() {
      if (stanowisko == null)
         stanowisko = new java.util.HashSet<Stanowisko>();
      return stanowisko;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorStanowisko() {
      if (stanowisko == null)
         stanowisko = new java.util.HashSet<Stanowisko>();
      return stanowisko.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newStanowisko */
   public void setStanowisko(java.util.Collection<Stanowisko> newStanowisko) {
      removeAllStanowisko();
      for (java.util.Iterator iter = newStanowisko.iterator(); iter.hasNext();)
         addStanowisko((Stanowisko)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newStanowisko */
   public void addStanowisko(Stanowisko newStanowisko) {
      if (newStanowisko == null)
         return;
      if (this.stanowisko == null)
         this.stanowisko = new java.util.HashSet<Stanowisko>();
      if (!this.stanowisko.contains(newStanowisko))
      {
         this.stanowisko.add(newStanowisko);
         newStanowisko.addZlecenie(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldStanowisko */
   public void removeStanowisko(Stanowisko oldStanowisko) {
      if (oldStanowisko == null)
         return;
      if (this.stanowisko != null)
         if (this.stanowisko.contains(oldStanowisko))
         {
            this.stanowisko.remove(oldStanowisko);
            oldStanowisko.removeZlecenie(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllStanowisko() {
      if (stanowisko != null)
      {
         Stanowisko oldStanowisko;
         for (java.util.Iterator iter = getIteratorStanowisko(); iter.hasNext();)
         {
            oldStanowisko = (Stanowisko)iter.next();
            iter.remove();
            oldStanowisko.removeZlecenie(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Pracownik getPracownik_zlecenie_wystawca() {
      return pracownik_zlecenie_wystawca;
   }
   
   /** @pdGenerated default parent setter
     * @param newPracownik */
   public void setPracownik_zlecenie_wystawca(Pracownik newPracownik) {
      if (this.pracownik_zlecenie_wystawca == null || !this.pracownik_zlecenie_wystawca.equals(newPracownik))
      {
         if (this.pracownik_zlecenie_wystawca != null)
         {
            Pracownik oldPracownik = this.pracownik_zlecenie_wystawca;
            this.pracownik_zlecenie_wystawca = null;
            oldPracownik.removeZlecenie_pracownik_wystawca(this);
         }
         if (newPracownik != null)
         {
            this.pracownik_zlecenie_wystawca = newPracownik;
            this.pracownik_zlecenie_wystawca.addZlecenie_pracownik_wystawca(this);
         }
      }
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
         newSamochod.addZlecenie(this);      
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
            oldSamochod.removeZlecenie(this);
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
            oldSamochod.removeZlecenie(this);
         }
      }
   }

}