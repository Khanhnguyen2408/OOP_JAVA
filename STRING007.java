import java.util.Scanner;
public class STRING007{
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0){
            String s = scanner.nextLine();
            int [] count = new int[26];
            for (int i=0;i<s.length();i++){
                count [s.charAt(i)-'a']++;
            }
            boolean isTrue = true;
            for(int i=0;i<count.length;i++){
                if(count[i]==0){
                    isTrue=false;
                    break;
                }
            }
            System.out.println(isTrue);
        }
    }
}