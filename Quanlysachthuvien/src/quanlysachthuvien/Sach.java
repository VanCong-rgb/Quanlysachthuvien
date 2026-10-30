/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlysachthuvien;
import java.util.Scanner;
/**
 *
 * @author LVC
 */
public class Sach {
private String maSach;
    private String tenSach;
    private String tacGia;
    private int namXuatBan;
    private double donGia;
    private int soLuong;

    // Constructor mac dinh
    public Sach() {
    }

    // Constructor day du tham so
    public Sach(String maSach, String tenSach, String tacGia, int namXuatBan, double donGia, int soLuong) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    // Getter va Setter
    public String getMaSach() { return maSach; }
    public void setMaSach(String maSach) { this.maSach = maSach; }

    public String getTenSach() { return tenSach; }
    public void setTenSach(String tenSach) { this.tenSach = tenSach; }

    public String getTacGia() { return tacGia; }
    public void setTacGia(String tacGia) { this.tacGia = tacGia; }

    public int getNamXuatBan() { return namXuatBan; }
    public void setNamXuatBan(int namXuatBan) { this.namXuatBan = namXuatBan; }

    public double getDonGia() { return donGia; }
    public void setDonGia(double donGia) { this.donGia = donGia; }

    public int getSoLuong() { return soLuong; }
    public void setSoLuong(int soLuong) { this.soLuong = soLuong; }

    // =================================================================
    // BAI 1: Nhap ma sach, ten sach, tac gia, nam XB, don gia, so luong
    // =================================================================
    public void nhapThongTin(Scanner sc) {
        System.out.print("Nhap ma sach: ");
        this.maSach = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        this.tenSach = sc.nextLine();
        System.out.print("Nhap tac gia: ");
        this.tacGia = sc.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        this.namXuatBan = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap don gia: ");
        this.donGia = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap so luong: ");
        this.soLuong = Integer.parseInt(sc.nextLine());
    }

    // Hien thi thong tin sach (Bai 1)
    public void hienThiThongTin() {
        System.out.println("Ma sach      : " + maSach);
        System.out.println("Ten sach     : " + tenSach);
        System.out.println("Tac gia      : " + tacGia);
        System.out.println("Nam xuat ban : " + namXuatBan);
        System.out.printf("Don gia      : %.2f VND\n", donGia);
        System.out.println("So luong     : " + soLuong);
    }

    // =================================================================
    // BAI 2: Tinh thanh tien = don gia * so luong
    // =================================================================
    public double tinhThanhTien() {
        return this.donGia * this.soLuong;
    }

    // =================================================================
    // BAI 3: Phi van chuyen = 5% gia tri sach
    // =================================================================
    public double tinhPhiVanChuyen() {
        return this.tinhThanhTien() * 0.05;
    }

    // =================================================================
    // BAI 4: Tong tien nhap = Thanh tien + Phi van chuyen
    // =================================================================
    public double tinhTongTienNhap() {
        return this.tinhThanhTien() + this.tinhPhiVanChuyen();
    }

    // Hien thi day du ket qua tinh toan tu Bai 1 den Bai 4
    public void hienThiKetQuaNhapKho() {
        hienThiThongTin();
        System.out.printf("-> [Bai 2] Thanh tien       : %.2f VND\n", tinhThanhTien());
        System.out.printf("-> [Bai 3] Phi van chuyen   : %.2f VND\n", tinhPhiVanChuyen());
        System.out.printf("-> [Bai 4] Tong tien nhap   : %.2f VND\n", tinhTongTienNhap());
    }
}
