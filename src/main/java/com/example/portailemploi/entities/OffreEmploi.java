package com.example.portailemploi.entities;



import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OffreEmploi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    // @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @JsonBackReference("employeur-offre")
    @JoinColumn(name = "employeur_id")
    private Employeur employeur;

    @ManyToOne
    // @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @JsonBackReference("domaine-offre")
    @JoinColumn(name = "domaine_id")
    private Domaine domaine;





    private String contrat;

    private String entreprise;

    private String Site_web;


    private String salaire;

    @Column(name = "niveau_etude")
    private String niveauEtude;

    private String titre;

    private String description;

    private String status;

    @ManyToOne
    // @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @JsonBackReference("ville-offre")
    @JoinColumn(name = "ville_id")
    private Ville ville;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    // @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @JsonBackReference("image-offre")
    @JoinColumn(name="img_id")
    private Image image;


    public OffreEmploi(Employeur employeur, Domaine domaine, String contrat, String entreprise, String site_web, String salaire, String niveauEtude, String titre, String description, String status, Ville ville, Image image) {
        this.employeur = employeur;
        this.domaine = domaine;
        this.contrat = contrat;
        this.entreprise = entreprise;
        Site_web = site_web;
        this.salaire = salaire;
        this.niveauEtude = niveauEtude;
        this.titre = titre;
        this.description = description;
        this.status = status;
        this.ville = ville;
        this.image = image;
    }




}

