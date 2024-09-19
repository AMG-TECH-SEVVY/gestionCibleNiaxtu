package com.Niaxtu.gestionCible.web;

import com.Niaxtu.gestionCible.entities.Structure;
import com.Niaxtu.gestionCible.entities.SousSecteur;
import com.Niaxtu.gestionCible.entities.Secteur;
import com.Niaxtu.gestionCible.services.StructureService;
import com.Niaxtu.gestionCible.services.SousSecteurService;
import com.Niaxtu.gestionCible.services.SecteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class GestionCibleController {

    private final StructureService structureService;
    private final SousSecteurService sousSecteurService;
    private final SecteurService secteurService;

    @Autowired
    public GestionCibleController(StructureService structureService, SousSecteurService sousSecteurService, SecteurService secteurService) {
        this.structureService = structureService;
        this.sousSecteurService = sousSecteurService;
        this.secteurService = secteurService;
    }

    // ********** Endpoints pour Structure **********

    @GetMapping("/structures")
    public List<Structure> getAllStructures() {
        return structureService.getAllStructures();
    }

    @GetMapping("/structures/{id}")
    public ResponseEntity<Structure> getStructureById(@PathVariable Long id) {
        Optional<Structure> structure = structureService.getStructureById(id);
        return structure.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/structures")
    public Structure createStructure(@RequestBody Structure structure) {
        return structureService.createStructure(structure);
    }

    @PutMapping("/structures/{id}")
    public ResponseEntity<Structure> updateStructure(@PathVariable Long id, @RequestBody Structure updatedStructure) {
        Structure structure = structureService.updateStructure(id, updatedStructure);
        return ResponseEntity.ok(structure);
    }

    @DeleteMapping("/structures/{id}")
    public ResponseEntity<Void> deleteStructure(@PathVariable Long id) {
        structureService.deleteStructure(id);
        return ResponseEntity.noContent().build();
    }

    // ********** Endpoints pour SousSecteur **********

    @GetMapping("/sous-secteurs")
    public List<SousSecteur> getAllSousSecteurs() {
        return sousSecteurService.getAllSousSecteurs();
    }

    @GetMapping("/sous-secteurs/{id}")
    public ResponseEntity<SousSecteur> getSousSecteurById(@PathVariable Long id) {
        Optional<SousSecteur> sousSecteur = sousSecteurService.getSousSecteurById(id);
        return sousSecteur.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/sous-secteurs")
    public SousSecteur createSousSecteur(@RequestBody SousSecteur sousSecteur) {
        return sousSecteurService.createSousSecteur(sousSecteur);
    }

    @PutMapping("/sous-secteurs/{id}")
    public ResponseEntity<SousSecteur> updateSousSecteur(@PathVariable Long id, @RequestBody SousSecteur updatedSousSecteur) {
        SousSecteur sousSecteur = sousSecteurService.updateSousSecteur(id, updatedSousSecteur);
        return ResponseEntity.ok(sousSecteur);
    }

    @DeleteMapping("/sous-secteurs/{id}")
    public ResponseEntity<Void> deleteSousSecteur(@PathVariable Long id) {
        sousSecteurService.deleteSousSecteur(id);
        return ResponseEntity.noContent().build();
    }

    // ********** Endpoints pour Secteur **********

    @GetMapping("/secteurs")
    public List<Secteur> getAllSecteurs() {
        return secteurService.getAllSecteurs();
    }

    @GetMapping("/secteurs/{id}")
    public ResponseEntity<Secteur> getSecteurById(@PathVariable Long id) {
        Optional<Secteur> secteur = secteurService.getSecteurById(id);
        return secteur.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/secteurs")
    public Secteur createSecteur(@RequestBody Secteur secteur) {
        return secteurService.createSecteur(secteur);
    }

    @PutMapping("/secteurs/{id}")
    public ResponseEntity<Secteur> updateSecteur(@PathVariable Long id, @RequestBody Secteur updatedSecteur) {
        Secteur secteur = secteurService.updateSecteur(id, updatedSecteur);
        return ResponseEntity.ok(secteur);
    }

    @DeleteMapping("/secteurs/{id}")
    public ResponseEntity<Void> deleteSecteur(@PathVariable Long id) {
        secteurService.deleteSecteur(id);
        return ResponseEntity.noContent().build();
    }
}
