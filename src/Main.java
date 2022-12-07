import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome!");

        while(true){

            int num = (int) Math.floor(Math.random() * (10 - 1 + 1) + 1);
            System.out.println("Guess the number!");

            if(num == scan.nextInt()){
                System.out.println("Congratulation! The number is correct!");
            } else System.out.println("The number is " + num + ". Try again, better luck next time.");
        }
    }
}