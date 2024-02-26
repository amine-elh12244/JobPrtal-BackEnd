package com.example.portailemploi.dao;

import com.example.portailemploi.entities.Domaine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource

public interface DomaineRepository extends JpaRepository<Domaine,Long> {
}
