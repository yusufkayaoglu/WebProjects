import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Yeni implements Serializable {
	private String yeniAd;
	private String yeniSoyad;

	public String getYeniAd() {
		return yeniAd;
	}

	public void setYeniAd(String yeniAd) {
		this.yeniAd = yeniAd;
	}

	public String getYeniSoyad() {
		return yeniSoyad;
	}

	public void setYeniSoyad(String yeniSoyad) {
		this.yeniSoyad = yeniSoyad;
	}

}
