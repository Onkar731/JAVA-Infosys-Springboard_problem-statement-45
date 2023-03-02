import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        int num = sc.nextInt();

        // printing reverse of given number
        System.out.println(ReverseNumber.reverseNumber(num));

        // closing resource
        sc.close();
    }
}