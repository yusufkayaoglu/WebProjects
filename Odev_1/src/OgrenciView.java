import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;

public class OgrenciView {
	Ogrenci ogrenci = new Ogrenci();
	
	private List<String> sehirler = Arrays.asList("Ýstanbul", "Ankara", "Ýzmir", "Antalya");
    private List<String> oteller = Arrays.asList("Hilton", "Rixos", "Marriott", "Sheraton");
    private List<String> odaTipleri = Arrays.asList("Standart", "Deluxe", "Suit");


	public Ogrenci getOgrenci() {
		return ogrenci;
	}

	public void setOgrenci(Ogrenci ogrenci) {
		this.ogrenci = ogrenci;
	}

	public void kaydet() {
		EntityManager en = EntityUtil.getEntityManager();
		en.getTransaction().begin();
		en.persist(ogrenci);
		en.persist(ogrenci.getAdresBilgileri());
		en.getTransaction().commit();
		ogrenci = new Ogrenci();

	}

	public void sil() {
		EntityManager en = EntityUtil.getEntityManager();
		en.getTransaction().begin();
		en.remove(ogrenci);
		en.remove(ogrenci.getAdresBilgileri());
		en.getTransaction().commit();
		ogrenci = new Ogrenci();

	}

	public void guncelle() {
		EntityManager en = EntityUtil.getEntityManager();
		en.getTransaction().begin();
		en.merge(ogrenci.getAdresBilgileri());
		en.merge(ogrenci);
		en.getTransaction().commit();
		ogrenci = new Ogrenci();

	}

	public List<Ogrenci> getListe() {
		EntityManager en = EntityUtil.getEntityManager();
		return en.createQuery("From Ogrenci").getResultList();

	}

	public List<String> getSehirler() {
		return sehirler;
	}

	public void setSehirler(List<String> sehirler) {
		this.sehirler = sehirler;
	}

	public List<String> getOteller() {
		return oteller;
	}

	public void setOteller(List<String> oteller) {
		this.oteller = oteller;
	}

	public List<String> getOdaTipleri() {
		return odaTipleri;
	}

	public void setOdaTipleri(List<String> odaTipleri) {
		this.odaTipleri = odaTipleri;
	}
	
}
