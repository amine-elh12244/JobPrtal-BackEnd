package com.example.portailemploi.Controller;

import com.example.portailemploi.entities.Domaine;
import com.example.portailemploi.entities.OffreEmploi;
import com.example.portailemploi.entities.Ville;
import com.example.portailemploi.services.DomaineService;
import com.example.portailemploi.services.VilleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
@RequestMapping("/domaines")
public class DomaineController {

    @Autowired
    private DomaineService domaineService;

    @GetMapping
    public List<Domaine> getDomaines() {
        return domaineService.getAllDomaines();
    }

    @GetMapping("/{id}")
    public Domaine getDomaine(@PathVariable Long id) {
        return domaineService.getDomaineById(id).orElse(null);
    }



    //@GetMapping("/{id}/offresEmploi")
   // public List<OffreEmploi> getOffresEmploiByDomaine(@PathVariable Long id) {
    //    return domaineService.getOffresEmploiByVilleId(id);
   // }


}


