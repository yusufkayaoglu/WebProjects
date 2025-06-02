package edu.guvenlik.login.Repository;

import edu.guvenlik.login.Data.Yetki;
import org.springframework.data.jpa.repository.JpaRepository;

public interface YetkiRepository extends JpaRepository<Yetki, Long> {
    Yetki findByYetkiAdi(String ad);
}
