package com.Niaxtu.gestionCible.repository;

import com.Niaxtu.gestionCible.entities.Secteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecteurRepository extends JpaRepository<Secteur, Long> {
    // Vous pouvez ajouter des méthodes personnalisées si nécessaire
}

