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

        // Thuc hien Bai 1: Nhap thong tin cuon sach
        System.out.println("=== NHAP THONG TIN SACH NHAP KHO ===");
        sach.nhapThongTin(sc);

        // Hien thi ket qua Bai 1, Bai 2, Bai 3, Bai 4
        System.out.println("\n=== THONG TIN SACH VA GIA TRI NHAP KHO ===");
        sach.hienThiKetQuaNhapKho();
    }
    
}
