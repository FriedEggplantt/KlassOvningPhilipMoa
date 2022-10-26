import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner choice =new Scanner(System.in);
        System.out.println("Hello! Which drink would you like?");
        System.out.println();
        System.out.println("1. Vodka");
        System.out.println("2. Coca Cola");
        System.out.println("3. Water");
        System.out.println("4. Beer");
int drinkchoice = choice.nextInt();
/*
        System.out.println("1. Refill");
        System.out.println("2. Empty");
        System.out.println("3. Drink");
        System.out.println("4. Shake");

 */

        switch (drinkchoice){
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;;

        }


        Drink Vodka = new Drink("transparent", 40, "bitter", 100, 0,"Smirnoff", 0);

    }
}