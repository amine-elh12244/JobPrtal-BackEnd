package com.example.portailemploi.dao;

import com.example.portailemploi.entities.OffreEmploi;
import com.example.portailemploi.entities.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface VilleRepository extends JpaRepository<Ville,Long> {

    List<OffreEmploi> findOffreEmploiById(Long id);


}
