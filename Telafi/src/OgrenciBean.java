import java.util.List;

import javax.persistence.EntityManager;

public class OgrenciBean {
	Ogrenci ogrenci = new Ogrenci();

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
		en.persist(ogrenci.getAdres());
		en.persist(ogrenci.getOkul());
		en.getTransaction().commit();
		ogrenci = new Ogrenci();

	}

	public void sil() {
		EntityManager en = EntityUtil.getEntityManager();
		en.getTransaction().begin();
		en.remove(ogrenci);
		en.remove(ogrenci.getOkul());
		en.remove(ogrenci.getAdres());
		en.getTransaction().commit();
		ogrenci = new Ogrenci();

	}

	public void guncelle() {
		EntityManager en = EntityUtil.getEntityManager();
		en.getTransaction().begin();
		en.merge(ogrenci.getOkul());
		en.merge(ogrenci.getAdres());
		en.merge(ogrenci);
		en.getTransaction().commit();
		ogrenci = new Ogrenci();

	}

	public List<Ogrenci> getListe() {
		EntityManager en = EntityUtil.getEntityManager();
		return en.createQuery("From Ogrenci").getResultList();

	}

}
