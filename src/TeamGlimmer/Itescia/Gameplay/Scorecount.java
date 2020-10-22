package TeamGlimmer.Itescia.Gameplay;

public class Scorecount {

    static int scoreCurrent[]={0};

    public static void increment() {
        scoreCurrent[0]+=1;


    }


    public static void displayScore(){
        System.out.println("My score:"+ scoreCurrent);
    }

}