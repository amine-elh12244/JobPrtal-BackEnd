package com.example.portailemploi.entities;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Domaine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    @OneToMany(mappedBy = "domaine")
    //@JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @JsonManagedReference
    private List<OffreEmploi> OffreEmploi;


    public Domaine(String nom) {
        this.nom = nom;
    }







}
