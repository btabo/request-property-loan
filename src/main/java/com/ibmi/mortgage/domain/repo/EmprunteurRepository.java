package com.ibmi.mortgage.domain.repo;

import com.ibmi.mortgage.domain.entites.Emprunteur;

public interface EmprunteurRepository {

    Emprunteur getEmprunteur(String idEmprunteur);

}
