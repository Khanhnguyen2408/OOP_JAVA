import java.util.Scanner;
public class BASIC006 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            int sum=0;
            for (char c : s.toCharArray()) {
                if(c=='1'||c=='2'||c=='3'||c=='4'||c=='5'
                    ||c=='6'||c=='7'||c=='8'||c=='9'
                ){
                    sum+=1;
                }
            }
            System.out.println(sum);
        }
    }
}
