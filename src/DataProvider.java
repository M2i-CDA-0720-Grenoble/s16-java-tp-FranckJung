import java.util.Random;

public class DataProvider 
{
    public static String createCombinaison()
    {
        final int TailleCombinaison = 4;
        
        //Genere un tableau de 4 chiffres aleatoires compris entre 0 et le nombre de couleurs
        Random random = new Random();
        int[] tableauNombresAleatoires = new int[TailleCombinaison];
        for(int i = 0; i < TailleCombinaison; i++){
            tableauNombresAleatoires[i] = random.nextInt(Couleur.values().length);
        }
        
        //Genere un tableau de lettres correspondant aux couleurs des nombres du tableauNombresAleatoires
        char[] tableauLettres = new char[TailleCombinaison];
        for(int i = 0; i < TailleCombinaison; i++){
            for (Couleur couleur : Couleur.values()) {
                if (couleur.getCode() == tableauNombresAleatoires[i]) {
                    tableauLettres[i] = couleur.getName();
                }
            }
        }
        //Transforme le tableau de lettres en string
        String combinaison = new String(tableauLettres);

        return combinaison;
    }
}
