import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Integer minimum_range;
        System.out.println("enter the value of minimum range:");
        minimum_range=input.nextInt();
        Integer maximum_range;
        System.out.println("enter the value of maximum range:");
        maximum_range=input.nextInt();
        for(int n=minimum_range;n<=maximum_range;n++) {
            if(isPrime(n)) {
                System.out.println(n);
            }
        }
    }
    public static boolean isPrime(int num) {
        for(int i = 2; i <= num/i; ++i) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
