# Projet :Rapport sur l'Application de Gestion des Employés

# 1. Introduction

L'application de gestion des employés est un programme en Java permettant d'ajouter, modifier, supprimer et afficher des employés via un menu interactif en console. Ce projet a été développé dans un cadre pédagogique pour illustrer la manipulation des objets, les tableaux et l'interaction utilisateur en Java.

## 2. Objectifs de l'application

L'objectif principal de cette application est de fournir une gestion basique des employés sans utiliser de base de données ni d'interface graphique. Elle permet de :

      - Ajouter de nouveaux employés

      -Modifier les informations d'un employé

      -Supprimer un employé

      -Afficher la liste des employés

      -Rechercher un employé par nom ou poste

      -Calculer la masse salariale totale

      -Trier les employés par salaire
# 3. Technologies Utilisées
      •	Langage : Java
      •	Environnement de développement :  IntelliJ IDEA 
      •	Concepts appliqués : Programmation orientée objet (POO), utilisation des tableaux, gestion des entrées utilisateur   
# 4. Fonctionnalités

   **4.1. Structure du Programme**
   
       L'application est composée de deux classes principales :
         •	Employé : représente un employé avec des attributs (ID, nom, poste, salaire) et des méthodes associées.
         •	Gestion Employés : contient le menu principal et les méthodes pour gérer les employés.

   **4.2. Déroulement du Programme**
   
      1.	L'utilisateur exécute le programme via la console.
      2.	Un menu interactif s'affiche, proposant différentes options.
      3.	L'utilisateur choisit une action en entrant un numéro correspondant.
      4.	Le programme effectue l'opération demandée et affiche les résultats en console.
      5.	L'utilisateur peut répéter les actions jusqu'à quitter l'application.

    

 **4.3. Gestion des Employés**  
 
 **-Ajout** : L'utilisateur entre l'ID, le nom, le poste et le salaire d'un employé. 
   
   ![Ajouter un employé](capture/ajouter-emp.png)

 **-Modification** :: Recherche d'un employé par ID et mise à jour de ses informations. 
 
   ![Modifier un employé](capture/modifier-empl.png)

 **-Suppression**  : Suppression d'un employé en fonction de son ID
 
   ![Supprimer un employé](capture/sup-empl.png)

 **-Affichage**  :Liste de tous les employés enregistrés.
   
   ![Afficher la liste](capture/list-empl.png)

 **-Recherche**  :Recherche d'un employé par nom ou poste.
    
   ![Rechercher un employé](capture/chercher-emp.png)

 **-Calcul de la masse salariale**: Addition de tous les salaires des employés.

   ![Calculer la masse salariale](capture/masse-sal.png)

 **-Tri des employés** : Possibilité de trier par salaire en ordre croissant ou décroissant.

   ![Trier les employés](capture/Trier-empl.png)

   ## 6. Conclusion
   
Cette application console en Java illustre les bases de la gestion des employés en programmation orientée objet. Bien qu'elle soit limitée, elle constitue un bon point de départ pour un projet plus avancé avec une base de données et une interface utilisateur.





