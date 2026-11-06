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

    public Sach() {
    }

    public Sach(String maSach, String tenSach, String tacGia, int namXuatBan, double donGia, int soLuong) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

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

    // Nhap thong tin sach moi
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

    // Tinh thanh tien (gia tri cuon sach)
    public double tinhThanhTien() {
        return this.donGia * this.soLuong;
    }

    // Chuyen thong tin sach thanh 1 chuoi String (Phuc vu Bai 3 & Bai 4)
    public String toChuoiThongTin() {
        return String.format("Ma: %-6s | Ten: %-20s | TG: %-15s | Nam: %-4d | Gia: %-8.0f | SL: %-3d | Thanh tien: %.0f",
                maSach, tenSach, tacGia, namXuatBan, donGia, soLuong, tinhThanhTien());
    }

    public void hienThiThongTin() {
        System.out.println(toChuoiThongTin());
    }
}