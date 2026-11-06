/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlysachthuvien;
import java.util.Scanner;
import java.util.ArrayList;
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
        ArrayList<Sach> danhSachSach = new ArrayList<>();
        int luaChon;

        // =================================================================
        // BAI 3 (TUAN 5): Menu lap lien tuc bang do-while den khi chon Thoat
        // =================================================================
        do {
            System.out.println("\n================ MENU QUAN LY THU VIEN (TUAN 5) ================");
            System.out.println("1. [Bai 1] Nhap n cuon sach bang vong lap");
            System.out.println("2. Hien thi danh sach tat ca cac sach trong thu vien");
            System.out.println("3. [Bai 2] Tinh tong so luong va tong gia tri sach");
            System.out.println("4. [Bai 4] Tim kiem sach theo ma sach");
            System.out.println("0. [Bai 3] Thoat chuong trinh");
            System.out.println("================================================================");
            System.out.print("Moi ban chon chuc nang (0 - 4): ");
            luaChon = Integer.parseInt(sc.nextLine());

            switch (luaChon) {
                case 1:
                    // =========================================================
                    // BAI 1 (TUAN 5): Nhap n sach bang vong lap
                    // =========================================================
                    int n;
                    while (true) {
                        System.out.print("\nNhap so luong dau sach can them (n > 0): ");
                        n = Integer.parseInt(sc.nextLine());
                        if (n > 0) break;
                        System.out.println("-> Vui long nhap n > 0!");
                    }

                    for (int i = 0; i < n; i++) {
                        System.out.println("\n--- Nhap thong tin cuon sach thu " + (i + 1) + " ---");
                        Sach s = new Sach();
                        s.nhapThongTin(sc);
                        danhSachSach.add(s);
                    }
                    System.out.println("-> Da nhap xong " + n + " cuon sach vao thu vien!");
                    break;

                case 2:
                    // Hien thi danh sach sach bang vong lap for
                    if (danhSachSach.isEmpty()) {
                        System.out.println("-> Thu vien hien dang trong! Vui long chon chuc nang 1 de nhap sach.");
                    } else {
                        System.out.println("\n--- DANH SACH SACH TRONG THU VIEN ---");
                        for (int i = 0; i < danhSachSach.size(); i++) {
                            danhSachSach.get(i).hienThiThongTin();
                        }
                    }
                    break;

                case 3:
                    // =========================================================
                    // BAI 2 (TUAN 5): Tinh tong so luong va tong gia tri sach
                    // =========================================================
                    if (danhSachSach.isEmpty()) {
                        System.out.println("-> Thu vien dang trong, chua co du lieu de tinh tong!");
                    } else {
                        int tongSoLuong = 0;
                        double tongGiaTriSach = 0;
                        double tongTienNhapKho = 0;

                        for (int i = 0; i < danhSachSach.size(); i++) {
                            Sach s = danhSachSach.get(i);
                            tongSoLuong += s.getSoLuong();
                            tongGiaTriSach += s.tinhThanhTien();
                            tongTienNhapKho += s.tinhTongTienNhap();
                        }

                        System.out.println("\n--- THONG KE TONG SO LUONG & GIA TRI SACH (BAI 2) ---");
                        System.out.println("Tong so dau sach               : " + danhSachSach.size() + " dau sach");
                        System.out.println("Tong so luong sach             : " + tongSoLuong + " cuon");
                        System.out.printf("Tong gia tri sach (Thanh tien) : %.0f VND\n", tongGiaTriSach);
                        System.out.printf("Tong tien nhap (Kem 5%% phi VC) : %.0f VND\n", tongTienNhapKho);
                    }
                    break;

                case 4:
                    // =========================================================
                    // BAI 4 (TUAN 5): Tim sach theo ma bang vong lap
                    // =========================================================
                    if (danhSachSach.isEmpty()) {
                        System.out.println("-> Thu vien dang trong! Vui long nhap sach truoc khi tim.");
                    } else {
                        System.out.print("\nNhap ma sach can tim: ");
                        String maCanTim = sc.nextLine();
                        boolean timThay = false;

                        for (int i = 0; i < danhSachSach.size(); i++) {
                            Sach s = danhSachSach.get(i);
                            if (s.getMaSach().equalsIgnoreCase(maCanTim)) {
                                System.out.println("-> TIM THAY SACH:");
                                s.hienThiThongTin();
                                timThay = true;
                                break; // Thoat vong lap khi da tim thay ma
                            }
                        }

                        if (!timThay) {
                            System.out.println("-> Khong tim thay cuon sach nao co ma: " + maCanTim);
                        }
                    }
                    break;

                case 0:
                    System.out.println("-> Da thoat chuong trinh. Tam biet!");
                    break;

                default:
                    System.out.println("-> Chuc nang khong hop le! Vui long chon tu 0 den 4.");
                    break;
            }
        } while (luaChon != 0);
    }
}
