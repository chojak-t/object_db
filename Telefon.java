/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warsztat;
import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author tdc
 */
@Entity
public class Telefon implements Serializable {
    @Id @GeneratedValue
    private int id;
    private String numer;
    private String typ;
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumber() {
		return numer;
	}

	public void setNumber(String numer) {
		this.numer = numer;
	}

	public String getType() {
		return typ;
	}

	public void setType(String typ) {
		this.typ = typ;
	}

	@Override
	public String toString() {
		return "Telefon [id=" + id + ", numer=" + numer + ", typ=" + typ
				+ "]";
	}
}
