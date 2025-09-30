package modele;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Entite {

    private String nom;
    private List<String> preuves;
    private List<String> particularites;

    public Entite(String nom, List<String> preuves, List<String> particularites) {
        this.nom = nom;
        this.preuves = Collections.unmodifiableList(new ArrayList<>(preuves));
        this.particularites = Collections.unmodifiableList(new ArrayList<>(particularites));
    }

    public String getNom() {
        return nom;
    }

    public List<String> getPreuves() {
        return preuves;
    }

    public List<String> getParticularites() {
        return particularites;
    }


}
