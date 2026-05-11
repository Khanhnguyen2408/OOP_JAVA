import java.math.BigDecimal;
import java.util.Scanner;

public class LAB01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Đọc số lượng test case
        if (scanner.hasNextInt()) {
            int testcases = scanner.nextInt();
            scanner.nextLine(); // Dọn dẹp ký tự xuống dòng (Enter) thừa

            // Lặp qua từng test case
            for (int i = 0; i < testcases; i++) {
                String line = scanner.nextLine().trim();

                // Cắt chuỗi thành mảng các số dựa trên khoảng trắng
                String[] parts = line.split("\\s+");
                
                // Biến lưu tổng các phần thập phân
                BigDecimal sum = BigDecimal.ZERO;

                // Xử lý từng số trong dòng
                for (String part : parts) {
                    try {
                        BigDecimal num = new BigDecimal(part);
                        
                        // Lấy phần thập phân bằng cách chia lấy dư cho 1. 
                        // Dùng .abs() để đảm bảo phần thập phân luôn dương (nếu có số âm)
                        BigDecimal fractionalPart = num.remainder(BigDecimal.ONE).abs();
                        
                        // Cộng dồn vào tổng
                        sum = sum.add(fractionalPart);
                    } catch (NumberFormatException e) {
                        // Bỏ qua nếu có thành phần không phải là số hợp lệ
                    }
                }

                // Kiểm tra và in kết quả ra màn hình
                // Sử dụng compareTo để so sánh giá trị toán học với 0
                if (sum.compareTo(BigDecimal.ZERO) == 0) {
                    System.out.println("0");
                } else {
                    // stripTrailingZeros() giúp loại bỏ các số 0 vô nghĩa ở cuối (ví dụ: 0.800 -> 0.8)
                    // toPlainString() in ra chuỗi số thông thường (tránh bị hiển thị dưới dạng số mũ khoa học E)
                    System.out.println(sum.stripTrailingZeros().toPlainString());
                }
            }
        }
        
        scanner.close();
    }
}