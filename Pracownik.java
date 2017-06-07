/*
Połączenie w jedną stronę jeden pracownik ma wiele telefonów
 */
package warsztat;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author tdc
 */
@Entity
public class Pracownik implements Serializable {
    @Id @GeneratedValue
    private Long id;
    private String imie;
    private String nazwisko;
    private String tytul;
    private Date dataUtworzenia;
    @OneToMany //@JoinTable(name = "EMP_PHONE", joinColumns = @JoinColumn(name = "EMP_ID"), inverseJoinColumns = @JoinColumn(name = "PHONE_ID"))
    private Collection<Telefon> telefony;
    
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return imie;
	}
	public void setName(String imie) {
		this.imie = imie;
	}
	
	public String getSurname() {
		return nazwisko;
	}
	public void setSurname(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	
	public String getTitle() {
		return tytul;
	}
	public void setTitle(String tytul) {
		this.tytul = tytul;
	}
	
	public Date getCreated() {
		return dataUtworzenia;
	}
	public void setCreated(Date dataUtworzenia) {
		this.dataUtworzenia = dataUtworzenia;
	}
	
	public void addPhone(Telefon phone) {
		if (telefony==null) {
			telefony = new ArrayList<Telefon>();
		}
		if (!telefony.contains(phone)) {
			telefony.add(phone);
		}
	}

	public Collection<Telefon> getPhones() {
		return telefony;
	}
	
	@Override
	public String toString() {
		return "Pracownik [id=" + id + ", imie=" + imie + ", nazwisko=" + nazwisko
				+ ", title=" + tytul + ", telefony=" + telefony + "]";
	}

    void removeZlecenie_pracownik_wystawca(Zlecenie aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void addZlecenie_pracownik_wystawca(Zlecenie aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
