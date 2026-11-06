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

    // =====================================================================
    // BAI 1 (TUAN 6): Mang int[] soLuong (5 cuon sach): Hien thi, Tong, Max
    // =====================================================================
    public static void thucHanhBai1(Scanner sc) {
        int[] soLuong = new int[5];
        System.out.println("\n--- BAI 1: NHAP SO LUONG CUA 5 CUON SACH ---");
        for (int i = 0; i < soLuong.length; i++) {
            System.out.print("Nhap so luong cuon sach thu " + (i + 1) + ": ");
            soLuong[i] = Integer.parseInt(sc.nextLine());
        }

        int tong = 0;
        int max = soLuong[0];
        System.out.print("-> Danh sach so luong vua nhap: ");
        for (int i = 0; i < soLuong.length; i++) {
            System.out.print(soLuong[i] + "  ");
            tong += soLuong[i];
            if (soLuong[i] > max) {
                max = soLuong[i];
            }
        }
        System.out.println("\n-> Tong so luong 5 cuon sach : " + tong);
        System.out.println("-> So luong lon nhat (Max)   : " + max);
    }

    // =====================================================================
    // BAI 2 (TUAN 6): ArrayList<String> luu ma sach (Them, Hien thi, Tim, Xoa)
    // =====================================================================
    public static void thucHanhBai2(Scanner sc) {
        ArrayList<String> dsMaSach = new ArrayList<>();
        System.out.println("\n--- BAI 2: QUAN LY MA SACH BANG ARRAYLIST<STRING> ---");

        // 1. Them ma sach (add)
        System.out.print("Nhap so luong ma sach muon them: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap ma sach thu " + (i + 1) + ": ");
            dsMaSach.add(sc.nextLine());
        }

        // 2. Hien thi ma sach (size, get)
        System.out.println("-> Danh sach ma sach hien co (" + dsMaSach.size() + " ma): " + dsMaSach);

        // 3. Tim ma sach (contains)
        System.out.print("Nhap ma sach can tim: ");
        String maTim = sc.nextLine();
        if (dsMaSach.contains(maTim)) {
            System.out.println("-> Tim thay ma sach [" + maTim + "] trong danh sach!");
        } else {
            System.out.println("-> Khong tim thay ma sach [" + maTim + "]!");
        }

        // 4. Xoa ma sach (remove)
        System.out.print("Nhap ma sach can xoa: ");
        String maXoa = sc.nextLine();
        if (dsMaSach.remove(maXoa)) {
            System.out.println("-> Da xoa ma [" + maXoa + "]. Danh sach con lai: " + dsMaSach);
        } else {
            System.out.println("-> Khong tim thay ma [" + maXoa + "] de xoa!");
        }
    }

    // =====================================================================
    // BAI 3 & BAI 4 (TUAN 6): Menu hoan chinh 1 -> 8 ket hop ArrayList
    // =====================================================================
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Bai 3: ArrayList<String> danhSachSach luu chuoi thong tin cuon sach
        ArrayList<String> danhSachSach = new ArrayList<>();
        // Danh sach doi tuong Sach song song de tinh tong so luong & gia tri (Bai 4)
        ArrayList<Sach> dsDoiTuongSach = new ArrayList<>();

        int luaChon;
        do {
            System.out.println("\n================ MENU QUAN LY SACH (TUAN 6) ================");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tim sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua sach");
            System.out.println("6. Tinh tong so luong");
            System.out.println("7. Tinh tong gia tri");
            System.out.println("8. Thoat");
            System.out.println("------------------------------------------------------------");
            System.out.println("9. [Chay rieng Bai 1: Mang int[] soLuong 5 cuon sach]");
            System.out.println("10.[Chay rieng Bai 2: ArrayList<String> luu ma sach]");
            System.out.println("============================================================");
            System.out.print("Moi ban chon chuc nang (1 - 10): ");
            luaChon = Integer.parseInt(sc.nextLine());

            switch (luaChon) {
                case 1:
                    // 1. Them sach: su dung phuong thuc add()
                    System.out.println("\n--- 1. THEM SACH MOI ---");
                    Sach sMoi = new Sach();
                    sMoi.nhapThongTin(sc);
                    dsDoiTuongSach.add(sMoi);
                    danhSachSach.add(sMoi.toChuoiThongTin());
                    System.out.println("-> Da them sach vao ArrayList thanh cong!");
                    break;

                case 2:
                    // 2. Hien thi sach: su dung size() va get()
                    System.out.println("\n--- 2. DANH SACH SACH TRONG THU VIEN ---");
                    if (danhSachSach.isEmpty()) {
                        System.out.println("-> Danh sach dang trong!");
                    } else {
                        for (int i = 0; i < danhSachSach.size(); i++) {
                            System.out.println((i + 1) + ". " + danhSachSach.get(i));
                        }
                    }
                    break;

                case 3:
                    // 3. Tim sach theo ma hoac tu khoa
                    System.out.print("\nNhap ma sach (hoac ten sach) can tim: ");
                    String tuKhoa = sc.nextLine();
                    boolean timThay = false;
                    for (int i = 0; i < danhSachSach.size(); i++) {
                        if (dsDoiTuongSach.get(i).getMaSach().equalsIgnoreCase(tuKhoa)
                                || danhSachSach.get(i).toLowerCase().contains(tuKhoa.toLowerCase())) {
                            System.out.println("-> Tim thay tai vi tri " + i + ": " + danhSachSach.get(i));
                            timThay = true;
                        }
                    }
                    if (!timThay) {
                        System.out.println("-> Khong tim thay sach nao khớp voi: " + tuKhoa);
                    }
                    break;

                case 4:
                    // 4. Xoa sach: su dung phuong thuc remove()
                    System.out.print("\nNhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();
                    int viTriXoa = -1;
                    for (int i = 0; i < dsDoiTuongSach.size(); i++) {
                        if (dsDoiTuongSach.get(i).getMaSach().equalsIgnoreCase(maXoa)) {
                            viTriXoa = i;
                            break;
                        }
                    }
                    if (viTriXoa != -1) {
                        dsDoiTuongSach.remove(viTriXoa);
                        danhSachSach.remove(viTriXoa);
                        System.out.println("-> Da xoa sach co ma [" + maXoa + "] thanh cong!");
                    } else {
                        System.out.println("-> Khong tim thay ma sach [" + maXoa + "] de xoa!");
                    }
                    break;

                case 5:
                    // 5. Sua sach: su dung phuong thuc set()
                    System.out.print("\nNhap ma sach can sua: ");
                    String maSua = sc.nextLine();
                    int viTriSua = -1;
                    for (int i = 0; i < dsDoiTuongSach.size(); i++) {
                        if (dsDoiTuongSach.get(i).getMaSach().equalsIgnoreCase(maSua)) {
                            viTriSua = i;
                            break;
                        }
                    }
                    if (viTriSua != -1) {
                        System.out.println("--- Nhap thong tin moi cho sach tai vi tri " + viTriSua + " ---");
                        Sach sCapNhat = new Sach();
                        sCapNhat.nhapThongTin(sc);
                        // Su dung set(index, element) cua ArrayList
                        dsDoiTuongSach.set(viTriSua, sCapNhat);
                        danhSachSach.set(viTriSua, sCapNhat.toChuoiThongTin());
                        System.out.println("-> Da cap nhat thong tin sach bang set() thanh cong!");
                    } else {
                        System.out.println("-> Khong tim thay ma sach [" + maSua + "] de sua!");
                    }
                    break;

                case 6:
                    // 6. Tinh tong so luong
                    int tongSoLuong = 0;
                    for (int i = 0; i < dsDoiTuongSach.size(); i++) {
                        tongSoLuong += dsDoiTuongSach.get(i).getSoLuong();
                    }
                    System.out.println("\n-> [6] Tong so luong tat ca sach trong thu vien: " + tongSoLuong + " cuon");
                    break;

                case 7:
                    // 7. Tinh tong gia tri
                    double tongGiaTri = 0;
                    for (int i = 0; i < dsDoiTuongSach.size(); i++) {
                        tongGiaTri += dsDoiTuongSach.get(i).tinhThanhTien();
                    }
                    System.out.printf("\n-> [7] Tong gia tri tat ca sach trong thu vien: %.0f VND\n", tongGiaTri);
                    break;

                case 8:
                    // 8. Thoat
                    System.out.println("-> Da thoat chuong trinh. Tam biet!");
                    break;

                case 9:
                    thucHanhBai1(sc);
                    break;

                case 10:
                    thucHanhBai2(sc);
                    break;

                default:
                    System.out.println("-> Lua chon khong hop le! Vui long chon tu 1 den 8.");
                    break;
            }
        } while (luaChon != 8);
    }
}