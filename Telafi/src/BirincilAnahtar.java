import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class BirincilAnahtar implements Serializable {

	private String ulkeKodu;
	private String kimlikNo;

	public String getUlkeKodu() {
		return ulkeKodu;
	}

	public void setUlkeKodu(String ulkeKodu) {
		this.ulkeKodu = ulkeKodu;
	}

	public String getKimlikNo() {
		return kimlikNo;
	}

	public void setKimlikNo(String kimlikNo) {
		this.kimlikNo = kimlikNo;
	}

}
