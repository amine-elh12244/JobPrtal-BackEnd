package com.example.portailemploi.services;



import com.example.portailemploi.dao.EmployeurRepository;
import com.example.portailemploi.entities.Employeur;
import com.example.portailemploi.entities.OffreEmploi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class EmployeurService {

    @Autowired
    private EmployeurRepository employeurRepository;


    //  public Page<Employeur> getAllEmployeurs(Pageable pageable) {
    //    return employeurRepository.findAll(pageable);
    // }

    public Employeur saveEmployeur(Employeur employeur) {
        // You may want to add validation logic or other business logic before saving
        return employeurRepository.save(employeur);

    }

    public List<Employeur> getAllEmployeurs() {
        return employeurRepository.findAll();
    }

    public Optional<Employeur> getEmployeurById(Long employeurId) {
        return employeurRepository.findById(employeurId);
    }



    public List<OffreEmploi> getOffresEmploiByEmployeurId(Long employeurId) {

        return employeurRepository.findAllByEmployeur(employeurId);

    }



    public void deleteEmployeur(Long employeurId) {
        employeurRepository.deleteById(employeurId);
    }



    // You may want to add methods for updating and deleting Employeurs

    // Example of fetching all Employeurs with job offers
    public List<Employeur> getAllEmployeursWithJobOffers() {
        return employeurRepository.getAllWithJobOffers();
    }
}
