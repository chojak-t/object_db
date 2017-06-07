/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warsztat;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author tdc
 */
@Entity
public class Faktura implements Serializable {
    @Id
    private String numer;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataWystawienia ;
    //strona posiadająca
    @ManyToMany
    private List<Towar> towary;

    //wymagany jest konstruktor bezparametrowy dla persistence
    public Faktura() {
    }
    
    public void setNumer (String numer) {
        this.numer = numer;
    }
    
    public void setDataWystawienia (Date dataWystawienia) {
        this.dataWystawienia = dataWystawienia;
    }
    
    public String getNumer() {
        return numer;
    }
    
    public Date getDataWystawienia() {
        return dataWystawienia;
    }
    
    public void addTowar(Towar towar) {
		if (towary==null) {
			towary = new ArrayList<Towar>();
		}
		if (!towary.contains(towar)) {
			towary.add(towar);
		}
	}

	public Collection<Towar> getTowary() {
		return towary;
	}
        
    	@Override
	public String toString() {
		return "Faktura [numer= " + numer + ", data= " + dataWystawienia + ", pozycje= " + towary + "]";
	}
}
