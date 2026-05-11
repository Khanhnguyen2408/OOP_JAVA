import java.util.Scanner;
class NotContainVowelException extends Exception{
    public NotContainVowelException (String message){
        super(message);
    }
}
public class EXCEPTION006 {
    public static void checkVowel (String str)throws NotContainVowelException{
        String lower = str.toLowerCase();
        for(char c:lower.toCharArray()){
            if(c=='u'||c=='e'||c=='o'||c=='a'||c=='i'){
                return;
            }
        }
        throw new NotContainVowelException("String not contain vowels");
    }
    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-->0){
            String str = scanner.nextLine();
            try{
                checkVowel(str);
                System.out.println("String has vowels");
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
