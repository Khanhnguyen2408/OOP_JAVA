import java.util.Scanner;
public class BASIC011 {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String [] parts = sc.nextLine().split(" ");
            if(parts.length<2){
                System.out.println(0);
                continue;
            }
            int min = Integer.MAX_VALUE;
            int prev = Integer.parseInt(parts[0]);
            for(int i=1;i<parts.length;i++){
                int cur = Integer.parseInt(parts[i]);
                int gap = cur - prev;
                min = Math.min(min,gap);
                prev=cur;
            }
            System.out.println(min);
        }
    }
}
