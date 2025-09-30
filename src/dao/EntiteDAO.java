package dao;

import modele.Entite;
import java.util.List;

public interface EntiteDAO {

    List<Entite> getAllEntites();

    List<Entite> filtrerParPreuves(List<String> preuvesSelectionnees);

}
