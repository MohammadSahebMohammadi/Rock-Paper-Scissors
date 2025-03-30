import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter your move ( rock , paper , scissor ) : ");
        String playermove = sc.nextLine();

        int computermove_i = rand.nextInt(3);
        String computermove_s = null ;

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

        System.out.println("computer move = " + computermove_s );

        // you win or you lose

        //play again (yes/no) :

        // scan the answer


    }
}