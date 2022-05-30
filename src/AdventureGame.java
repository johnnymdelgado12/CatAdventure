import java.util.Scanner;

public class AdventureGame {
    public static void main(String[] args) {
        Scanner playerInput = new Scanner(System.in);

        System.out.println("Start Adventure? [Y/N]");
        String start = playerInput.next();

        if(start.equalsIgnoreCase("Y")){
            System.out.println("What is your name?");
            String playerName = playerInput.next();
        } else {
            System.out.println("Goodbye");
        }
    }
}
