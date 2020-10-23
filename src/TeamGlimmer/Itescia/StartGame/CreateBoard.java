package TeamGlimmer.Itescia.StartGame;
import java.util.Random;
import java.lang.Math;

public class CreateBoard {

    public static void main(String[] args) {

        int[][] board = new int[5][5];

        int xTaupe;
        int yTaupe;

        xTaupe = (int) Math.floor(4*Math.random());
        yTaupe = (int) Math.floor(4*Math.random());

        System.out.println(" ");
        for (int i = 0; i < board.length; i++) {
            board[i][0] = i + 1;
            System.out.print(" " + board[i][0] + " ");

        }

        System.out.println("");

        for (int j = 0; j < board.length; j++) {
            board[0][j] = j + 1;
            System.out.print(board[0][j] + " ");

            if (j == yTaupe) {
                molePlacement(xTaupe);
                System.out.print("M");
            }
                System.out.println();
        }

    }

    private static void molePlacement(int decal) {
        for (int i = 0; i < decal; i++)
            System.out.print(" ");
    }

}
