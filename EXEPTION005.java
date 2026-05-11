import java.util.Scanner;
class InsufficientFundsException extends Exception{
    public InsufficientFundsException (String message){
        super(message);
    }
}
class BankAccount{
    private double balance;
    public BankAccount(double balance){
        this.balance = balance;
    }
    public void withDraw(double amount) throws InsufficientFundsException{
        if(amount<0){
            throw new IllegalArgumentException("Lỗi: Số tiền rút không được âm!");
        }
        if(amount > balance){
            throw new InsufficientFundsException("Lỗi: Số dư không đủ để rút "+amount);
        }
        balance -= amount;
        System.out.println("Rút tiền thành công! Số dư còn lại: " + balance);
        
        }
        public double getBalance(){
        return balance;
    }
}
public class EXEPTION005 {
    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0){
            double balance = scanner.nextDouble();
            scanner.nextLine();
            BankAccount bankAccount = new BankAccount(balance);
            String input = scanner.nextLine();
            try{
                double amount = Double.parseDouble(input);
                bankAccount.withDraw(amount);
            }
            catch (NumberFormatException e){
                System.out.println(
                        "Lỗi: Vui lòng nhập số hợp lệ!"
                );
            }
            catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
            catch (InsufficientFundsException e){
                System.out.println(e.getMessage());
            }
            
        }

    }
}
