package com.gazi.bilgisayar.veritabani.ilkveritabani;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.gazi.bilgisayar.veritabani.ilkveritabani")
public class IlkveritabaniApplication {

	public static void main(String[] args) {
		SpringApplication.run(IlkveritabaniApplication.class, args);
	}

}
