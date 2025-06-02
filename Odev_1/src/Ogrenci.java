import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

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
	private String sehir;
	private String otel;
	private String odaTipi;


	@OneToOne
	private AdresBilgileri adresBilgileri = new AdresBilgileri();
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

	public AdresBilgileri getAdresBilgileri() {
		return adresBilgileri;
	}

	public void setAdresBilgileri(AdresBilgileri adresBilgileri) {
		this.adresBilgileri = adresBilgileri;
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

	public String getSehir() {
		return sehir;
	}

	public void setSehir(String sehir) {
		this.sehir = sehir;
	}

	public String getOtel() {
		return otel;
	}

	public void setOtel(String otel) {
		this.otel = otel;
	}

	public String getOdaTipi() {
		return odaTipi;
	}

	public void setOdaTipi(String odaTipi) {
		this.odaTipi = odaTipi;
	}
}
