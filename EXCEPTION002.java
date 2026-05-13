import java.util.Scanner;
class NotJavaFileException extends Exception{
    public NotJavaFileException (String message){
        super(message);
    }
}
public class EXCEPTION002 {
    public static int checkFileExtension(String fileName) throws NotJavaFileException{
        if(fileName==null||fileName.isEmpty()==true){
            throw new NotJavaFileException("Not java file exception.Mark is -1");
        }else if (fileName.contains(".java")){
            return 1;
        }else{
            return 0;
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String fileName=sc.nextLine();
            try{
                int result=checkFileExtension(fileName);
                System.out.println(result);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
