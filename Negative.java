/**
 * Lukas Witek
 * 4/10/24
 * Negative.java
 */

public class Negative{
    public static void main(String[] args){
        
        int a = (int)(7*Math.random()) - 3;
        int b = (int)(7*Math.random()) - 3;
        int c = (int)(7*Math.random()) - 3;
        int d = (int)(7*Math.random()) - 3;

        int sum = a + b + c + d;

        System.out.println(a + ", " + b + ", " + c + ", " + d + ". Their sum is " + sum + ".");

        if (sum < 0){
            System.out.println("Negative");
        } 
        else{
            System.out.println("Not negative");
        }

    }
}