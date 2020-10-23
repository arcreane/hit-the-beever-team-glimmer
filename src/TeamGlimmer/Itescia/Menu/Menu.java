package TeamGlimmer.Itescia.Menu;
//package TeamGlimmer.Itescia.Menu.Scores;
import java.util.Scanner;

public class Menu {

    //affiche les options du menu:
    //Start game
    //scores
    //quit

    //scanner utilisateur
    //exécuter la fonction demandée
    //si mauvaise réponse, redémarre menu

    public static void main(String[] args) {

        System.out.println("Bienvenue dans le jeu de la taupe :");
        System.out.println("1 : Commencer le jeu");
        System.out.println("2 : Les scores");
        System.out.println("3 : Quit");

        int numMenu;
        Scanner userInput = new Scanner(System.in);
        numMenu = userInput.nextInt();

        switch (numMenu) {
            case 1:
                //Lancement du jeu
                SelectDifficulty.main(null);
                break;
            case 2:
                //Aller vers les scores
                //Scores.sortScores();
                Scores.printHighScore();
                Menu.main(args);
                break;
            case 3:
                //Quitte le programme
                Quit.quitSoft();

                break;
            default:
                System.out.println("Je n'ai pas compris votre demande");
                main(null);
        }


    }
}


