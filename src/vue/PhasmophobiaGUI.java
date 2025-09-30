package vue;

import controleur.PhasmophobiaControleur;
import modele.Entite;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class PhasmophobiaGUI extends JFrame {

    private PhasmophobiaControleur controleur;

    private JCheckBox[] checkboxesPreuves;
    private JTextArea zoneResultats;
    private JButton boutonRechercher;
    private JButton boutonReinitialiser;
    private JLabel labelNombreResultats;

    public PhasmophobiaGUI() {
        controleur = new PhasmophobiaControleur();

        setTitle("Phasmophobia Guide - Identificateur d'Entités");
        setSize(900, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        creerInterface();
        setVisible(true);
    }

    private void creerInterface() {
        setLayout(new BorderLayout(10, 10));
        add(creerPanneauTitre(), BorderLayout.NORTH);
        add(creerPanneauPreuves(), BorderLayout.WEST);
        add(creerPanneauResultats(), BorderLayout.CENTER);
        add(creerPanneauBoutons(), BorderLayout.SOUTH);
    }

    private JPanel creerPanneauTitre() {
        JPanel panneau = new JPanel();
        panneau.setBackground(new Color(45, 45, 45)); // Fond sombre
        panneau.setBorder(BorderFactory.createEmptyBorder(15, 10, 15, 10));

        JLabel titre = new JLabel("🔍 PHASMOPHOBIA GUIDE");
        titre.setFont(new Font("Arial", Font.BOLD, 28));
        titre.setForeground(Color.WHITE);

        JLabel sousTitre = new JLabel("Sélectionnez les preuves pour identifier l'entité");
        sousTitre.setFont(new Font("Arial", Font.PLAIN, 14));
        sousTitre.setForeground(new Color(200, 200, 200));

        panneau.setLayout(new BoxLayout(panneau, BoxLayout.Y_AXIS));
        titre.setAlignmentX(Component.CENTER_ALIGNMENT);
        sousTitre.setAlignmentX(Component.CENTER_ALIGNMENT);

        panneau.add(titre);
        panneau.add(Box.createVerticalStrut(5));
        panneau.add(sousTitre);

        return panneau;
    }

    private JPanel creerPanneauPreuves() {
        JPanel panneau = new JPanel();
        panneau.setLayout(new BoxLayout(panneau, BoxLayout.Y_AXIS));
        panneau.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(Color.GRAY, 2),
                "Preuves trouvées",
                0,
                0,
                new Font("Arial", Font.BOLD, 16)
        ));
        panneau.setBackground(Color.WHITE);

        String[] preuves = controleur.getPreuvesPossibles();
        checkboxesPreuves = new JCheckBox[preuves.length];

        for (int i = 0; i < preuves.length; i++) {
            checkboxesPreuves[i] = new JCheckBox(preuves[i]);
            checkboxesPreuves[i].setFont(new Font("Arial", Font.PLAIN, 14));
            checkboxesPreuves[i].setBackground(Color.WHITE);
            checkboxesPreuves[i].setFocusPainted(false);

            panneau.add(checkboxesPreuves[i]);
            panneau.add(Box.createVerticalStrut(10)); // Espacement
        }

        panneau.add(Box.createVerticalGlue());

        return panneau;
    }

    private JPanel creerPanneauResultats() {
        JPanel panneau = new JPanel(new BorderLayout(5, 5));
        panneau.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        labelNombreResultats = new JLabel("Sélectionnez des preuves pour commencer");
        labelNombreResultats.setFont(new Font("Arial", Font.BOLD, 14));
        labelNombreResultats.setForeground(new Color(100, 100, 100));
        panneau.add(labelNombreResultats, BorderLayout.NORTH);

        zoneResultats = new JTextArea();
        zoneResultats.setEditable(false);
        zoneResultats.setFont(new Font("Monospaced", Font.PLAIN, 13));
        zoneResultats.setLineWrap(true);
        zoneResultats.setWrapStyleWord(true);
        zoneResultats.setMargin(new Insets(10, 10, 10, 10));

        JScrollPane scrollPane = new JScrollPane(zoneResultats);
        scrollPane.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));

        panneau.add(scrollPane, BorderLayout.CENTER);

        return panneau;
    }

    private JPanel creerPanneauBoutons() {
        JPanel panneau = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        panneau.setBackground(new Color(240, 240, 240));

        boutonRechercher = new JButton("🔍 Rechercher");
        boutonRechercher.setFont(new Font("Arial", Font.BOLD, 16));
        boutonRechercher.setPreferredSize(new Dimension(180, 45));
        boutonRechercher.setBackground(new Color(76, 175, 80)); // Vert
        boutonRechercher.setForeground(Color.WHITE);
        boutonRechercher.setFocusPainted(false);
        boutonRechercher.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        boutonRechercher.setCursor(new Cursor(Cursor.HAND_CURSOR));

        boutonReinitialiser = new JButton("🔄 Réinitialiser");
        boutonReinitialiser.setFont(new Font("Arial", Font.BOLD, 16));
        boutonReinitialiser.setPreferredSize(new Dimension(180, 45));
        boutonReinitialiser.setBackground(new Color(244, 67, 54)); // Rouge
        boutonReinitialiser.setForeground(Color.WHITE);
        boutonReinitialiser.setFocusPainted(false);
        boutonReinitialiser.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        boutonReinitialiser.setCursor(new Cursor(Cursor.HAND_CURSOR));

        boutonRechercher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                effectuerRecherche();
            }
        });

        boutonReinitialiser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reinitialiser();
            }
        });

        panneau.add(boutonRechercher);
        panneau.add(boutonReinitialiser);

        return panneau;
    }

    private void effectuerRecherche() {
        List<String> preuvesSelectionnees = new ArrayList<>();

        for (JCheckBox checkbox : checkboxesPreuves) {
            if (checkbox.isSelected()) {
                preuvesSelectionnees.add(checkbox.getText());
            }
        }
        List<Entite> resultats = controleur.rechercherEntites(preuvesSelectionnees);

        afficherResultats(resultats, preuvesSelectionnees.size());
    }

    private void afficherResultats(List<Entite> entites, int nombrePreuves) {

        zoneResultats.setText("");

        if (nombrePreuves == 0) {
            labelNombreResultats.setText("📊 Toutes les entités (" + entites.size() + " fantômes)");
            labelNombreResultats.setForeground(new Color(33, 150, 243)); // Bleu
        } else if (entites.isEmpty()) {
            labelNombreResultats.setText("⚠️ Aucune entité trouvée - Combinaison impossible !");
            labelNombreResultats.setForeground(new Color(244, 67, 54)); // Rouge
            zoneResultats.setText("Aucune entité ne correspond à cette combinaison de preuves.\n\n"
                    + "Vérifiez que vous avez bien identifié les preuves in-game.\n"
                    + "Certaines combinaisons de preuves sont impossibles dans Phasmophobia.");
            return;
        } else if (entites.size() == 1) {
            labelNombreResultats.setText("✅ 1 entité trouvée - Identification précise !");
            labelNombreResultats.setForeground(new Color(76, 175, 80)); // Vert
        } else {
            labelNombreResultats.setText("🔍 " + entites.size() + " entités possibles");
            labelNombreResultats.setForeground(new Color(255, 152, 0)); // Orange
        }

        StringBuilder texte = new StringBuilder();

        for (int i = 0; i < entites.size(); i++) {
            Entite entite = entites.get(i);

            texte.append("═══════════════════════════════════════════════════\n");
            texte.append("👻 ").append(entite.getNom().toUpperCase()).append("\n");
            texte.append("═══════════════════════════════════════════════════\n\n");

            texte.append("📋 PREUVES :\n");
            for (String preuve : entite.getPreuves()) {
                texte.append("   ✓ ").append(preuve).append("\n");
            }

            texte.append("\n");

            texte.append("🔹 PARTICULARITÉS :\n");
            for (String particularite : entite.getParticularites()) {
                texte.append("   • ").append(particularite).append("\n");
            }

            if (i < entites.size() - 1) {
                texte.append("\n\n");
            }
        }

        zoneResultats.setText(texte.toString());
        zoneResultats.setCaretPosition(0);
    }

    private void reinitialiser() {

        for (JCheckBox checkbox : checkboxesPreuves) {
            checkbox.setSelected(false);
        }

        zoneResultats.setText("");
        labelNombreResultats.setText("Sélectionnez des preuves pour commencer");
        labelNombreResultats.setForeground(new Color(100, 100, 100));
    }
}