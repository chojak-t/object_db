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
}