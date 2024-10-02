import java.util.Scanner;

public class GuessBday {
    public static void main(String[] args) {
        String[] sets = {
            " 1  3  5  7 \n" +
            " 9 11 13 15\n" + 
            "17 19 21 23\n" +
            "25 27 29 31",
            " 2  3  6  7\n" +
            "10 11 14 15\n" +
            "18 19 22 23\n"+
            "26 27 30 31",
            " 4  5  6  7\n" + 
            "12 13 14 15\n" + 
            "20 21 22 23\n" +
            "28 29 30 31",
            " 8  9 10 11\n" +
            "12 13 14 15\n" +
            "24 25 26 27\n" +
            "28 29 30 31",
            "16 17 18 19\n" +
            "20 21 22 23\n" +
            "24 25 26 27\n" +
            "28 29 30 31"
        };

        int day = 0;
        char ch;

        Scanner in = new Scanner(System.in);

        System.out.println("Guessing Birthday!");

        do{
            for (int i = 0; i < sets.length; i++) {
                System.out.println("\nIs your Birthday in Set" + (i + 1) + "?");
                System.out.println(sets[i]);
                System.out.print("Enter 1 for Yes and 0 for NO : ");
                int response = in.nextInt();

                if (response == 1) {
                    day |= 1 << i;
                }
            }

            System.out.println("I know your birthday!! \n\nYour birthday is on " + day + "!\n");

            System.out.print("Do you want to play again? (Y/N) : ");
            ch = in.next().charAt(0);
            
        }while(ch != 'N' || ch != 'n');

        in.close();
    }
}