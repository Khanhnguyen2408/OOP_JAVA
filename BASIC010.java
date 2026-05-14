import java.util.Scanner;
public class BASIC010 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            String a ="";
            if(s.length()%2==0){
                for(int i=0;i<s.length();i+=2){
                    a += s.charAt(i+1);
                    a += s.charAt(i);
                }
            }
            else{
                a+=s.charAt(0);
                for(int i=1;i<s.length();i+=2){
                    a += s.charAt(i+1);
                    a += s.charAt(i);
                }
            }
            System.out.println(a);
        }
    }
}
