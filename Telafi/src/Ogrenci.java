import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Ogrenci implements Serializable {
	@EmbeddedId
	private BirincilAnahtar birincilAnahtar = new BirincilAnahtar();

	private String ad;
	private String soyad;
	private Integer yas;
	private String cinsiyet;
	@OneToOne
	private Adres adres = new Adres();
	@OneToOne
	private Okul okul = new Okul();
	@Embedded
	private Yeni yeni = new Yeni();


	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public Integer getYas() {
		return yas;
	}

	public void setYas(Integer yas) {
		this.yas = yas;
	}

	public String getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}

	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

	public Okul getOkul() {
		return okul;
	}

	public void setOkul(Okul okul) {
		this.okul = okul;
	}

	public Yeni getYeni() {
		return yeni;
	}

	public void setYeni(Yeni yeni) {
		this.yeni = yeni;
	}

	public BirincilAnahtar getBirincilAnahtar() {
		return birincilAnahtar;
	}

	public void setBirincilAnahtar(BirincilAnahtar birincilAnahtar) {
		this.birincilAnahtar = birincilAnahtar;
	}

}
