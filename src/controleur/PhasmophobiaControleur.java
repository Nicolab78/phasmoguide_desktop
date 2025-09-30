package controleur;

import dao.EntiteDAO;
import dao.EntiteDAOImpl;
import modele.Entite;
import java.util.List;

public class PhasmophobiaControleur {

    private EntiteDAO dao;

    public PhasmophobiaControleur() {
        this.dao = new EntiteDAOImpl();
    }

    public List<Entite> getToutesLesEntites() {
        return dao.getAllEntites();
    }

    public List<Entite> rechercherEntites(List<String> preuvesSelectionnees) {

        return dao.filtrerParPreuves(preuvesSelectionnees);
    }

    public String[] getPreuvesPossibles() {
        return new String[] {
                "EMF 5",
                "Empreintes digitales",
                "Écriture fantôme",
                "Spirit Box",
                "Orbes fantômes",
                "D.O.T.S Projector",
                "Températures glaciales"
        };
    }

    public boolean combinaisonPossible(List<String> preuves) {
        if (preuves == null || preuves.isEmpty()) {
            return true;
        }

        List<Entite> resultats = dao.filtrerParPreuves(preuves);
        return !resultats.isEmpty();
    }

    public int compterResultats(List<String> preuves) {
        List<Entite> resultats = dao.filtrerParPreuves(preuves);
        return resultats.size();
    }
}