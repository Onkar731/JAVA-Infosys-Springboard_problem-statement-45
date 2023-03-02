public class ReverseNumber {
    public static int reverseNumber(int num) {
        // declaring variables
        int reverseNumber = 0;

        while(num != 0) {
            reverseNumber = reverseNumber*10 + (num%10);
            num/=10;
        }

        // returning reverse of number
        return reverseNumber;
    }
}