package fr.dampierre;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
    
    // Salaire Annuelle
        System.out.println("Entrez votre salaire annuelle :");
        int salaireAnnuelle = clavier.nextInt();

    // Nombre d'année dans l'entreprise
         System.out.println("Entrez votre nombre d'année dans l'entreprise :");
        int anneeDeTravail = clavier.nextInt();

    // Si salaireAnnuelle est >= 30000 et nombre d'année >= 2 alors prêt accordé/Non-accordé
        if (salaireAnnuelle >= 30000 && anneeDeTravail >= 2){
            System.out.println("Le prêt est accordé");
        }
        else{
            System.out.println("Le prêt n'est pas accordé")
        }

    }
    
}
