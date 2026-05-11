import java.util.Scanner;
class OverheatException extends Exception{
    public OverheatException(String message){
        super(message);
    }
}
class Reactor{
    private double temperature;
    public Reactor (double temperature){
        this.temperature = temperature;
    }
    public void increaseTemperature(double amount) throws OverheatException{
        if(amount<=0){
            throw new IllegalArgumentException("Lỗi: Giá trị tăng phải lớn hơn 0.");
        }
        if(temperature+amount>1000){
            throw new OverheatException("Lỗi: Vượt quá ngưỡng an toàn! Nhiệt độ nguy hiểm.");
        }
        temperature += amount;
        System.out.println("Nhiệt độ hiện tại: "+temperature+"độ C");
    }
}
public class EXCEPTION007{
    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);
        double initialTemperature = Double.parseDouble(scanner.nextLine());
        Reactor reactor = new Reactor (initialTemperature);
        while(scanner.hasNextLine()){
            String input = scanner.nextLine();
            try{
                double amount = Double.parseDouble(input);
                reactor.increaseTemperature(amount);
            }
            catch (NumberFormatException e){
                System.out.println("Nhập: " + input + " => Lỗi: Định dạng không hợp lệ.");
            }
            catch (Exception e){
                System.out.println("Nhập: " + input +" => "+ e.getMessage());
            }
        }
    }
}