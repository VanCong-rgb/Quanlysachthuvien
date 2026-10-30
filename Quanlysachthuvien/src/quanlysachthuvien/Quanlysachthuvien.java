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

        Sach sach = new Sach();

        // 1. Nhap thong tin cuon sach (Bai 1 - Tuan 3)
        System.out.println("=== NHAP THONG TIN CUON SACH ===");
        sach.nhapThongTin(sc);

        // 2. Chon loai sach bang switch-case (Bai 4 - Tuan 4)
        sach.chonLoaiSach(sc);

        // 3. Hien thi toan bo ket qua tinh toan Tuan 3 va phan loai Tuan 4
        sach.hienThiDayDu();
    }
    
}
