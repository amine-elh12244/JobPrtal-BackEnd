package com.example.portailemploi.entities;




import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Ville {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    @OneToMany(mappedBy = "ville")
    //  @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @JsonManagedReference("ville-offre")
    private List<OffreEmploi> OffreEmploi;


    public Ville(String nom) {
        this.nom = nom;
    }




}
