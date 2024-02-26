package com.example.portailemploi;


import com.example.portailemploi.entities.*;
import com.example.portailemploi.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class PortailEmploiApplication implements CommandLineRunner {

    @Autowired
    private EmployeurService employeurService;

    @Autowired
    private OffreEmploiService offreEmploiService;

    @Autowired
    private VilleService VilleService;
    @Autowired
    private DomaineService DomaineService;
    @Autowired
    private ImageService ImageService;

    public static void main(String[] args) {

        SpringApplication.run(PortailEmploiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //Assuming you have already saved an Employeur
        Employeur employeur = employeurService.saveEmployeur(new Employeur( "hmed", "hmed", "hmed.hmed", "hmed@example.com", "hmed", "Emps", "0101010101"));

        // Create and save an OffreEmploi associated with the Employeur
        OffreEmploi offreEmploi1 = new OffreEmploi(employeur,DomaineService.saveDomaine( new Domaine("Info")),
                "CDD",
                "Java Company",
                "http://www.abc-company.com",
                "1414 USD",
                "Bac +1",
                "saxa",
                "Exciting job opportunity in software development.",
                "Open",VilleService.saveVille( new Ville("Nador")),
                ImageService.saveImage(new Image("example_image.jpg", "jpeg", new byte[]{0, 10, 20, 12})) );
        offreEmploiService.saveOffreEmploi(offreEmploi1);


        OffreEmploi offreEmploi2 = new OffreEmploi(employeur,DomaineService.saveDomaine( new Domaine("Finance")),
                "CDI",
                "ABC Company",
                "http://www.abc-company.com",
                "50000 USD",
                "Bachelor's",
                "Software Developer",
                "Exciting job opportunity in software development.",
                "Open",VilleService.saveVille( new Ville("CASA")),
                ImageService.saveImage(new Image("example_image.jpg", "jpeg", new byte[]{0, 10, 20, 12})) );
        offreEmploiService.saveOffreEmploi(offreEmploi2);

        OffreEmploi offreEmploi3 = new OffreEmploi(employeur,DomaineService.saveDomaine( new Domaine("Marke")),
                "CDI",
                "ABC Company",
                "http://www.abc-company.com",
                "50000 USD",
                "Bachelor's",
                "Software Developer",
                "Exciting job opportunity in software development.",
                "Open",VilleService.saveVille( new Ville("FES")),
                ImageService.saveImage(new Image("example_image.jpg", "jpeg", new byte[]{0, 10, 20, 12})) );
        offreEmploiService.saveOffreEmploi(offreEmploi3);


        //Affichage des offres d'emploi


     /*  List<OffreEmploi> offers=employeurService.getOffresEmploiByEmployeurId(employeur.getId());
          offers.forEach(O->{
            System.out.println(O.getId());
            System.out.println(O.getTitre());
            System.out.println(O.getDomaine());
           // System.out.println(O.getContrat());
           // System.out.println(O.getEntreprise());
            System.out.println(O.getVille());

        });
*/
/*
        List<OffreEmploi> offers=offreEmploiService.getAllOffresEmploi();
        offers.forEach(O->{
            //System.out.println(O.getId());
            System.out.println(O.getTitre());
            // System.out.println(O.getDomaine());
            // System.out.println(O.getContrat());
            // System.out.println(O.getEntreprise());
            System.out.println(O.getVille());

        });




       // List<Employeur> emps = employeurService.getAllEmployeursWithJobOffers();
       // emps.forEach(E->{
        //    System.out.println("Employeur ID: " + E.getId());
        //    System.out.println("Nom: " + E.getNom());
         //   System.out.println("Prenom: " + E.getPrenom());
        //}) ;




       //------------------------------------------
       /* List<OffreEmploi> Offers = offreEmploiService.getAllOffresEmploi();
        Offers.forEach(O->{

            System.out.println(O.getId());
            System.out.println(O.getTitre());
            System.out.println(O.getDomaine());
            System.out.println(O.getContrat());
            System.out.println(O.getEntreprise());
            System.out.println(O.getVille());

        });

*/

        // Fetch all job offers
        // List<OffreEmploi> allOffresEmploi = offreEmploiService.getAllOffresEmploi();
        // System.out.println("All Job Offers: " + allOffresEmploi);

        //  Fetch job offers by key name
 /*
        offreEmploiService.getOffresEmploiByKeyName("saxa").forEach(p1->{
            System.out.println(p1.getTitre());
        });
*/

        // Fetch job offers by niveau d'etude
        // List<OffreEmploi> byNiveauEtude = offreEmploiService.getOffresEmploiByNiveauEtude("Bachelor's");
        // System.out.println("Job Offers by Niveau Etude: " + byNiveauEtude);

        // Fetch job offers by ville
        // List<OffreEmploi> byVille = offreEmploiService.getOffresEmploiByVille("Paris");
        // System.out.println("Job Offers by Ville: " + byVille);
    }

}
