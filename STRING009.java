import java.util.Scanner;
public class STRING009 {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0){
            String s = scanner.nextLine();
            stringSplosion(s);
        }
    }
    public static void stringSplosion(String args){
        for (int i=0;i<args.length();i++){
            for(int j=0;j<=i;j++){
                System.out.print(args.charAt(j));
            }
        }
        System.out.println();
    }
}
