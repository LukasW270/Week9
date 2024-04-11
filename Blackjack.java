import java.util.*;

public class Blackjack{
    public static void main(String[] args){

        int continuePlaying = 1;

        int playerScore = 0;
        int dealerScore = 0;

        while (continuePlaying == 1){
            
            int int1;
            int int2;
            int total1 = 0;
            int answer;
            int int3;

            int1 = (int)(10*Math.random()) + 1;
            int2 = (int)(10*Math.random()) + 1;

            total1 = int1 + int2;

            Scanner input = new Scanner(System.in);

            System.out.println("You have a " + int1 + " and a " + int2 + " for a total of " + total1 + ".");

            System.out.println();
        
            System.out.print("Enter a 1 if you want another card or any other number for no card. ");

            answer = input.nextInt();

            if (answer == 1){

                int3 = (int)(10*Math.random()) + 1;
                total1 = total1 + int3;
                System.out.println();
                System.out.println("You got a " + int3 + " for a total of " + total1 + ".");

            }

            int dealer1;
            int dealer2;
            int dealer3;
            int dealerTotal;

            dealer1 = (int)(10*Math.random()) + 1;
            dealer2 = (int)(10*Math.random()) + 1;
            dealer3 = (int)(10*Math.random()) + 1;
            dealerTotal = dealer1 + dealer2 + dealer3;

            System.out.println();

            System.out.println("The dealer has a " + dealer1 + ", " + dealer2 + ", and " + dealer3 + " for a total of " + dealerTotal + ".");

            System.out.println();

            if (total1 > 21) {
                System.out.println("Your total was greater than 21! You lost.");
                dealerScore++;
            }
            else if (dealerTotal > 21) {
                System.out.println("The dealer's total was greater than 21! You won!");
                playerScore++;
            }
            else if (total1 > dealerTotal) {
                System.out.println("Your total was greater than the dealer's total! You won!");
                playerScore++;
            }
            else if (total1 < dealerTotal) {
                System.out.println("Your total was less than the dealer's total! The dealer won. :(");
                dealerScore++;
            }
            else {
                System.out.println("You tied with the dealer.");
            }

            System.out.println();
            System.out.println("SCOREBOARD");
            System.out.println("Player Score: " + playerScore);
            System.out.println("Dealer Score: " + dealerScore);
            System.out.println();

            System.out.print("Would you like to keep playing? Enter 1 if so; else, enter any other number. ");

            continuePlaying = input.nextInt();

            System.out.println();

            if (continuePlaying != 1){
                
                if (playerScore > dealerScore) {
                    System.out.println("Your score of " + playerScore + " was greater than the dealer's score of " + dealerScore + "! You won!");
                    System.out.println();
                }
                else {
                    System.out.println("Unfortunately, the dealer's score of " + dealerScore + " was greater than your score of " + playerScore + ". You lost.");
                    System.out.println();
                }

                break;
            }
            else {
                continue;
            }

        }

    }
}