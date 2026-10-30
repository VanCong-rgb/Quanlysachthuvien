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
    // Khai bao cac thuoc tinh cua cuon sach
    private String maSach;
    private String tenSach;
    private String tacGia;
    private int namXuatBan;
    private double donGia;
    private int soLuong;
    private String loaiSach;

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

    // =================================================================
    // PHAN TUAN 3: NHAP XUAT VA TINH GIA TRI NHAP KHO (BAI 1 -> BAI 4)
    // =================================================================

    // Bai 1 (Tuan 3): Nhap thong tin sach
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

    // Bai 2 (Tuan 3): Tinh thanh tien = don gia * so luong
    public double tinhThanhTien() {
        return this.donGia * this.soLuong;
    }

    // Bai 3 (Tuan 3): Phi van chuyen = 5% gia tri sach
    public double tinhPhiVanChuyen() {
        return this.tinhThanhTien() * 0.05;
    }

    // Bai 4 (Tuan 3): Tong tien nhap = Thanh tien + Phi van chuyen
    public double tinhTongTienNhap() {
        return this.tinhThanhTien() + this.tinhPhiVanChuyen();
    }

    // =================================================================
    // PHAN TUAN 4: CAU TRUC DIEU KIEN RA QUYET DINH (BAI 1 -> BAI 4)
    // =================================================================

    // Bai 1 (Tuan 4): Kiem tra gia > 0, so luong >= 0, nam xuat ban hop le
    public boolean kiemTraHopLe() {
        boolean giaHopLe = this.donGia > 0;
        boolean soLuongHopLe = this.soLuong >= 0;
        boolean namHopLe = (this.namXuatBan > 0 && this.namXuatBan <= 2026);

        return giaHopLe && soLuongHopLe && namHopLe;
    }

    public String layKetQuaHopLe() {
        if (kiemTraHopLe()) {
            return "Thong tin sach HOP LE";
        } else {
            String loi = "KHONG HOP LE (";
            if (this.donGia <= 0) loi += "Gia phai > 0; ";
            if (this.soLuong < 0) loi += "So luong phai >= 0; ";
            if (this.namXuatBan <= 0 || this.namXuatBan > 2026) loi += "Nam XB khong hop le; ";
            return loi + ")";
        }
    }

    // Bai 2 (Tuan 4): Phan loai gia: thap, trung binh, cao, dac biet
    public String phanLoaiGia() {
        if (this.donGia < 50000) {
            return "Sach gia thap";
        } else if (this.donGia <= 100000) {
            return "Sach gia trung binh";
        } else if (this.donGia <= 200000) {
            return "Sach gia cao";
        } else {
            return "Sach gia dac biet";
        }
    }

    // Bai 3 (Tuan 4): Phan loai ton kho: het, sap het, con it, con nhieu
    public String phanLoaiTonKho() {
        if (this.soLuong == 0) {
            return "Het sach";
        } else if (this.soLuong >= 1 && this.soLuong <= 5) {
            return "Sap het";
        } else if (this.soLuong >= 6 && this.soLuong <= 20) {
            return "Con it";
        } else if (this.soLuong > 20) {
            return "Con nhieu";
        } else {
            return "So luong am (Khong hop le)";
        }
    }

    // Bai 4 (Tuan 4): Dung switch chon loai sach
    public void chonLoaiSach(Scanner sc) {
        System.out.println("\n--- CHON LOAI SACH (Bai 4 - Tuan 4) ---");
        System.out.println("1. Sach giao khoa");
        System.out.println("2. Sach tham khao");
        System.out.println("3. Sach chuyen nganh");
        System.out.println("4. Sach khac");
        System.out.print("Moi chon loai sach (1-4): ");
        int luaChon = Integer.parseInt(sc.nextLine());

        switch (luaChon) {
            case 1:
                this.loaiSach = "Sach giao khoa";
                break;
            case 2:
                this.loaiSach = "Sach tham khao";
                break;
            case 3:
                this.loaiSach = "Sach chuyen nganh";
                break;
            case 4:
                this.loaiSach = "Sach khac";
                break;
            default:
                this.loaiSach = "Khong xac dinh (Chon sai)";
                break;
        }
    }

    // =================================================================
    // HIEN THI TONG HOP KET QUA TUAN 3 VA TUAN 4
    // =================================================================
    public void hienThiDayDu() {
        System.out.println("\n================ KET QUA QUAN LY SACH ================");
        System.out.println("--- 1. THONG TIN CO BAN & NHAP KHO (TUAN 3) ---");
        System.out.println("Ma sach                 : " + maSach);
        System.out.println("Ten sach                : " + tenSach);
        System.out.println("Tac gia                 : " + tacGia);
        System.out.println("Nam xuat ban            : " + namXuatBan);
        System.out.printf("Don gia                 : %.0f VND\n", donGia);
        System.out.println("So luong                : " + soLuong);
        System.out.printf("[Bai 2 - T3] Thanh tien : %.0f VND\n", tinhThanhTien());
        System.out.printf("[Bai 3 - T3] Phi VC(5%%) : %.0f VND\n", tinhPhiVanChuyen());
        System.out.printf("[Bai 4 - T3] Tong tien  : %.0f VND\n", tinhTongTienNhap());

        System.out.println("\n--- 2. KET QUA RA QUYET DINH (TUAN 4) ---");
        System.out.println("[Bai 1 - T4] Kiem tra   : " + layKetQuaHopLe());
        System.out.println("[Bai 2 - T4] Muc gia    : " + phanLoaiGia());
        System.out.println("[Bai 3 - T4] Ton kho    : " + phanLoaiTonKho());
        System.out.println("[Bai 4 - T4] Loai sach  : " + loaiSach);
        System.out.println("======================================================");
    }
  }

