import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class UsedCarException extends Exception{
    public UsedCarException(String vin){
        super(vin);
    }
}
class UsedCar{
    String vin, make;
    int year, mileage;
    double price;
    public UsedCar(String vin, String make, int year, int mileage, double price) throws UsedCarException{
        if(!vin.matches("\\d{4}")||
        !(make.equals("Ford")||make.equals("Honda")||make.equals("Toyota")||make.equals("Chrysler"))||
        year<1990||year>2014||
        mileage<0||price<0){
            throw new UsedCarException ("Invalid UsedCar: VIN "+ vin);
        }
        this.vin=vin;
        this.make=make;
        this.year=year;
        this.mileage=mileage;
        this.price=price;
    }
    @Override
    public String toString(){
        return String.format(
            "UsedCar{vin='%s', make='%s', year=%d, mileage=%d, price=%.1f}",
            vin, make, year, mileage, price
        );
    }
}
public class EXCEPTION003 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List <UsedCar> list = new ArrayList<>();
        for (int i=0;i<n;i++){
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            String vin = parts[0];
            String make = parts[1];
            int year=Integer.parseInt(parts[2]);
            int mileage=Integer.parseInt(parts[3]);
            double price=Double.parseDouble(parts[4]);
            try{
                UsedCar car = new UsedCar(vin,make,year,mileage,price);
                list.add(car);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("List of successfully constructed UsedCar objects:");
        if(list.isEmpty()){
            System.out.println("No used cars");
        }else{
            for(UsedCar car:list){
                System.out.println(car);
            }
        }
    } 
}
