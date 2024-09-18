package com.Niaxtu.gestionCible.Exceptions;



public class CiblePriveeNotFoundException extends RuntimeException {
    public CiblePriveeNotFoundException(Long id) {
        super("Cible privée avec ID " + id + " non trouvée.");
    }
}

