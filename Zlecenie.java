package warsztat;

/***********************************************************************
 * Module:  Zlecenie.java
 * Author:  satan
 * Purpose: Defines the Class Zlecenie
 ***********************************************************************/

import java.util.*;

/** @pdOid cd156783-8da7-4835-86f9-ebbc1186e3f9 */
public class Zlecenie {
   /** @pdOid 68843dad-9b6b-4e58-b54b-2718eeedf1e8 */
   public int id;
   /** @pdOid dff63d1a-92fe-4959-bb58-1f571a726e91 */
   public java.lang.String nazwaZlecenia;
   /** @pdOid fb76f809-5f98-454f-aab7-b83a88e8d473 */
   public java.lang.String opisZlecenia;
   /** @pdOid a525cb5d-ce16-4ea6-86c4-b34709194bd6 */
   public double kwotaZlecenia;
   /** @pdOid 752215ca-add9-469d-89a6-c4c6b64cac7e */
   public java.util.Date dataZlozenia;
   /** @pdOid bee7a74c-1896-4f48-a378-661e3e420d29 */
   public java.util.Date terminWykonania;
   /** @pdOid f8fad623-24c7-4e3b-b3fd-65b8cb7ee8f1 */
   public java.util.Date dataWykonania;
   /** @pdOid ed683dbd-0a13-4fe5-8538-eeb6d87148e7 */
   public boolean czyKosztorysZaakceptowany;
   /** @pdOid e616eebb-c510-46bf-95df-330999aac4bc */
   public double kwotaKosztorysu;
   /** @pdOid c79ad7f3-3047-4c2e-a471-2c7b2ea78c6e */
   public java.util.Date dataWystawieniaKosztorysu;
   /** @pdOid a0645e80-8332-4abf-9b0f-7515014ad9bf */
   public java.lang.String statusZlecenia;
   
   /** Pracownik ma przypisywane zlecenie. */
   public java.util.Collection pracownikZlecenieWykonawca;
   /** @pdRoleInfo migr=no name=Stanowisko assc=zlecenieStanowisko coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Stanowisko> stanowisko;
   /** @pdRoleInfo migr=no name=Pracownik assc=pracownikZlecenieWystawca mult=1..1 */
   public Pracownik pracownik_zlecenie_wystawca;
   /** @pdRoleInfo migr=no name=Samochod assc=zlecenieSamochod coll=java.util.Collection impl=java.util.HashSet mult=0..* side=A */
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