package com.example.portailemploi.services;




import com.example.portailemploi.dao.DomaineRepository;
import com.example.portailemploi.entities.Domaine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DomaineService {

    @Autowired
    private DomaineRepository domaineRepository;

    public List<Domaine> getAllDomaines() {
        return domaineRepository.findAll();
    }

    public Optional<Domaine> getDomaineById(Long id) {
        return domaineRepository.findById(id);
    }

    public Domaine saveDomaine(Domaine domaine) {
        return domaineRepository.save(domaine);
    }

    public void deleteDomaine(Long id) {
        domaineRepository.deleteById(id);
    }
}
