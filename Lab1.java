import java.math.BigInteger;
import java.util.Scanner;
public class Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int testcases = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < testcases; i++) {
                String line = scanner.nextLine().trim();
                if (line.isEmpty()) {
                    i--; 
                    continue;
                }
                String[] parts = line.split("\\s+");
                    BigInteger num1 = new BigInteger(parts[0]);
                    String operator = parts[1];
                    BigInteger num2 = new BigInteger(parts[2]);
                    
                    BigInteger result = BigInteger.ZERO;
                    switch (operator) {
                        case "+":
                            result = num1.add(num2);
                            break;
                        case "-":
                            result = num1.subtract(num2);
                            break;
                        case "*":
                            result = num1.multiply(num2);
                            break;
                        default:
                            System.out.println("Phép toán không hợp lệ!");
                            continue;
                    }
                    System.out.println(result.toString());
                }
            }
        }
    }