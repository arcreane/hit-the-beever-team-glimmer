package TeamGlimmer.Itescia.Menu;
import java.util.Arrays;
import java.util.Collections;

public class Scores {

    public static int[] highScore = {};

    public static int currentScore = 0;

    public static void checkCurrentScore(){
        
        if (highScore.length < 5){
            addHighScore(currentScore);
        } else if (currentScore > highScore[0]){
            highScore[0] = currentScore;
            Arrays.sort(highScore);
        }
    }

    /**
     * allow add the highest score in the tab and print the new tab (while sort him)
     * @param x the new high score
     */
    public static void addHighScore(int x) {

        int n = highScore.length;

        int newarr[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            newarr[i] = highScore[i];
        }
        newarr[n] = x;
        Arrays.sort(newarr);
        Scores.highScore = newarr;
    }


    public static void printHighScore(){

        for (int i = highScore.length - 1; i >= 0; i--) {
            System.out.println(highScore[i]);
        }
    }
    //récupère les infos de Endgame.checkhighscore
    //remplit le tableau
    //trie les données dans le tableau
    //affiche les high scores
    //permet de revenir au menu principal

}


