package com.example.portailemploi.dao;



import com.example.portailemploi.entities.OffreEmploi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;



@RepositoryRestResource
public interface OfferEmploiRepository extends JpaRepository<OffreEmploi, Long> {



    List<OffreEmploi> findByTitreContainingIgnoreCase(String keyName);

    List<OffreEmploi> findByNiveauEtudeIgnoreCase(String SL);

    List<OffreEmploi> findByVilleNomIgnoreCase(String villeName);

    List<OffreEmploi> findByDomaineNomIgnoreCase(String villeName);


    List<OffreEmploi> findByVilleNomIgnoreCaseAndNiveauEtudeIgnoreCaseAndDomaineNomIgnoreCase(String villeNom, String niveauEtude, String domaineNom);
    List<OffreEmploi> findByVilleNomIgnoreCaseAndNiveauEtudeIgnoreCaseAndDomaineNomIgnoreCaseAndTitreContainingIgnoreCase(String villeNom, String niveauEtude, String domaineNom, String titre);

    List<OffreEmploi> findByVilleNomIgnoreCaseAndDomaineNomIgnoreCaseAndTitreContainingIgnoreCase(String villeNom, String domaineNom, String titre);



}
