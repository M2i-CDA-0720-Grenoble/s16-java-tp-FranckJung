import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class App
{
    // Cette méthode est appelée automatiquement au lancement de l'application
    public static void main(String[] args) throws Exception {
        // Efface la console
        System.out.print("\033[H\033[2J");   
        System.out.flush();
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int tailleCombinaison = 4;

        //Genere un tableau de 4 chiffres aleatoire compris entre 0 et 5
        int[] tableauNombresAleatoires = new int[tailleCombinaison];
        for(int i = 0; i < tailleCombinaison; i++){
            tableauNombresAleatoires[i] = random.nextInt(Couleur.values().length);
        }
        
        //Genere un tableau de lettres correspondant aux couleurs des nombres du tableauNombresAleatoires
        char[] tableauLettres = new char[tailleCombinaison];
        for(int i = 0; i < tailleCombinaison; i++){
            for (Couleur couleur : Couleur.values()) {
                if (couleur.getCode() == tableauNombresAleatoires[i]) {
                    tableauLettres[i] = couleur.getName();
                }
            }
        }
        //Transforme le tableau de lettres en string
        String combinaison = new String(tableauLettres);
        System.out.println(combinaison);

        String UserInput = "";
        System.out.println("Bienvenue dans le jeu du mastermind :");
        System.out.println("Vous devez deviner la combinaison de 4 lettres (RVBJCM)");
        System.out.println("Veuillez entrer une combinaison de 4 lettres");
        while(!UserInput.equals(combinaison))
        {
            UserInput = scanner.nextLine().trim();
            if(UserInput.length() == combinaison.length()){
                if(!UserInput.equals(combinaison)){
                    System.out.println("mauvaise combinaison");
                }     
            }else{
                System.out.println("combinaison invalide");
            }
        }
        System.out.print("Vous avez gagné !");
        scanner.close();
    }
}
