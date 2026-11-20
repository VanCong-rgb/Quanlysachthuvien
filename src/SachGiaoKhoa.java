/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LVC
 */

import java.time.LocalDate;

public class SachGiaoKhoa extends Sach {

    private String tinhTrang;

    // Constructor
    public SachGiaoKhoa(String maSach, LocalDate ngayNhap,
                        double donGia, int soLuong,
                        String nhaXuatBan, String tinhTrang) {

        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.tinhTrang = tinhTrang;
    }

    // Getter va Setter
    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    // Tinh thanh tien
    @Override
    public double thanhTien() {
        if (tinhTrang.equalsIgnoreCase("moi")) {
            return soLuong * donGia;
        } else {
            return soLuong * donGia * 0.5;
        }
    }

    // Hien thi thong tin
    @Override
    public void hienThi() {
        System.out.println("===== SACH GIAO KHOA =====");
        super.hienThi();
        System.out.println("Tinh trang: " + tinhTrang);
        System.out.println("Thanh tien: " + thanhTien());
    }
}
