package edu.guvenlik.login.Repository;

import edu.guvenlik.login.Data.Ogrenci;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OgrenciRepo extends JpaRepository<Ogrenci, Long> {

    Ogrenci findByAd(String ad);
}
