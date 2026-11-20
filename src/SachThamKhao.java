/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LVC
 */

import java.time.LocalDate;

public class SachThamKhao extends Sach {

    private double thue;

    // Constructor
    public SachThamKhao(String maSach, LocalDate ngayNhap,
                        double donGia, int soLuong,
                        String nhaXuatBan, double thue) {

        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.thue = thue;
    }

    // Getter va Setter
    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }

    // Tinh thanh tien
    @Override
    public double thanhTien() {
        return soLuong * donGia + thue;
    }

    // Hien thi thong tin
    @Override
    public void hienThi() {
        System.out.println("===== SACH THAM KHAO =====");
        super.hienThi();
        System.out.println("Thue: " + thue);
        System.out.println("Thanh tien: " + thanhTien());
    }
}
