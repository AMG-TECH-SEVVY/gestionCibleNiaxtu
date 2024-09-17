package com.Niaxtu.gestionCible.repository;

import com.Niaxtu.gestionCible.entities.CiblePrivee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CibleRepository extends JpaRepository<CiblePrivee,Long> {
}
