import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Okul implements Serializable {

	@Id
	@GeneratedValue
	private int okulId;
	private String okulAdi;
	@OneToOne(mappedBy="okul")
	private Ogrenci ogrenci;
	public int getOkulId() {
		return okulId;
	}

	public void setOkulId(int okulId) {
		this.okulId = okulId;
	}

	public String getOkulAdi() {
		return okulAdi;
	}

	public void setOkulAdi(String okulAdi) {
		this.okulAdi = okulAdi;
	}

}
