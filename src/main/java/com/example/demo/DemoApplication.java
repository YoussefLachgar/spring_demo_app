package com.example.demo;

import com.example.demo.dao.ProduitRepository;
import com.example.demo.entites.Produit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		ProduitRepository produitRepository = context.getBean(ProduitRepository.class);

//		produitRepository.save(new Produit("Samsung s22", 8000,120));
//		produitRepository.save(new Produit("Iphone 14 pro", 12000,60));
//		produitRepository.save(new Produit("Opo a13", 8000,120));

		produitRepository.findAll().forEach(prod-> System.out.printf("product: %s%n",prod.getDesignation()));
	}

}
