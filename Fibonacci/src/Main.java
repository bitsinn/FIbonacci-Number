import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int num3;
        int numbers;

        Scanner sc = new Scanner(System.in);
        System.out.print("Write how many fibonacci numbers: ");
        numbers = sc.nextInt();

        for(int i = 0; i < numbers; i++){
            System.out.print(" " + num1);
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
    }
}
// Print: 0 1 1 2 3 5 8 13 21 34