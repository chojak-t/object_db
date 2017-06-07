/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warsztat;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author tdc
 */
@Entity
public class Towar implements Serializable {
    @Id @GeneratedValue
    private long id;
    private String nazwa;
    private String jm;
    private double cena;
    
    //strona nie posiadająca
    @ManyToMany(mappedBy = "towary")
    private List<Faktura> faktury;
    
    public Towar() {        
    }
    
    public void setId (long id) {
        this.id = id;
    }
    
    public void setNazwa (String nazwa) {
        this.nazwa = nazwa;
    }
    
    public void setJm (String jm) {
        this.jm = jm;
    }
    
    public void setCena (double cena) {
        this.cena = cena;
    }
    
    public long getId() {
        return id;
    }
    
    public String getNazwa() {
        return nazwa;
    }
    
    public String getJm() {
        return jm;
    }
    
    public double getCena() {
        return cena;
    }
    
        public void addFaktura(Faktura faktura) {
		if (faktury==null) {
			faktury = new ArrayList<Faktura>();
		}
		if (!faktury.contains(faktura)) {
			faktury.add(faktura);
		}
	}

	public Collection<Faktura> getFaktury() {
		return faktury;
	}
    
        @Override
	public String toString() {
            //uwaga nie można wyświetlić powiązanych faktur tutaj bo mamy zapętlenie.
		return "Towar [nazwa= " + nazwa + ", jm= " + jm + ", cena= " + cena;
	}
}
