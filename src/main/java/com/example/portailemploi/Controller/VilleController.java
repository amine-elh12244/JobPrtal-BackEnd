package com.example.portailemploi.Controller;


import com.example.portailemploi.entities.Employeur;
import com.example.portailemploi.entities.OffreEmploi;
import com.example.portailemploi.entities.Ville;
import com.example.portailemploi.services.VilleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/villes")

public class VilleController {

    @Autowired
    private VilleService VilleService;

    @GetMapping
    public List<Ville> getVilles() {
        return VilleService.getAllVilles();
    }

    @GetMapping("/{id}")
    public Ville getVille(@PathVariable Long id) {
        return VilleService.getVilleById(id).orElse(null);
    }



    @GetMapping("/{id}/offresEmploi")
    public List<OffreEmploi> getOffresEmploiByVille(@PathVariable Long id) {
        return VilleService.getOffresEmploiByVilleId(id);
    }




}
