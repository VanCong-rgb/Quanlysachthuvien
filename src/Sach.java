/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LVC
 */

import java.time.Year;

public class Sach {

    // Yeu cau 1: Khai bao cac thuoc tinh private
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    // Yeu cau 4: Constructor co tham so day du
    public Sach(String maSach, String tieuDe, String tacGia,
                int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        setNamXuatBan(namXuatBan);
        setSoLuong(soLuong);
    }

    // Yeu cau 2: Getter va Setter cho maSach
    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    // Getter va Setter cho tieuDe
    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    // Getter va Setter cho tacGia
    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    // Getter va Setter cho namXuatBan
    public int getNamXuatBan() {
        return namXuatBan;
    }

    // Yeu cau 3: Kiem tra nam xuat ban
    public void setNamXuatBan(int namXuatBan) {
        int currentYear = Year.now().getValue();

        if (namXuatBan > 0 && namXuatBan <= currentYear) {
            this.namXuatBan = namXuatBan;
        } else {
            throw new IllegalArgumentException(
                "Nam xuat ban khong hop le!"
            );
        }
    }

    // Getter va Setter cho soLuong
    public int getSoLuong() {
        return soLuong;
    }

    // Yeu cau 3: Kiem tra so luong khong am
    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else {
            throw new IllegalArgumentException(
                "So luong khong duoc am!"
            );
        }
    }

    // Phuong thuc hien thi thong tin sach
    public void hienThiThongTin() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Tieu de: " + tieuDe);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("So luong: " + soLuong);
    }
}

