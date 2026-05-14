import java.math.BigDecimal;
import java.util.Scanner;

public class LAB01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0){
            String n = scanner.nextLine();
            if(!n.contains(".")) System.out.println("0");
            else{
                BigDecimal sum = BigDecimal.ZERO;
                String [] s = n.split(" ");
                for (int i=0;i<s.length;i++){
                    BigDecimal a = new BigDecimal(s[i]);
                    BigDecimal b = new BigDecimal(a.toBigInteger());
                    sum = sum.add(a.subtract(b).abs());
                }
                System.out.println(sum);
            }
        }        
    }
}