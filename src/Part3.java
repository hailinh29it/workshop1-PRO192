
import java.util.Scanner;

public class Part3 {

    public static void main(String[] args) {
        // call
        input();
    }

    public static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students:  ");
        int n = sc.nextInt();
        // delete garbage in memory (delete enter)
        sc.nextLine();
        String[] list = new String[n];
        for (int i = 0; i < list.length; i++) {
            // input for each student 
            list[i] = sc.nextLine();
            // call firstUppercase to in hoa chữ cái đầu rồi gán lại vào list.
            list[i] = firstUppercase(list[i]);
        }
        // output each student in class after processing name
        for (int i = 0; i < list.length; i++) {
            System.out.printf("Name of student " + i + " |%-20s| \n", list[i]);

        }
    }

    public static String firstUppercase(String x) {
        // delete dấu cách ở đầu và cuối chuỗi
        x = x.trim();
        
        // cắt ra thành chuỗi --> dùng hàm split \\s+. lưu ý không dùng
        // \\s vì nó tương đương " ", cho nên là nếu lỡ người dùng nhập 2
        // khoảng trống liền kề nó sẽ bị dư ra 1 khoảng trống --> dùng \\s+
        String[] arr = x.split("\\s+");
       // tạo 1 cái stringbuilder để ráp các chuỗi thành 1 mảng
        StringBuilder sb = new StringBuilder();
        // sau khi tách tên thành một mảng thì xét từng giá trị
        for (int i = 0; i < arr.length; i++) {
            // gán vào chuỗi mới 
            String arnew = arr[i];
            //   Sử dụng substring(0,1) để lấy chữ cái đầu và in hoa nó bởi
            // toUpperCase rồi gán vào chuỗi mới có tên là connect
            String connect = arnew.substring(0, 1).toUpperCase();
            // da in hoa chu cai dau
            connect = connect + arnew.substring(1).toLowerCase();
            // Gán chữ cái đầu với phần còn lại của từ đó và toLowercase 
            // nhầm đảm bảo rằng chỉ có chữ đầu tiên in hoa

            // --> tạo ra cái append để đưa các mảng 
            // thành 1 cái String rồi ghép lại.
            
            //  dùng .append để nối dấu cách
            sb.append(connect).append(" ");
        }
        // cuối cùng là .toString để trả về 1 chuỗi String
        return sb.toString();
    }

}
