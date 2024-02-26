package com.example.portailemploi.FakedataTest;

import com.example.portailemploi.dao.*;
import com.example.portailemploi.entities.*;
import org.apache.commons.io.FileUtils ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;
import java.io.File;


@Service
public class EmployeurServiceImpl implements IEmployeur {




    /*
}

   @Autowired
   private  VilleRepository villeRepository;

   @Autowired
   private DomaineRepository domaineRepository;



    @Autowired
    private ImageRepository imageRepository;


    @Autowired
    private EmployeurRepository employeurRepository;

   // @Autowired
   // private OffreEmploiRepository offreEmploiRepository;









    @Override
    public void initVilles() {

        Stream.of("Casablanca", "Fés", "Tanger", "Rabat", "Oujda","Marrakech" , "El Jadida").forEach(nameVille -> {
            villeRepository.save(new Ville( nameVille));
        });


    }

    @Override
    public void initDomaine() {

        Stream.of("Informatique et technologies de l'information", "Finance et comptabilité",
                "Ressources humaines", "Ingénierie et industrie",
                "Vente et marketing","Services aux entreprises" ,
                "Santé et services sociaux","Éducation et formation",
                "Commerce et distribution","Arts, divertissement et médias",
                "Environnement et développement durable","Tourisme et hôtellerie ",
                "Transport et logistique").forEach(nameDomaine -> {
            domaineRepository.save(new Domaine( nameDomaine));
        });

    }

    @Override
    public void initEmployeurs() {

        Employeur employeur = new Employeur();
        employeur.setNom("Mouad");
        employeur.setPrenom("Elkoipi");
        employeur.setUsername("Mouad123");
        employeur.setEmail("Mouad@gmail.com");
        employeur.setPassword("GMI123");
        employeur.setRole("Employeur");
        employeur.setTelephone("0654321234");
        employeurRepository.save(employeur);

        Employeur employeur1 = new Employeur();
        employeur1.setNom("mouha");
        employeur1.setPrenom("eljeem");
        employeur1.setUsername("mouha");
        employeur1.setEmail("MouadRekru@gmail.com");
        employeur1.setPassword("GMI12342024");
        employeur1.setRole("Employeur");
        employeur1.setTelephone("065430121234");
        employeurRepository.save(employeur1);



    }


    @Override
    public void initImages() {
        String url = "C:\\Users\\amine\\Desktop\\JobOffersPics\\";
        Stream.of("1.jpg", "2.png" , "3.png","4.jfif","5.png","6.jpg").forEach(img -> {
            File file = new File(url + img);
            try {
                byte[] content = FileUtils.readFileToByteArray(file);
                if (img.endsWith(".jpg")) {
                    imageRepository.save(new Image(img, "image/jpg", content));
                } else if (img.endsWith(".png")) {
                    imageRepository.save(new Image(img, "image/png", content));
                }
                else if (img.endsWith(".jfif")) {
                    imageRepository.save(new Image(img, "image/jfif", content));
                }


            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }








    @Override
    public void initOffersEmploi() {
        List<Image> images = imageRepository.findAll();
        int imageCount = images.size();
        employeurRepository.findAll().forEach(employeur -> {
            villeRepository.findAll().forEach(ville -> {
                domaineRepository.findAll().forEach(domaine -> {
                    OffreEmploi offreEmploi = new OffreEmploi();
                    offreEmploi.setEmployeur(employeur);
                    offreEmploi.setVille(ville);
                    offreEmploi.setDomaine(domaine);
                    // set other properties

                    offreEmploi.setContrat("CDI"); // replace with actual value
                    offreEmploi.setEntreprise("Marsa Maroc"); // replace with actual value
                    offreEmploi.setSite_web("Marsa.ma"); // replace with actual value
                    offreEmploi.setSalaire("7000"); // replace with actual value
                    offreEmploi.setNiveauEtude("Bac+3"); // replace with actual value
                    offreEmploi.setTitre("Devlopper"); // replace with actual value
                    offreEmploi.setDescription("Job description"); // replace with actual value
                    offreEmploi.setStatus("Past time"); // replace with actual value

                    assign an image from the list
                    int imageIndex = offreEmploiRepository.findAll().size() % imageCount;
                    offreEmploi.setImage(images.get(imageIndex));
                   offreEmploiRepository.save(offreEmploi);
                });
            });
        });
    }

*/

}
