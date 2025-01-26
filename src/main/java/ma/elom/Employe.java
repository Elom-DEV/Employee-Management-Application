package ma.elom;

public class Employe {

        private int id; // Identifiant unique de l'employé
        private String nom; // Nom complet de l'employé
        private String poste; // Poste occupé par l'employé
        private double salaire; // Salaire mensuel de l'employé

        // Constructeur avec tous les attributs
        public Employe(int id, String nom, String poste, double salaire) {
            this.id = id;
            this.nom = nom;
            this.poste = poste;
            this.salaire = salaire;
        }

        // Constructeur par défaut
        public Employe() {
            this.id = 0;
            this.nom = "";
            this.poste = "";
            this.salaire = 0.0;
        }

        // Getters et setters
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public String getPoste() {
            return poste;
        }

        public void setPoste(String poste) {
            this.poste = poste;
        }

        public double getSalaire() {
            return salaire;
        }

        public void setSalaire(double salaire) {
            this.salaire = salaire;
        }

        // Méthode toString pour afficher les informations de l'employé
        @Override
        public String toString() {
            return "Employe [ID=" + id + ", Nom=" + nom + ", Poste=" + poste + ", Salaire=" + salaire + "]";
        }

        // Méthode statique pour comparer deux employés par leur salaire
        public static int compareParSalaire(Employe e1, Employe e2) {
            return Double.compare(e1.getSalaire(), e2.getSalaire());
        }
    }

