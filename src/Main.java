import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double balance = 10.99;
        boolean isRunning = true;
        int choise;

        while (isRunning) {
            System.out.println("###############");
            System.out.println("BANKING PROGRAM");
            System.out.println("###############");
            System.out.println("1. Show balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("###############");

            System.out.print("Enter your choise: ");
            choise = scanner.nextInt();

            switch (choise) {
                case 1:
                    showBalance(balance);
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    balance += depositAmount;
                    System.out.println("Deposit successful. Your new balance is: " + balance);
                    break;
                case 3:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > balance) {
                        System.out.println("Insufficient funds.");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawal successful. Your new balance is: " + balance);
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }

        scanner.close();
    }

    public static void showBalance(double balance) {
        System.out.println("###############");
        System.out.printf("$%.2f\n", balance);
    }
}
