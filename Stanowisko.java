package warsztat;

/***********************************************************************
 * Module:  Stanowisko.java
 * Author:  tdc
 * Purpose: Defines the Class Stanowisko
 ***********************************************************************/

import java.util.*;

/** @pdOid 0127142b-7cae-4ee4-905a-7c30faad733c */
public class Stanowisko {
   /** @pdOid 8ba0fca3-7217-40f2-81a3-9b9e73d11711 */
   public java.lang.String nazwaStanowisko;
   /** @pdOid 657f3ee7-9ebc-49b7-9870-3fe3ba7cff33 */
   public java.lang.String typStanowisko;
   
   /** @pdRoleInfo migr=no name=Zlecenie assc=zlecenieStanowisko coll=java.util.Collection impl=java.util.HashSet mult=1..* side=A */
   public java.util.Collection<Zlecenie> zlecenie;
   
   /** @pdOid 1b8cadc9-e4d9-4b9e-9b20-c92e39fe3e00 */
   public java.lang.Object wyswietlGodzinyPracyPracownikow() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 304a4aba-77b2-4165-9089-5da4781b484a */
   public java.lang.Object zestawienieZlecenPracownikowStanowisk() {
      // TODO: implement
      return null;
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
         newZlecenie.addStanowisko(this);      
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
            oldZlecenie.removeStanowisko(this);
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
            oldZlecenie.removeStanowisko(this);
         }
      }
   }

}