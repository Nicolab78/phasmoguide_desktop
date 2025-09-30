package dao;

import modele.Entite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EntiteDAOImpl implements EntiteDAO {

    private List<Entite> entites;

    public EntiteDAOImpl() {
        entites = new ArrayList<>();
        initialiserEntites();
    }

    private void initialiserEntites() {

        // SPIRIT
        entites.add(new Entite(
                "Spirit",
                Arrays.asList("EMF 5", "Spirit Box", "Écriture fantôme"),
                Arrays.asList(
                        "Devient moins actif après utilisation d'encens",
                        "Vitesse normale (1.7 m/s)",
                        "Le fantôme le plus commun"
                )
        ));

        // WRAITH
        entites.add(new Entite(
                "Wraith",
                Arrays.asList("EMF 5", "Spirit Box", "D.O.T.S Projector"),
                Arrays.asList(
                        "Ne laisse pas de traces UV au sol en marchant",
                        "Peut se téléporter près des joueurs",
                        "Vitesse normale (1.7 m/s)"
                )
        ));

        // PHANTOM
        entites.add(new Entite(
                "Phantom",
                Arrays.asList("Spirit Box", "Empreintes digitales", "D.O.T.S Projector"),
                Arrays.asList(
                        "Disparaît temporairement si on le prend en photo",
                        "Baisse la santé mentale très rapidement",
                        "Visible moins longtemps pendant les chasses",
                        "Vitesse normale (1.7 m/s)"
                )
        ));

        // POLTERGEIST
        entites.add(new Entite(
                "Poltergeist",
                Arrays.asList("Spirit Box", "Empreintes digitales", "Écriture fantôme"),
                Arrays.asList(
                        "Lance plusieurs objets à la fois",
                        "Très actif avec les objets",
                        "Moins dangereux dans les pièces vides",
                        "Peut lancer tous les objets d'une pièce en même temps",
                        "Vitesse normale (1.7 m/s)"
                )
        ));

        // BANSHEE
        entites.add(new Entite(
                "Banshee",
                Arrays.asList("Empreintes digitales", "Orbes fantômes", "D.O.T.S Projector"),
                Arrays.asList(
                        "Cible une seule personne à la fois jusqu'à sa mort",
                        "Peur des crucifix (portée augmentée à 5m)",
                        "Chante dans le microphone parabolique (fréquence unique 33Hz)",
                        "Ignore les autres joueurs pendant la chasse",
                        "Vitesse normale (1.7 m/s)"
                )
        ));

        // JINN
        entites.add(new Entite(
                "Jinn",
                Arrays.asList("EMF 5", "Empreintes digitales", "Températures glaciales"),
                Arrays.asList(
                        "Plus rapide si loin du joueur avec électricité allumée (2.5 m/s)",
                        "Ne peut pas couper l'électricité générale",
                        "Peut baisser la santé mentale de 25% avec son pouvoir",
                        "Vitesse normale si électricité éteinte (1.7 m/s)"
                )
        ));

        // MARE
        entites.add(new Entite(
                "Mare",
                Arrays.asList("Spirit Box", "Orbes fantômes", "Écriture fantôme"),
                Arrays.asList(
                        "Plus actif dans le noir",
                        "Allume rarement les lumières",
                        "Peut éteindre les lumières immédiatement après qu'on les allume",
                        "Peut chasser à 60% de santé mentale dans le noir (40% avec lumière)",
                        "Vitesse normale (1.7 m/s)"
                )
        ));

        // REVENANT
        entites.add(new Entite(
                "Revenant",
                Arrays.asList("Orbes fantômes", "Écriture fantôme", "Températures glaciales"),
                Arrays.asList(
                        "Très lent quand il ne voit personne (1 m/s)",
                        "Très rapide pendant une chasse s'il voit quelqu'un (3 m/s)",
                        "Le plus rapide du jeu en chasse active",
                        "Se cache efficacement : restez hors de vue"
                )
        ));

        // SHADE
        entites.add(new Entite(
                "Shade",
                Arrays.asList("EMF 5", "Écriture fantôme", "Températures glaciales"),
                Arrays.asList(
                        "Très timide, moins actif si plusieurs personnes à proximité",
                        "Difficile à trouver et à identifier",
                        "Ne commence pas de chasse au-dessus de 35% de santé mentale",
                        "Ne peut pas manifester d'événement fantôme si joueurs dans la pièce",
                        "Vitesse normale (1.7 m/s)"
                )
        ));

        // DEMON
        entites.add(new Entite(
                "Demon",
                Arrays.asList("Empreintes digitales", "Écriture fantôme", "Températures glaciales"),
                Arrays.asList(
                        "Très agressif, peut chasser à 70% de santé mentale",
                        "Temps de récupération entre chasses très réduit (20s au lieu de 25s)",
                        "L'encens l'empêche de chasser moins longtemps (60s au lieu de 90s)",
                        "Peut chasser sans baisser la santé mentale",
                        "Vitesse normale (1.7 m/s)"
                )
        ));

        // YUREI
        entites.add(new Entite(
                "Yurei",
                Arrays.asList("Orbes fantômes", "Températures glaciales", "D.O.T.S Projector"),
                Arrays.asList(
                        "Baisse la santé mentale plus rapidement à proximité",
                        "Peut fermer des portes complètement (pas juste les pousser)",
                        "L'encens le piège dans sa pièce plus longtemps (90s)",
                        "Son pouvoir fait perdre 15% de santé mentale",
                        "Vitesse normale (1.7 m/s)"
                )
        ));

        // ONI
        entites.add(new Entite(
                "Oni",
                Arrays.asList("EMF 5", "Températures glaciales", "D.O.T.S Projector"),
                Arrays.asList(
                        "Très actif quand plusieurs personnes à proximité",
                        "Lance des objets très loin et très vite",
                        "Visible plus longtemps en D.O.T.S et pendant manifestations",
                        "Ne peut jamais faire l'événement fantôme 'air ball'",
                        "Vitesse normale (1.7 m/s)"
                )
        ));

        // YOKAI
        entites.add(new Entite(
                "Yokai",
                Arrays.asList("Spirit Box", "Orbes fantômes", "D.O.T.S Projector"),
                Arrays.asList(
                        "Attiré par les voix des joueurs",
                        "Peut chasser à 80% de santé mentale si on parle près de lui",
                        "Portée d'audition réduite pendant les chasses (2m au lieu de 20m)",
                        "Détecte moins bien l'équipement électronique (2.5m)",
                        "Vitesse normale (1.7 m/s)"
                )
        ));

        // HANTU
        entites.add(new Entite(
                "Hantu",
                Arrays.asList("Empreintes digitales", "Orbes fantômes", "Températures glaciales"),
                Arrays.asList(
                        "Plus rapide dans le froid et si électricité éteinte (2.7 m/s)",
                        "Plus lent dans les pièces chaudes (1.4 m/s)",
                        "Souffle visible pendant les chasses par temps froid",
                        "Ne peut jamais allumer l'électricité générale",
                        "Vitesse variable selon température"
                )
        ));

        // GORYO
        entites.add(new Entite(
                "Goryo",
                Arrays.asList("EMF 5", "Empreintes digitales", "D.O.T.S Projector"),
                Arrays.asList(
                        "D.O.T.S visible UNIQUEMENT à travers une caméra vidéo",
                        "Ne peut pas être vu à l'œil nu dans le D.O.T.S",
                        "Ne change jamais de pièce favorite si joueurs loin",
                        "Ne s'éloigne presque jamais de sa pièce",
                        "Vitesse normale (1.7 m/s)"
                )
        ));

        // MYLING
        entites.add(new Entite(
                "Myling",
                Arrays.asList("EMF 5", "Empreintes digitales", "Écriture fantôme"),
                Arrays.asList(
                        "Très silencieux pendant les chasses",
                        "Bruits de pas audibles à 12m au lieu de 20m",
                        "Sons paranormaux plus fréquents sur microphone parabolique",
                        "Difficile à entendre arriver pendant une chasse",
                        "Vitesse normale (1.7 m/s)"
                )
        ));

        // ONRYO
        entites.add(new Entite(
                "Onryo",
                Arrays.asList("Spirit Box", "Orbes fantômes", "Températures glaciales"),
                Arrays.asList(
                        "Éteint les flammes (bougies, briquets, feu de camp)",
                        "Peut chasser après avoir éteint une 3ème flamme même à haute santé mentale",
                        "Les flammes allumées réduisent les chances de chasse",
                        "Chaque flamme éteinte = chance de chasse augmentée",
                        "Vitesse normale (1.7 m/s)"
                )
        ));

        // THE TWINS
        entites.add(new Entite(
                "The Twins",
                Arrays.asList("EMF 5", "Spirit Box", "Températures glaciales"),
                Arrays.asList(
                        "Deux entités distinctes qui partagent les mêmes preuves",
                        "Peut interagir avec deux objets simultanément dans des pièces différentes",
                        "Un jumeau rapide (1.9 m/s), un lent (1.5 m/s)",
                        "Peut chasser depuis deux endroits différents",
                        "Difficile à localiser précisément"
                )
        ));

        // RAIJU
        entites.add(new Entite(
                "Raiju",
                Arrays.asList("EMF 5", "Orbes fantômes", "D.O.T.S Projector"),
                Arrays.asList(
                        "Plus rapide près d'équipement électronique actif (2.5 m/s)",
                        "Peut chasser à 65% de santé mentale près d'équipement actif",
                        "Perturbe l'équipement électronique à plus grande distance (15m au lieu de 10m)",
                        "Vitesse normale sans équipement actif (1.7 m/s)"
                )
        ));

        // OBAKE
        entites.add(new Entite(
                "Obake",
                Arrays.asList("EMF 5", "Empreintes digitales", "Orbes fantômes"),
                Arrays.asList(
                        "Change d'apparence pendant les chasses (métamorphose)",
                        "Peut laisser des empreintes à 6 doigts (rare)",
                        "Empreintes UV disparaissent 2x plus vite (1 minute au lieu de 2)",
                        "Peut ne laisser aucune empreinte UV (16.7% de chances)",
                        "Vitesse normale (1.7 m/s)"
                )
        ));

        // THE MIMIC
        entites.add(new Entite(
                "The Mimic",
                Arrays.asList("Spirit Box", "Empreintes digitales", "Températures glaciales"),
                Arrays.asList(
                        "⚠️ DONNE TOUJOURS DES ORBES FANTÔMES (4ème preuve obligatoire)",
                        "Imite le comportement et la vitesse d'autres fantômes",
                        "Change de fantôme imité toutes les 30s à 2 minutes",
                        "Impossible à identifier par le comportement seul",
                        "Si vous voyez 4 preuves dont Orbes, c'est forcément le Mimic"
                )
        ));

        // MOROI
        entites.add(new Entite(
                "Moroi",
                Arrays.asList("Spirit Box", "Écriture fantôme", "Températures glaciales"),
                Arrays.asList(
                        "Maudit les joueurs via Spirit Box ou micro parabolique",
                        "Plus rapide si la santé mentale du joueur maudit est basse",
                        "La malédiction baisse la santé mentale 2x plus vite",
                        "L'encens l'aveugle 2x plus longtemps (12s au lieu de 6s)",
                        "Vitesse variable selon santé mentale (1.5 à 2.25 m/s)"
                )
        ));

        // DEOGEN
        entites.add(new Entite(
                "Deogen",
                Arrays.asList("Spirit Box", "Écriture fantôme", "D.O.T.S Projector"),
                Arrays.asList(
                        "Répond TOUJOURS à la Spirit Box (même à distance, même à plusieurs)",
                        "Sait toujours où sont les joueurs (impossible de se cacher)",
                        "Très rapide si loin des joueurs (3 m/s)",
                        "Très lent si proche des joueurs (0.4 m/s)",
                        "Ne peut pas être échappé mais facile à boucler autour d'obstacles"
                )
        ));

        // THAYE
        entites.add(new Entite(
                "Thaye",
                Arrays.asList("Orbes fantômes", "Écriture fantôme", "D.O.T.S Projector"),
                Arrays.asList(
                        "Vieillit avec le temps passé près des joueurs",
                        "Très actif et rapide au début (2.75 m/s quand jeune)",
                        "Devient lent et moins agressif en vieillissant (1 m/s quand vieux)",
                        "Peut chasser à 75% de santé mentale quand jeune, 15% quand vieux",
                        "Son âge peut être vérifié avec la planche Ouija"
                )
        ));


    }

    @Override
    public List<Entite> getAllEntites() {
        return new ArrayList<>(entites);
    }


    @Override
    public List<Entite> filtrerParPreuves(List<String> preuvesSelectionnees) {

        if (preuvesSelectionnees == null || preuvesSelectionnees.isEmpty()) {
            return getAllEntites();
        }

        List<Entite> resultats = new ArrayList<>();

        for (Entite entite : entites) {

            if (entite.getPreuves().containsAll(preuvesSelectionnees)) {
                resultats.add(entite);
            }
        }

        return resultats;
    }


}
