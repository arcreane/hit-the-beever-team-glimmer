package TeamGlimmer.Itescia.Menu;
import java.util.Scanner;


import TeamGlimmer.Itescia.Difficultés.Paramétrage;
import TeamGlimmer.Itescia.Gameplay.GamePlayManager;

public class SelectDifficulty {

    public static void main(String[] args) {
        int difSelector[];
        double difficultyArrayCopy[][]=Paramétrage.difficultyArray;
        String nomDeLaDiff[]={"1: Facile : ","2: Moyen : ","3: Difficile : "};

        System.out.println("Chose your difficulty :");
        for (int i =0;i<3;i++){
            System.out.print(nomDeLaDiff[i]);
            System.out.println(difficultyArrayCopy[i][0]+" colonnes "+difficultyArrayCopy[i][1]+" lignes "+difficultyArrayCopy[i][2]+" secondes");
        }

        selectDifficulty();

        GamePlayManager.main(args);

    }
    public static void writeDifficultyLine(int dif){
        double difLine[] = Paramétrage.difficultyArray[dif];
        System.out.println(difLine);
    }

    public static int selectDifficulty(){
        Scanner sc = new Scanner(System.in);
        int inputUser = sc.nextInt();
        return inputUser;

    }



    //Démarre le jeu
    //appelle classe difficultés.affichage
}
