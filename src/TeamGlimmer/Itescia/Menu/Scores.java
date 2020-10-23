package TeamGlimmer.Itescia.Menu;
import TeamGlimmer.Itescia.Endgame.Mangerendgame;

import java.util.*;
import java.util.Collections;

import static java.lang.Integer.parseInt;

public class Scores {

    public static int[] highScore;
    public static String[][] scoresNames={
            {"0","0"},
            {"0","0"},
            {"0","0"},
            {"0","0"},
            {"0","0"}
    };


    public static int currentScore = 0;

    /*public static void checkCurrentScore(){
        
        if (highScore.length < 5){
            addHighScore(currentScore);
        } else if (currentScore > highScore[0]){
            highScore[0] = currentScore;
            Arrays.sort(highScore);
        }
    }*/

    public static void sortScores() {
        String tempScoreName[]={Mangerendgame.getName(),""+(currentScore)};
        for (int i=0;i<=scoresNames.length-1;i++){
            //int temp=parseInt(scoresNames[i][1]);
            if(parseInt(tempScoreName[1])>parseInt(scoresNames[i][1])){
                String temp2[]={scoresNames[i][0],scoresNames[i][1]};
                scoresNames[i][0]=(""+tempScoreName[0]);
                scoresNames[i][1]=(""+tempScoreName[1]);

                tempScoreName=temp2;
            }
        }
    }

    /*
     * allow add the highest score in the tab and print the new tab (while sort him)
     * @param  the new high score
     */
    /*public static void addHighScore(int x) {

        int n = highScore.length;

        int newarr[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            newarr[i] = highScore[i];


        }
        newarr[n] = x;
        Arrays.sort(newarr);
        Scores.highScore = newarr;
        String Name = Mangerendgame.getName();
        String Score = (""+highScore[n]);
        scoresNames[n][0]=Name;
        scoresNames[n][1]=Score;



    }*/



    public static void printHighScore(){
        System.out.println(" ");

        for (int i = scoresNames.length - 1; i >= 0; i--) {
            System.out.print(scoresNames[i][0]+" : ");
            System.out.println(scoresNames[i][1]);;
        }
    }
    //récupère les infos de Endgame.checkhighscore
    //remplit le tableau
    //trie les données dans le tableau
    //affiche les high scores
    //permet de revenir au menu principal

}


