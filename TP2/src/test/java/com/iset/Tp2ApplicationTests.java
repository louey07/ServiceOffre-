package com.iset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.iset.dao.OffreRepository;
import com.iset.entities.Offre;

@SpringBootApplication
public class Tp2ApplicationTests implements CommandLineRunner {

    @Autowired
    OffreRepository offreRepository;

    public static void main(String[] args) {
        SpringApplication.run(Tp2ApplicationTests.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Add sample job offers to database
        offreRepository.save(new Offre("Web Design", "Informatique", "AXA", 2, "France"));
        offreRepository.save(new Offre("Developpeur", "Informatique", "Talys", 3, "Tunisie"));
        offreRepository.save(new Offre("Architecte", "Informatique", "SIS", 2, "Allemagne"));
        
        System.out.println("Sample data added to database!");
    }
}