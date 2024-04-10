import java.util.*;

public class Blackjack{
    public static void main(String[] args){

        int int1;
        int int2;
        int total1 = 0;

        int1 = (int)(10*Math.random()) + 1;
        int2 = (int)(10*Math.random()) + 1;

        total1 = int1 + int2;

        System.out.println("You have a " + int1 + " and a " + int2 + " for a total of " + total1 + ".");

    }
}