import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount < 0) {
            throw new IllegalArgumentException("Lỗi: Số tiền rút không được âm!");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Lỗi: Số dư không đủ để rút " + amount);
        }
        
        balance -= amount;
        System.out.println("Rút tiền thành công! Số dư còn lại: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}

public class EXCEPTION005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 0;
        
        if (scanner.hasNextLine()) {
            String firstLine = scanner.nextLine().trim();
            
            if (firstLine.equals("1") && scanner.hasNextLine()) {
                balance = Double.parseDouble(scanner.nextLine().trim());
            } else {
                balance = Double.parseDouble(firstLine);
            }
        }

        BankAccount account = new BankAccount(balance);

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) continue;

            try {
                double amount = Double.parseDouble(input);
                
                try {
                    account.withdraw(amount);
                } catch (IllegalArgumentException | InsufficientFundsException e) {
                    System.out.println(e.getMessage());
                }
                
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Vui lòng nhập số hợp lệ!");
            }
        }
        
        scanner.close();
    }
}