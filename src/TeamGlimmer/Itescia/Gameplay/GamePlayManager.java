package TeamGlimmer.Itescia.Gameplay;

import TeamGlimmer.Itescia.Endgame.Mangerendgame;
import TeamGlimmer.Itescia.Menu.Scores;
import TeamGlimmer.Itescia.StartGame.CreateBoard;

import java.io.Console;
import java.util.Scanner;

public class GamePlayManager {

    //call CreateBoard
    //display currentScore
    //lire les inputs du joueur
    //comparer aux coordonnées de la taupe
    //feedback hit/miss
    //appeler la fonction d'incrémentation du score
    //vérifier le nombre de rounds
    //recommencer le main de cette classe ou passer à l'écran final

    public static void main(String[] args) {

        int nbOfRounds = 5;
        int currentRoud =0;

        for (int i=0;i<nbOfRounds;i++){


            System.out.flush();
            System.out.println("CurrentScore : "+ Scores.currentScore);
            System.out.println("Round Number : "+ currentRoud);
            CreateBoard.main(args);
            //instancier un board



            int molePos[]={CreateBoard.xTaupe,CreateBoard.yTaupe};
            //System.out.println(molePos[0]);
            //System.out.println(molePos[1]);
            //int molePos[]={3,4};
            //placeholder value

            checkPlayerClick(molePos);
            currentRoud+=1;

            if (currentRoud==nbOfRounds){
                Mangerendgame.main(args);
            }
        }




    }

    public static void checkPlayerClick(int mole[]){
        Scanner scan1 = new Scanner(System.in);
        int xInput = scan1.nextInt();

        Scanner scan2 = new Scanner(System.in);
        int yInput = scan2.nextInt();

        int inputPlayer[]={xInput,yInput};

        if (inputPlayer[0]==mole[0]&&inputPlayer[1]==mole[1]){

            System.out.println("That's a hit !");
            Scores.currentScore+=1;
            //Scorecount.increment();

        }

        else{
            System.out.println("That's a miss !");
        }
    }
}
