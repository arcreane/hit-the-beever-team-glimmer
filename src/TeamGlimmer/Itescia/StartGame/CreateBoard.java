package TeamGlimmer.Itescia.StartGame;
import java.util.Random;
import java.lang.Math;

public class CreateBoard {

    public static int xTaupe;
    public static int yTaupe;

    public static void main(String[] args) {

        System.out.flush();

        //int[][] board = new int[6][6];
        String [][]board = new String[][]{
                {" ","1","2","3","4","5"},
                {"1"," "," "," "," "," "},
                {"2"," "," "," "," "," "},
                {"3"," "," "," "," "," "},
                {"4"," "," "," "," "," "},
                {"5"," "," "," "," "," "}

        };



        xTaupe = (int) Math.floor(5*Math.random())+1;
        yTaupe = (int) Math.floor(5*Math.random())+1;

        board[xTaupe][yTaupe]="M ";


        for (int i = 0; i < board.length; i++) {
            //board[i][0] = i + 1;
            System.out.println("");

            for (int j = 0; j < board.length; j++) {
                //board[0][j] = j + 1;
                System.out.print(" ");
                System.out.print(board[i][j]);
                //System.out.println(" ");
                //System.out.print(board[0][j]);

                if (j == yTaupe) {
                    //molePlacement(xTaupe);
                    //System.out.print("M");
                    //System.out.print(board[xTaupe][yTaupe]);
                }

            }

        }

        //System.out.println(board[xTaupe][yTaupe]);

        System.out.println(" ");

       /* for (int j = 0; j < board.length; j++) {
            //board[0][j] = j + 1;
            System.out.println(board[0][j]);

            if (j == yTaupe) {
                //molePlacement(xTaupe);
                //System.out.print("M");
                System.out.print(board[xTaupe][yTaupe]);
            }

        }*/

    }

    private static void molePlacement(int decal) {
        for (int i = 0; i < decal; i++)
            System.out.print(" ");
    }

}
