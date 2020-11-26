
public class App
{
    // Cette méthode est appelée automatiquement au lancement de l'application
    public static void main(String[] args) throws Exception {
        // Efface la console
        System.out.print("\033[H\033[2J");   
        System.out.flush();
        
        Game game = new Game();
        
        while(game.getIsRunning()){
            game.update();
        }
      
    }
}
