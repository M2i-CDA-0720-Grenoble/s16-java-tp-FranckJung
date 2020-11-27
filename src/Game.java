import java.util.Scanner;
import java.util.regex.*;

public class Game
{
    private Scanner scanner;
    private Boolean isRunning;
    private char[] combinaison;
    private String userInput;
    private String regex;

    public Game()
    {
        scanner = new Scanner(System.in);
        isRunning = true;
        userInput ="";
        regex = "^[RVBJCM]{4}$";
    }

    public void update()
    {
        while(isRunning){
            combinaison = DataProvider.createCombinaison();
            String solution = new String(combinaison);

            System.out.println("Bienvenue dans le jeu du Mastermind !");
            System.out.println("Vous devez deviner une combinaison de 4 couleurs (Rouge, Vert, Bleu, Jaune, Cyan et Magenta)");
            System.out.println("Veuillez entrer une combinaison de 4 lettres :");
            System.out.println("Reponse :" + solution);
            System.out.print(">");
            
            

            while(!userInput.equals(solution))
            {
                userInput = scanner.nextLine().trim().toUpperCase();
                if(Pattern.matches(regex, userInput)){
                    char[] userInputArray = userInput.toCharArray();
                    int correct = 0;
                    for(int i = 0; i < DataProvider.TailleCombinaison ; i++){
                         if(userInputArray[i] == combinaison[i]){
                             correct ++;
                         }
                    }
                 System.out.println("Vous avez "+ correct +" couleurs bien placées");
                }else{
                    System.out.println("combinaison invalide (pas de chiffre et 4 lettres)");
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
        userInput = scanner.nextLine().trim();
        if("N".equals(userInput)){
            terminer();
        }
    }

}
