import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);



        Boolean restart = false;
        String stringRestart;
        String day;

        System.out.println("Would you like to play rock paper scissors? [yes or no]");
        stringRestart = in.next();

        if(stringRestart.equalsIgnoreCase("yes")){
            restart = true;
        }else if (stringRestart.equalsIgnoreCase("no")){
            restart = false;
        }




        while(restart) {

            String playerAMove = "";
            String playerBMove = "";


            System.out.println("Player A make your Move: ");
            playerAMove = in.next();

            System.out.println("Player B make your move: ");
            playerBMove = in.next();


            System.out.println("");
            System.out.println("Player Moves:");
            System.out.println("Player A move is: " + playerAMove);
            System.out.println("Player B move is: " + playerBMove);
            System.out.println("");


            if (playerAMove.equalsIgnoreCase("r")) {
                if (playerBMove.equalsIgnoreCase("R")) {
                    System.out.println("Rock vs Rock , It is a tie");
                } else if (playerBMove.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers Rock , Player B wins!");
                } else if (playerBMove.equalsIgnoreCase("S")) {
                    System.out.println("Rock breaks Scissors , Player A wins!");
                }else {
                    System.out.println("Invalid Response");
                }
            } else if (playerAMove.equalsIgnoreCase("P")) {
                if (playerBMove.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers Rock , Player A wins!");
                } else if (playerBMove.equalsIgnoreCase("P")) {
                    System.out.println("Paper vs Paper , It's a tie");
                } else if (playerBMove.equalsIgnoreCase("S")) {
                    System.out.println("Scissors cut Paper , Player B wins!");
                }else {
                    System.out.println("Invalid Response");
                }
            } else if (playerAMove.equalsIgnoreCase("S")) {
                if (playerBMove.equalsIgnoreCase("R")) {
                    System.out.println("Rock breaks Scissors , Player B wins");
                } else if (playerBMove.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cut Paper , Player A wins!");
                } else if (playerBMove.equalsIgnoreCase("S")) {
                    System.out.println("Scissors vs Scissors , It's a tie!");
                }else {
                    System.out.println("Invalid Response");
                }
            }else {
                System.out.println("Invalid Response");
            }



            System.out.println("");
            System.out.println("Would you like to restart?");
            stringRestart = in.next();

            if(stringRestart.equalsIgnoreCase("yes")){
                restart = true;
            }else if (stringRestart.equalsIgnoreCase("no")){
                restart = false;
            }


        }









    }
}