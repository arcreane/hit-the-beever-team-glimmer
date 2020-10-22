package TeamGlimmer.Itescia.Gameplay;

public class GamePlayManager {

    public static void main(String[] args) {

        int[] board = new int[5];

        for (int i = 0; i < board.length; i++) {
            board[i] = i + 1;
            System.out.print(" " + board[i] + " ");
        }

        System.out.println(" ");

        for (int j = 0; j < board.length; j++) {
            board[j] = j + 1;
            System.out.println(board[j] + " ");
        }


        System.out.print("T");

    }
}







