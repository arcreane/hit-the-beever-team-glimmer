package TeamGlimmer.Itescia.Gameplay;

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

        for (int i=0;i<=nbOfRounds;i++){


            System.out.flush();
            //CreateBoard.main
            //instancier un board

            Scorecount.displayScore();
            System.out.println("Round Number : "+i);

            int molePos[]=[CreateBoard.xTaupe,CreateBoard.yTaupe];
            int molePos[]={3,4};
            //placeholder value

            checkPlayerClick(molePos);
        }




    }

    public static void checkPlayerClick(int mole[]){
        Scanner scan1 = new Scanner(System.in);
        int xInput = scan1.nextInt();

        Scanner scan2 = new Scanner(System.in);
        int yInput = scan2.nextInt();

        int inputPlayer[]={xInput,yInput};

        if (inputPlayer==mole){

            System.out.println("That's a hit !");
            Scorecount.increment();

        }

        else{
            System.out.println("That's a miss !");
        }
    }
}
