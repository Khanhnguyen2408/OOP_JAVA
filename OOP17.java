import java.util.Scanner;

public class OOP17 {
    // 1. Sửa lỗi: Nested class Final phải là static để chứa phương thức tĩnh
    static class Final {
        static void f(boolean[] a, String[] b, Integer c) {
            System.out.println(b[0]);
            a[0] = true;
            c = c + 1;
            System.out.println(a[0]);
            System.out.println(c);
        }
        static void f(int d, char e, StringBuffer f) {
            System.out.println(d);
            d = d + (int)e;
            System.out.println(f);
        }
        static void f(double g, byte i, Float h){
            g = g + h;
            System.out.println(i + g);
        }
    }

    public static void main(String[] args) {
        // Các biến khởi tạo theo đề bài
        int a = 10;
        double b = 3.14;
        char c = 'c';
        String[] d = {"OOP", "2023"};
        Integer e = 1;
        boolean[] f = {false, true};
        StringBuffer g = new StringBuffer("Khoa Vien Thong");
        byte h = 20;
        Float i = 0.5f;

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            String[] params = line.split("\\s+");

            if (params.length == 3) {
                String p1 = params[0];
                String p2 = params[1];
                String p3 = params[2];

                // Logic ánh xạ tên biến vào đúng hàm nạp chồng (Overloading)
                
                // Trường hợp 1: f(boolean[] a, String[] b, Integer c)
                if (p1.equals("f") && p2.equals("d") && p3.equals("e")) {
                    Final.f(f, d, e);
                } 
                // Trường hợp 2: f(int d, char e, StringBuffer f)
                else if (p1.equals("a") && p2.equals("c") && p3.equals("g")) {
                    Final.f(a, c, g);
                }
                // Trường hợp 3: f(double g, byte i, Float h)
                else if (p1.equals("b") && p2.equals("h") && p3.equals("i")) {
                    Final.f(b, h, i);
                }
            }
        }
        sc.close();
    }
}