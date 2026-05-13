import java.util.Scanner;
class FileNameFormatExeption extends Exception{
    public FileNameFormatExeption (String message){
        super(message);
    }
}
class Test{
    public static void open_file(String s){
        try{
            f(s);
            System.out.println("File opened");
        }catch (FileNameFormatExeption e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("File name format");
        }
    }
    public static void f(String s) throws FileNameFormatExeption{
        if(s.contains(" ")){
            throw new FileNameFormatExeption("File name format");
        }
    }
}
public class EXCEPTION008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Test.open_file(s);
        sc.close();
    }
}
