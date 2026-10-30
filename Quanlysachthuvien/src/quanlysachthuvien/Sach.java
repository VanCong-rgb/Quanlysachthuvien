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
    private int soLuong;
    private double giaBan;

    // 2. Constructor không tham số (Mặc định)
    public Sach() {
    }

    // 3. Constructor đầy đủ tham số
    public Sach(String maSach, String tenSach, String tacGia, int namXuatBan, int soLuong, double giaBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaBan = giaBan;
    }

    // 4. Các phương thức Getter và Setter
    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    // 5. Phương thức nhập thông tin sách từ bàn phím
    public void nhapThongTin(Scanner sc) {
        System.out.print("Nhap ma sach: ");
        this.maSach = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        this.tenSach = sc.nextLine();
        System.out.print("Nhap tac gia: ");
        this.tacGia = sc.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        this.namXuatBan = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap so luong: ");
        this.soLuong = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap gia ban: ");
        this.giaBan = Double.parseDouble(sc.nextLine());
    }

    // 6. Phương thức hiển thị thông tin sách
    public void hienThiThongTin() {
        System.out.printf("Ma sach: %-10s | Ten sach: %-25s | Tac gia: %-20s | Nam XB: %-6d | SL: %-4d | Gia: %.2f\n",
                maSach, tenSach, tacGia, namXuatBan, soLuong, giaBan);
    }
}
