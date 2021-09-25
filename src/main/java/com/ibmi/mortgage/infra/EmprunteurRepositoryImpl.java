package com.ibmi.mortgage.infra;

import com.ibmi.mortgage.domain.entites.Emprunteur;
import com.ibmi.mortgage.domain.repo.EmprunteurRepository;
import org.springframework.stereotype.Component;

@Component
public class EmprunteurRepositoryImpl implements EmprunteurRepository {

    @Override
    public Emprunteur getEmprunteur(String idEmprunteur) {
        return null;
    }
}
