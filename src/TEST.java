/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LVC
 */
public class TEST {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Tao doi tuong Sach bang constructor
        Sach sach = new Sach(
            "S01",
            "Lap trinh Java",
            "Nguyen Van A",
            2024,
            10
        );

        // Hien thi thong tin ban dau
        System.out.println("===== THONG TIN SACH =====");
        sach.hienThiThongTin();

        // Su dung Setter
        System.out.println("\n===== CAP NHAT THONG TIN =====");

        sach.setTieuDe("Lap trinh huong doi tuong");
        sach.setTacGia("Nguyen Van B");
        sach.setNamXuatBan(2025);
        sach.setSoLuong(20);

        // Su dung Getter
        System.out.println("\n===== THONG TIN SAU KHI CAP NHAT =====");
        System.out.println("Ma sach: " + sach.getMaSach());
        System.out.println("Tieu de: " + sach.getTieuDe());
        System.out.println("Tac gia: " + sach.getTacGia());
        System.out.println("Nam xuat ban: " + sach.getNamXuatBan());
        System.out.println("So luong: " + sach.getSoLuong());

        sc.close();
    }
}
