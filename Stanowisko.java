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
   @Basic(optional = false) 
   public TypStanowiska typStanowisko;

   public java.lang.Object wyswietlGodzinyPracyPracownikow() {
      // TODO: implement
      return null;
   }

   public java.lang.Object zestawienieZlecenPracownikowStanowisk() {
      // TODO: implement
      return null;
   }

    void addZlecenie(Zlecenie aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void removeZlecenie(Zlecenie aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}