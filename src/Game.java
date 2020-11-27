import java.util.Scanner;

public class Game
{
    private Scanner scanner;
    private Boolean isRunning;
    private String combinaison;
    private String UserInput;

    public Game()
    {
        scanner = new Scanner(System.in);
        isRunning = true;
        UserInput ="";
    }

    public void update()
    {
        while(isRunning){
            combinaison = DataProvider.createCombinaison();
            System.out.println("Bienvenue dans le jeu du Mastermind !");
            System.out.println("Vous devez deviner une combinaison de 4 couleurs (Rouge, Vert, Bleu, Jaune, Cyan et Magenta)");
            System.out.println("Veuillez entrer une combinaison de 4 lettres :");
            System.out.println("Reponse :" + combinaison);
            System.out.print(">");
    
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
            rejouer();
        }
    }
        
    public Boolean getIsRunning() {
        return isRunning;
    }

    public void terminer()
    {
        isRunning = false;
        scanner.close();
        System.out.print("Aurevoir !");
    }

    public void rejouer()
    {
        System.out.println("Vous avez gagné !");
        System.out.println("Voulez vous rejouer ? (Y/N)");
        UserInput = scanner.nextLine().trim();
        if("N".equals(UserInput)){
            terminer();
        }
    }

}
