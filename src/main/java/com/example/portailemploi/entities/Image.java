package com.example.portailemploi.entities;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Image {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String type;
    @Lob
    @Column(columnDefinition="MEDIUMBLOB")
    private byte[] data;
    @OneToOne(fetch = FetchType.LAZY ,mappedBy = "image")
    //@JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @JsonManagedReference("image-offre")
    private OffreEmploi offreEmploi;

    public Image(String nom, String type, byte[] data) {
        this.nom = nom;
        this.type = type;
        this.data = data;
    }
}
