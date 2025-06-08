import java.util.Scanner;
import java.util.Random;
public class CWH_04_literals {
    public static void main(String[] args) {
        Random randInt= new Random();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Welcome to the Rock Paper Scissor Game");
            System.out.println("How many rounds do you want to play? ");
            int rounds = scanner.nextInt();
            int scoreUser = 0;
            int scoreComputer = 0;

            for (int i = 0; i < rounds; i++) {
                System.out.printf("Select 1 for rock\n2 for paper\n3 for scissor\n");
                int input = scanner.nextInt();
                int random = randInt.nextInt(1,4);
                System.out.println(input);
                System.out.println(random);
                if ((input == 1 && random == 2) || (input == 2 && random == 3) || (input == 3 && random == 1)) {
                    System.out.println("You loose the round");
                    scoreComputer++;

                }
                else if(input==random)
                    System.out.println("Its a draw!");
                else {
                    System.out.println("You win the round");
                    scoreUser++;
                }


            }
            if (scoreUser > scoreComputer)
                System.out.println("You win the game!");
            else if (scoreUser == scoreComputer) {
                while (scoreUser == scoreComputer) {
                    System.out.println("It's a draw! Play another round");
                    System.out.printf("Select 1 for rock\n2 for paper\n3 for scissor\n");
                    int input = scanner.nextInt();
                    int random = randInt.nextInt(1,4);
                    if ((input == 1 && random == 2) || (input == 2 && random == 3) || (input == 3 && random == 1)) {
                        System.out.println("You loose the game");
                        scoreComputer++;
                    } else if (input == random)
                        System.out.println("Its a draw again, try again");
                    else {
                        System.out.println("You win the round and the game");
                        scoreUser++;
                    }
                }

            } else
                System.out.println("You lost the game!");
    System.out.println("Enter 0 to exit 1 to Continue");
    int choice= scanner.nextInt();
    while (choice!=0 && choice!=1){
        System.out.println("Enter a valid choice!");
        choice= scanner.nextInt();

    }
    if(choice ==0)
        break;
        }


    }
}
