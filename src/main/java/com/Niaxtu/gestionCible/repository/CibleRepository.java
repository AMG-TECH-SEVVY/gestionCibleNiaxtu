package com.Niaxtu.gestionCible.repository;

import com.Niaxtu.gestionCible.entities.CiblePrivee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CibleRepository extends JpaRepository<CiblePrivee,Long> {
}
