import java.math.BigInteger;
import java.util.Scanner;
public class Lab1 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            BigInteger num1 = new BigInteger(parts[0]);
            BigInteger num2 = new BigInteger(parts[2]);
            String b = parts[1];
            BigInteger result = BigInteger.ZERO;
            if(b.equals("+")){
                result = num1.add(num2);
            }else if(b.equals("-")){
                result = num1.subtract(num2);
            }else{
                result = num1.multiply(num2);
            }
            System.out.println(result);
        }
    }
}