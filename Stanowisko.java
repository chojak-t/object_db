package warsztat;

/***********************************************************************
 * Module:  Stanowisko.java
 * Author:  tdc
 * Purpose: Defines the Class Stanowisko
 ***********************************************************************/

import java.util.*;
import javax.persistence.*;

@Entity
public class Stanowisko {
   @Id
   public java.lang.String nazwaStanowisko;

   public java.lang.String typStanowisko;

   public java.util.Collection<Zlecenie> zlecenie;

   public java.lang.Object wyswietlGodzinyPracyPracownikow() {
      // TODO: implement
      return null;
   }

   public java.lang.Object zestawienieZlecenPracownikowStanowisk() {
      // TODO: implement
      return null;
   }

   public java.util.Collection<Zlecenie> getZlecenie() {
      if (zlecenie == null)
         zlecenie = new java.util.HashSet<Zlecenie>();
      return zlecenie;
   }

   public java.util.Iterator getIteratorZlecenie() {
      if (zlecenie == null)
         zlecenie = new java.util.HashSet<Zlecenie>();
      return zlecenie.iterator();
   }

   public void setZlecenie(java.util.Collection<Zlecenie> newZlecenie) {
      removeAllZlecenie();
      for (java.util.Iterator iter = newZlecenie.iterator(); iter.hasNext();)
         addZlecenie((Zlecenie)iter.next());
   }
   
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