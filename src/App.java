import java.util.Scanner;

public class App
{
    // Cette méthode est appelée automatiquement au lancement de l'application
    public static void main(String[] args) throws Exception {
        // Efface la console
        System.out.print("\033[H\033[2J");   
        System.out.flush();
        
        Scanner scanner = new Scanner(System.in);
        String combinaison = DataProvider.createCombinaison();
       
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
