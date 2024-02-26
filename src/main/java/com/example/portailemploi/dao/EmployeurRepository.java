package com.example.portailemploi.dao;



import com.example.portailemploi.entities.Employeur;
import com.example.portailemploi.entities.OffreEmploi;
import org.hibernate.query.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;

import java.util.List;

@RepositoryRestResource


public interface EmployeurRepository extends JpaRepository<Employeur, Long> {

    @Query("SELECT DISTINCT e FROM Employeur e LEFT JOIN FETCH e.offresEmploi")
    List<Employeur> getAllWithJobOffers();



    @Query("select O from OffreEmploi O where O.employeur.id = :idC")
    List<OffreEmploi> findAllByEmployeur(@Param("idC") Long id);




}
