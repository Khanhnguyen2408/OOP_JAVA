import java.util.Scanner;
public class BASIC005 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            String [] parts = s.split(" ");
            int sum=0;
            for (String num:parts){
                int a = Integer.parseInt(num);
                sum+=a;
            }
            System.out.println(sum);
        }
    }
}
