package exercise1;

import java.util.Scanner;

public class CardTrick {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        String b;

        Card hand[] = new Card[7];
        for (int i = 0; i < hand.length; i++) {
            Card c1 = new Card();
            c1.setValue((int) (Math.random() * 13 + 1));
            c1.setSuit(Card.SUITS[(int) (Math.random() * 3)]);
            hand[i] = c1;
            System.out.println(hand[i].getValue() + " of " + hand[i].getSuit());
        }
        
        System.out.println();
        System.out.println("Pick one card with value: ");
        a = sc.nextInt();
        System.out.println("Pick suit of the deck: ");
        b = sc.next();
        System.out.println("Your Card is " + a + " of " + b);

        boolean flag = false;
        for (int i = 0; i <= 6; i++) {
            if (a == hand[i].getValue() && b.equalsIgnoreCase(hand[i].getSuit())) {
                flag = true;
            }
        }
        if (flag == true) {
            printInfo();
        } else {
            System.out.println("Sorry, no match!!!");
        }
    }

    private static void printInfo() {
        
        //I am done
        System.out.println("Congratulations, you guessed right!");
        System.out.println();

        System.out.println("My name is Aarsh, but you can call me Cherry, kaake or baanku");
        System.out.println();

        System.out.println("My career ambitions:");
        System.out.println("-- Be more active");
        System.out.println("-- Have a  great semester with no violations of academic integrity!");
        System.out.println();

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Gaming");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();

    }

}
