import java.util.Scanner;

public class Game
{
    private Scanner scanner;
    private Boolean isRunning;
    private String combinaison;

    public Game() {
        scanner = new Scanner(System.in);
        isRunning = true;
        combinaison = DataProvider.createCombinaison();
    }

    public void update(){
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
        terminer();
    }

    public Boolean getIsRunning() {
        return isRunning;
    }

    public void terminer()
    {
        isRunning = false;
        scanner.close();
        System.out.print("Vous avez gagné !");
    }

}
