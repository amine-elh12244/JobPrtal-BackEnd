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

public class Employeur {


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    private String nom ;
    private String prenom ;
    private String username;
    private String email ;
    private String password ;
    private String role;
    private String telephone ;
    @OneToMany(mappedBy = "employeur" )
    // @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @JsonManagedReference("employeur-offre")
    private List<OffreEmploi> offresEmploi;


    public Employeur(String nom, String prenom, String username, String email, String password, String role, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
        this.telephone = telephone;
    }



}
