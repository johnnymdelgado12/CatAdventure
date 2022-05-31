import java.util.Scanner;

public class AdventureGame {
    public static void main(String[] args) {
        Scanner playerInput = new Scanner(System.in);

        System.out.println("Start Adventure? [Y/N]");
        String start = playerInput.next();

        if(start.equalsIgnoreCase("Y")){
            System.out.println("Will you play as Trix or Luna? [T/L]");
            String playerName = playerInput.next();
            if(playerName.equalsIgnoreCase("T")){
                playerName = "Trix";
            } else if (playerName.equalsIgnoreCase("L")) {
                playerName = "Luna";
            }

            gameInit(playerName, playerInput);
        } else {
            System.out.println("Goodbye");
        }
    }

    public static void gameInit(String playerName, Scanner playerInput){
        int playerHP= 100;
        String boardPosition = "A1";

        System.out.println("Welcome to the adventure " + playerName + "!");
    }
}
