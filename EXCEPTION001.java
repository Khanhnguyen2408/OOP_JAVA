import java.util.Scanner;
class Amount{
    private String currency;
    private int amount;
    public Amount(String currency, int amount){
        this.currency = currency;
        this.amount = amount;
    }
    public Amount add (Amount other) throws Exception{
        if(!this.currency.equals(other.currency)){
            throw new Exception ("Currency doesn't match");
        }
        int totalAmount = this.amount + other.amount;
        return new Amount(this.currency, totalAmount);
    }
    @Override
    public String toString(){
        return String.valueOf(amount);
    }
}
public class EXCEPTION001{
    public static void  main(String [] args){
        Scanner scanner = new Scanner (System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0){
            String currency1 = scanner.next();
            int amount1 = scanner.nextInt();
            Amount amt1 = new Amount(currency1, amount1);
            String currency2 = scanner.next();
            int amount2 = scanner.nextInt();
            Amount amt2 = new Amount(currency2, amount2);
            try{
                Amount result = amt1.add(amt2);
                System.out.println(result);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}