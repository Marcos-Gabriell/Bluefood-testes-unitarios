package br.com.softblue.bluefood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BluefoodApplication {
	// problema resolvido! feshow :)
	
	// localhost:8080 // resolvido (a nomenclatura dos pacotes estava errada... sempre que for criar um novo pacote, parta a partir disso:
	//br.com.softblue.bluefood... exemplo ta tendo algum erro?
	public static void main(String[] args) {
		// resolvido
		SpringApplication.run(BluefoodApplication.class, args);
	}

}