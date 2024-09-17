package com.Niaxtu.gestionCible.repository;

import com.Niaxtu.gestionCible.entities.Structure;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StructureRepository extends JpaRepository<Structure, Long> {
    // Méthodes de requêtes spécifiques peuvent être ajoutées ici
}

