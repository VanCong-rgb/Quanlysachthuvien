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
    private String loaiSach = "Chua phan loai";

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

    // Cac phuong thuc Getter & Setter phuc vu truy xuat o Tuan 5
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
    // CAC PHUONG THUC TUAN 3: Nhap xuat va tinh gia tri nhap kho
    // =================================================================
    public void nhapThongTin(Scanner sc) {
        System.out.print("Nhap ma sach: ");
        this.maSach = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        this.tenSach = sc.nextLine();
        System.out.print("Nhap tac gia: ");
        this.tacGia = sc.nextLine();

        // Su dung vong lap while (Tuan 5) ket hop dieu kien Tuan 4 de nhap dung du lieu
        while (true) {
            System.out.print("Nhap nam xuat ban (1 - 2026): ");
            this.namXuatBan = Integer.parseInt(sc.nextLine());
            if (this.namXuatBan > 0 && this.namXuatBan <= 2026) break;
            System.out.println("-> Loi: Nam xuat ban khong hop le, vui long nhap lai!");
        }

        while (true) {
            System.out.print("Nhap don gia (> 0): ");
            this.donGia = Double.parseDouble(sc.nextLine());
            if (this.donGia > 0) break;
            System.out.println("-> Loi: Don gia phai > 0, vui long nhap lai!");
        }

        while (true) {
            System.out.print("Nhap so luong (>= 0): ");
            this.soLuong = Integer.parseInt(sc.nextLine());
            if (this.soLuong >= 0) break;
            System.out.println("-> Loi: So luong phai >= 0, vui long nhap lai!");
        }

        chonLoaiSach(sc);
    }

    // Tinh thanh tien = don gia * so luong (Bai 2 - Tuan 3)
    public double tinhThanhTien() {
        return this.donGia * this.soLuong;
    }

    // Phi van chuyen = 5% gia tri sach (Bai 3 - Tuan 3)
    public double tinhPhiVanChuyen() {
        return this.tinhThanhTien() * 0.05;
    }

    // Tong tien nhap = Thanh tien + Phi van chuyen (Bai 4 - Tuan 3)
    public double tinhTongTienNhap() {
        return this.tinhThanhTien() + this.tinhPhiVanChuyen();
    }

    // =================================================================
    // CAC PHUONG THUC TUAN 4: Phan loai gia, ton kho, loai sach
    // =================================================================
    public String phanLoaiGia() {
        if (this.donGia < 50000) return "Sach gia thap";
        else if (this.donGia <= 100000) return "Sach gia trung binh";
        else if (this.donGia <= 200000) return "Sach gia cao";
        else return "Sach gia dac biet";
    }

    public String phanLoaiTonKho() {
        if (this.soLuong == 0) return "Het sach";
        else if (this.soLuong <= 5) return "Sap het";
        else if (this.soLuong <= 20) return "Con it";
        else return "Con nhieu";
    }

    public void chonLoaiSach(Scanner sc) {
        System.out.print("Chon loai sach (1: Giao khoa | 2: Tham khao | 3: Chuyen nganh | 4: Khac): ");
        int chon = Integer.parseInt(sc.nextLine());
        switch (chon) {
            case 1: this.loaiSach = "Sach giao khoa"; break;
            case 2: this.loaiSach = "Sach tham khao"; break;
            case 3: this.loaiSach = "Sach chuyen nganh"; break;
            default: this.loaiSach = "Sach khac"; break;
        }
    }

    // Hien thi thong tin 1 cuon sach tren 1 dong gon gang
    public void hienThiThongTin() {
        System.out.printf("Ma: %-6s | Ten: %-20s | TG: %-14s | Nam: %-4d | Gia: %-9.0f | SL: %-3d | Thanh tien: %-10.0f | Loai: %-16s | Ton: %s\n",
                maSach, tenSach, tacGia, namXuatBan, donGia, soLuong, tinhThanhTien(), loaiSach, phanLoaiTonKho());
    }
}