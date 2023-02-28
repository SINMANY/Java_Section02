package GuessingByName;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        String username; // To store the user input
        int check;
        boolean isCheck = false;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("=======Guessing about you by using your name======");
            System.out.print("Enter your name : ");
            username = input.nextLine().toLowerCase();
            int sum = 0;
            int result = 0;
            for (int i = 0; i < username.length(); i++) {
                switch (username.charAt(i)) {
                    case 'a', 'j', 's' -> result += 1;
                    case 'k', 'b', 't' -> result += 2;
                    case 'c', 'l', 'u' -> result += 3;
                    case 'd', 'm', 'v' -> result += 4;
                    case 'e', 'n', 'w' -> result += 5;
                    case 'f', 'o', 'x' -> result += 6;
                    case 'g', 'p', 'y' -> result += 7;
                    case 'h', 'q', 'z' -> result += 8;
                    case 'i', 'r' -> result += 9;
                    default -> result += 0;
                }
            }
            if (result>10){
                // convert to char
                char[] chars = String.valueOf(result).toCharArray();
                for (int i = 0; i <chars.length ; i++) {
                    sum=sum+Character.getNumericValue(chars[i]); // Convert to int then calculate
                }
                System.out.println("You are belong to number : " +sum);
            }else {
                System.out.println(result);
            }
            System.out.println("------------------------------------------------------------------------");
            System.out.print("Press 1 to guess again and any number to out the program : ");
            check = input.nextInt();
            if(check==1){
                isCheck = true;
            }else {
                isCheck = false;
            }
        }while (isCheck);
    }
}


