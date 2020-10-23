package TeamGlimmer.Itescia.Endgame;
import TeamGlimmer.Itescia.Menu.Menu;
import  TeamGlimmer.Itescia.Menu.Scores;
import java.util.Scanner;

public class Mangerendgame {



    public static String getName(){

        System.out.println("Quel est votre nom ?");
        String playerName;
        Scanner enterName= new Scanner(System.in);
        playerName=enterName.nextLine();
        return playerName;

    }
    public static void main(String[] args) {

        System.out.println("voila votre score : "+ Scores.currentScore);

        Scores.sortScores();

        Scores.printHighScore();
        Menu.main(args);
    }

}
