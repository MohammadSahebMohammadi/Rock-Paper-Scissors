import java.util.Scanner;
import java.util.Random;
import java.io.IOException;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String isplayagain;
        do {

            isplayagain = null;
            String playermove = null ;

            do {
                Helper.newGameLine();
                System.out.print("Enter your move ( rock , paper , scissor ) : ");
                playermove = sc.nextLine();
            }while ( !(playermove.equals("rock") || playermove.equals("scissor") || playermove.equals("paper")) );

            int computermove_i = rand.nextInt(3);
            String computermove_s = null;

            switch (computermove_i) {
                case 0:
                    computermove_s = "rock";
                    break;
                case 1:
                    computermove_s = "paper";
                    break;
                case 2:
                    computermove_s = "scissor";
            }

            System.out.println("computer move = " + computermove_s);

            System.out.print("\n\t__");
            switch (computermove_i) {
                case 0:
                    if (playermove.equals("rock")) {
                        System.out.print("Equal.");
                    } else if (playermove.equals("paper")) {
                        System.out.print("you win.");
                    } else if (playermove.equals("scissor")) {
                        System.out.print("you lose.");
                    }
                    break;
                case 1:
                    if (playermove.equals("rock")) {
                        System.out.print("you lose.");
                    } else if (playermove.equals("paper")) {
                        System.out.print("Equal.");
                    } else if (playermove.equals("scissor")) {
                        System.out.print("you win.");
                    }
                    break;
                case 2:
                    if (playermove.equals("rock")) {
                        System.out.print("you win.");
                    } else if (playermove.equals("paper")) {
                        System.out.print("you lose.");
                    } else if (playermove.equals("scissor")) {
                        System.out.print("Equal.");
                    }
                    break;
            }
            System.out.println("__\n");


            System.out.println("play again (yes,no) : ");
            isplayagain = sc.nextLine();

        }while(isplayagain.equals("yes"));

    }
}