package ma.elom;
import java.util.Arrays;
import java.util.Scanner;

public class GestionEmployes {
    private static Employe[] employes = new Employe[50]; // Tableau d'employés
    private static int nbEmployes = 0; // Nombre d'employés dans le tableau

    // Méthode pour afficher le menu principal
    public static void printMenu() {
        System.out.println("\n--- Menu Principal ---");
        System.out.println("1. Ajouter un employé");
        System.out.println("2. Modifier un employé");
        System.out.println("3. Supprimer un employé");
        System.out.println("4. Afficher la liste des employés");
        System.out.println("5. Rechercher un employé");
        System.out.println("6. Calculer la masse salariale");
        System.out.println("7. Trier les employés par salaire");
        System.out.println("8. Quitter");
    }

    // Ajouter un employé
    public static void ajouterEmploye(Employe employe) {
        if (nbEmployes < employes.length) {
            employes[nbEmployes++] = employe;
            System.out.println("Employé ajouté avec succès.");
        } else {
            System.out.println("Erreur : Le tableau des employés est plein.");
        }
    }

    // Modifier un employé
    public static void modifierEmploye(int id, String nouveauNom, String nouveauPoste, double nouveauSalaire) {
        for (int i = 0; i < nbEmployes; i++) {
            if (employes[i].getId() == id) {
                employes[i].setNom(nouveauNom);
                employes[i].setPoste(nouveauPoste);
                employes[i].setSalaire(nouveauSalaire);
                System.out.println("Employé modifié avec succès.");
                return;
            }
        }
        System.out.println("Erreur : Aucun employé trouvé avec cet ID.");
    }

    // Supprimer un employé
    public static void supprimerEmploye(int id) {
        for (int i = 0; i < nbEmployes; i++) {
            if (employes[i].getId() == id) {
                employes[i] = employes[--nbEmployes];
                employes[nbEmployes] = null;
                System.out.println("Employé supprimé avec succès.");
                return;
            }
        }
        System.out.println("Erreur : Aucun employé trouvé avec cet ID.");
    }

    // Afficher tous les employés
    public static void afficherEmployes() {
        if (nbEmployes == 0) {
            System.out.println("Aucun employé à afficher.");
        } else {
            for (int i = 0; i < nbEmployes; i++) {
                System.out.println(employes[i]);
            }
        }
    }

    // Rechercher un employé par nom ou poste
    public static void rechercherEmploye(String critere) {
        boolean trouve = false;
        for (int i = 0; i < nbEmployes; i++) {
            if (employes[i].getNom().equalsIgnoreCase(critere) || employes[i].getPoste().equalsIgnoreCase(critere)) {
                System.out.println(employes[i]);
                trouve = true;
            }
        }
        if (!trouve) {
            System.out.println("Aucun employé trouvé avec ce critère.");
        }
    }

    // Calculer la masse salariale
    public static void calculerMasseSalariale() {
        double somme = 0;
        for (int i = 0; i < nbEmployes; i++) {
            somme += employes[i].getSalaire();
        }
        System.out.println("Masse salariale totale : " + somme);
    }

    // Trier les employés par salaire
    public static void trierEmployesParSalaire(boolean ordreCroissant) {
        Employe[] employesTries = Arrays.copyOf(employes, nbEmployes);
        Arrays.sort(employesTries, (e1, e2) -> {
            return ordreCroissant ? Employe.compareParSalaire(e1, e2) : Employe.compareParSalaire(e2, e1);
        });
        for (Employe e : employesTries) {
            System.out.println(e);
        }
    }

    // Méthode principale
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choix;
        do {
            printMenu();
            System.out.print("Choix : ");
            choix = scanner.nextInt();
            scanner.nextLine(); // Consommer la ligne

            switch (choix) {
                case 1:
                    System.out.print("ID : ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nom : ");
                    String nom = scanner.nextLine();
                    System.out.print("Poste : ");
                    String poste = scanner.nextLine();
                    System.out.print("Salaire : ");
                    double salaire = scanner.nextDouble();
                    ajouterEmploye(new Employe(id, nom, poste, salaire));
                    break;
                case 2:
                    System.out.print("ID de l'employé à modifier : ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nouveau nom : ");
                    nom = scanner.nextLine();
                    System.out.print("Nouveau poste : ");
                    poste = scanner.nextLine();
                    System.out.print("Nouveau salaire : ");
                    salaire = scanner.nextDouble();
                    modifierEmploye(id, nom, poste, salaire);
                    break;
                case 3:
                    System.out.print("ID de l'employé à supprimer : ");
                    id = scanner.nextInt();
                    supprimerEmploye(id);
                    break;
                case 4:
                    afficherEmployes();
                    break;
                case 5:
                    System.out.print("Nom ou poste à rechercher : ");
                    String critere = scanner.nextLine();
                    rechercherEmploye(critere);
                    break;
                case 6:
                    calculerMasseSalariale();
                    break;
                case 7:
                    System.out.print("Trier par ordre croissant (true/false) : ");
                    boolean ordreCroissant = scanner.nextBoolean();
                    trierEmployesParSalaire(ordreCroissant);
                    break;
                case 8:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide.");
            }
        } while (choix != 8);

        scanner.close();
    }
    
}

