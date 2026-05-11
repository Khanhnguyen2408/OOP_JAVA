import java.util.Scanner;
public class STRING003 {
    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0){
            String s1 = scanner.nextLine().toLowerCase();
            String s2 = scanner.nextLine().toLowerCase();
            if (s1.equals(s2)){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }
    }
}
