import java.util.Scanner;

public class BASIC012 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String s = scanner.nextLine();
            int max = 1;
            int a = 1;
            for (int i = 0; i < s.length() - 2; i += 2) {
                if (s.charAt(i) <= s.charAt(i + 2)) {
                    a++;
                    if (max < a) max = a;
                }
                else a=1;
            }
            System.out.println(max);
        }
    }
}
