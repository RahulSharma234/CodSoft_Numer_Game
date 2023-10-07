import java.util.*;
public class GuessingNumbers{
    public static void GuessingNumbers() {
        Scanner sc = new Scanner(System.in);

        int number = 1 + (int)(100 *Math.random());

        int k = 5;
        int i , guess;

        System.out.println("A number is choosen "+ " between 1 to 100. "+ " Guess the number " + " Within 5 trials. ");

        for( i = 0; i < k; i++){
            System.out.println("Guess the Number: ");

            guess = sc.nextInt();
            if(number == guess){
                System.out.println("Congratulation!" + "You guessed the number. ");
                break;

            }
            else if (number > guess && i != k - 1){
                System.out.println("The number is" + " greater than " + guess);

            }
            else if (number < guess && i !=k - 1){
                System.out.println("The number is lesser than " + guess);
            }
        }

        if ( i==k){
            System.out.print("Sorry, you have run out of attempts.");

            System.out.println("The number was "+ number);
        }
    }

    public static void main(String[] args) {
        GuessingNumbers();
    }
}


    
