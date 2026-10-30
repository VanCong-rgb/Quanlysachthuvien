/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlysachthuvien;
import java.util.Scanner;
/**
 *
 * @author LVC
 */
public class Quanlysachthuvien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        // Cách 1: Khởi tạo đối tượng sách bằng Constructor có tham số
        Sach sach1 = new Sach("S001", "Lập trình Hướng đối tượng", "Nguyễn Văn A", 2024, 15, 85000);

        // Cách 2: Khởi tạo đối tượng bằng Constructor mặc định và nhập từ bàn phím
        System.out.println("=== NHAP THONG TIN SACH MOI ===");
        Sach sach2 = new Sach();
        sach2.nhapThongTin(sc);

        // Hiển thị danh sách sách thư viện
        System.out.println("\n=== DANH SACH TRONG THU VIEN ===");
        sach1.hienThiThongTin();
        sach2.hienThiThongTin();

        sc.close();
    }
    
}
