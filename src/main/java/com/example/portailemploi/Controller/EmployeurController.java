package com.example.portailemploi.Controller;


import com.example.portailemploi.entities.Employeur;
import com.example.portailemploi.entities.OffreEmploi;
import com.example.portailemploi.services.EmployeurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employeurs")
@CrossOrigin("*")
public class EmployeurController {

    @Autowired
    private EmployeurService employeurService;

    @GetMapping
    public List<Employeur> getEmployeurs() {
        return employeurService.getAllEmployeurs();
    }

    //@GetMapping
    //public Page<Employeur> getEmployeurs() {
    //  PageRequest pageable = PageRequest.of(0, 5); // Récupère la première page avec 5 éléments
    // return employeurService.getAllEmployeurs(pageable);
    //  }



    @GetMapping("/{id}")
    public Employeur getEmployeur(@PathVariable Long id) {
        return employeurService.getEmployeurById(id).orElse(null);
    }

    @PostMapping
    public Employeur save(@RequestBody Employeur employeur) {

        return employeurService.saveEmployeur(employeur);
    }

    @DeleteMapping("/{id}")
    public boolean supprimer(@PathVariable Long id) {
        employeurService.deleteEmployeur(id);
        return true;
    }

    @PutMapping("/{id}")
    public Employeur modifier(@PathVariable Long id, @RequestBody Employeur employeur) {
        employeur.setId(id);
        return employeurService.saveEmployeur(employeur);
    }


    @GetMapping("/{id}/offres")
    public List<OffreEmploi> getOffresEmploiByEmployeurId(@PathVariable Long id) {
        return employeurService.getOffresEmploiByEmployeurId(id);
    }

    @GetMapping("/employeurs-with-job-offers")
    public List<Employeur> getAllEmployeursWithJobOffers() {
        return employeurService.getAllEmployeursWithJobOffers();
    }
}

