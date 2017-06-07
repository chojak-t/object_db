package warsztat;

import java.util.*;
import javax.persistence.*;

@Entity
public class Zlecenie {
    @Id
    @GeneratedValue
    private int id;
    
    @Basic(optional = false)
    private String nazwaZlecenia;
    
    @Basic(optional = false)
    public String opisZlecenia;
    
    @Basic(optional = false)
    public double kwotaZlecenia;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date dataZlozenia;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date terminWykonania;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date dataWykonania;
    
    @Basic(optional = false)
    public boolean czyKosztorysZaakceptowany;
    
    @Basic(optional = false)
    public double kwotaKosztorysu;
    
    @Basic(optional = false)
    public Date dataWystawieniaKosztorysu;
    
    @Basic(optional = false)
    public String statusZlecenia;

    @ManyToMany
    public List<Stanowisko> stanowisko;

    @OneToOne
    public Pracownik pracownik_zlecenie_wystawca;

    @OneToOne
    public Samochod samochod;
    
    public Zlecenie(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazwaZlecenia() {
        return nazwaZlecenia;
    }

    public void setNazwaZlecenia(String nazwaZlecenia) {
        this.nazwaZlecenia = nazwaZlecenia;
    }

    public String getOpisZlecenia() {
        return opisZlecenia;
    }

    public void setOpisZlecenia(String opisZlecenia) {
        this.opisZlecenia = opisZlecenia;
    }

    public double getKwotaZlecenia() {
        return kwotaZlecenia;
    }

    public void setKwotaZlecenia(double kwotaZlecenia) {
        this.kwotaZlecenia = kwotaZlecenia;
    }

    public Date getDataZlozenia() {
        return dataZlozenia;
    }

    public void setDataZlozenia(Date dataZlozenia) {
        this.dataZlozenia = dataZlozenia;
    }

    public Date getTerminWykonania() {
        return terminWykonania;
    }

    public void setTerminWykonania(Date terminWykonania) {
        this.terminWykonania = terminWykonania;
    }

    public Date getDataWykonania() {
        return dataWykonania;
    }

    public void setDataWykonania(Date dataWykonania) {
        this.dataWykonania = dataWykonania;
    }

    public boolean isCzyKosztorysZaakceptowany() {
        return czyKosztorysZaakceptowany;
    }

    public void setCzyKosztorysZaakceptowany(boolean czyKosztorysZaakceptowany) {
        this.czyKosztorysZaakceptowany = czyKosztorysZaakceptowany;
    }

    public double getKwotaKosztorysu() {
        return kwotaKosztorysu;
    }

    public void setKwotaKosztorysu(double kwotaKosztorysu) {
        this.kwotaKosztorysu = kwotaKosztorysu;
    }

    public Date getDataWystawieniaKosztorysu() {
        return dataWystawieniaKosztorysu;
    }

    public void setDataWystawieniaKosztorysu(Date dataWystawieniaKosztorysu) {
        this.dataWystawieniaKosztorysu = dataWystawieniaKosztorysu;
    }

    public String getStatusZlecenia() {
        return statusZlecenia;
    }

    public void setStatusZlecenia(String statusZlecenia) {
        this.statusZlecenia = statusZlecenia;
    }

    public List<Stanowisko> getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(List<Stanowisko> stanowisko) {
        this.stanowisko = stanowisko;
    }

    public Pracownik getPracownik_zlecenie_wystawca() {
        return pracownik_zlecenie_wystawca;
    }

    public void setPracownik_zlecenie_wystawca(Pracownik pracownik_zlecenie_wystawca) {
        this.pracownik_zlecenie_wystawca = pracownik_zlecenie_wystawca;
    }

    public Samochod getSamochod() {
        return samochod;
    }

    public void setSamochod(Samochod samochod) {
        this.samochod = samochod;
    }
    
    
}
