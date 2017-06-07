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
    public String adresEmail;

    @Basic(optional = false) 
    public String rodzajDokumentu;

    @Basic(optional = false) 
    public String nrDokumnetu;

    @Basic(optional = false) 
    public String seriaDokumentu;

    /** Klient posiada samochód */
    @ManyToMany()
    public List<Samochod> samochod;

    public Klient(){}

   /**
    * Gettery i settery
    */
    public int getIdKlient() {
        return idKlient;
    }

    public void setIdKlient(int idKlient) {
        this.idKlient = idKlient;
    }

    public String getImieKlient() {
        return imieKlient;
    }

    public void setImieKlient(String imieKlient) {
        this.imieKlient = imieKlient;
    }

    public String getNazwiskoKlient() {
        return nazwiskoKlient;
    }

    public void setNazwiskoKlient(String nazwiskoKlient) {
        this.nazwiskoKlient = nazwiskoKlient;
    }

    public int getTelefonKlient() {
        return telefonKlient;
    }

    public void setTelefonKlient(int telefonKlient) {
        this.telefonKlient = telefonKlient;
    }

    public String getAdresEmail() {
        return adresEmail;
    }

    public void setAdresEmail(String adresEmail) {
        this.adresEmail = adresEmail;
    }

    public String getRodzajDokumentu() {
        return rodzajDokumentu;
    }

    public void setRodzajDokumentu(String rodzajDokumentu) {
        this.rodzajDokumentu = rodzajDokumentu;
    }

    public String getNrDokumnetu() {
        return nrDokumnetu;
    }

    public void setNrDokumnetu(String nrDokumnetu) {
        this.nrDokumnetu = nrDokumnetu;
    }

    public String getSeriaDokumentu() {
        return seriaDokumentu;
    }

    public void setSeriaDokumentu(String seriaDokumentu) {
        this.seriaDokumentu = seriaDokumentu;
    }

    public List<Samochod> getSamochod() {
        return samochod;
    }

    public void setSamochod(List<Samochod> samochod) {
        this.samochod = samochod;
    }
}