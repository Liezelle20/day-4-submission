import java.util.Scanner;

public class day4 {

    public static void main(String[] args) {

        int i = 1;
        int sum = 0;
        while (i <= 5) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number : ");
            int num = sc.nextInt();
            sum = sum + num;
            i++;

        }
        System.out.println("the sum of all the 5 integers is " + sum);
    }
}
