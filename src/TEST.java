/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author LVC
 */
public class TEST {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Sach> danhSach = new ArrayList<>();

    static DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("dd/MM/yyyy");

    // Nhap ngay
    public static LocalDate nhapNgay() {
        System.out.print("Nhap ngay (dd/MM/yyyy): ");
        return LocalDate.parse(sc.nextLine(), formatter);
    }

    // Nhap sach giao khoa
    public static void nhapSachGiaoKhoa() {
        System.out.print("Nhap ma sach: ");
        String ma = sc.nextLine();

        LocalDate ngay = nhapNgay();

        System.out.print("Nhap don gia: ");
        double gia = Double.parseDouble(sc.nextLine());

        System.out.print("Nhap so luong: ");
        int sl = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap nha xuat ban: ");
        String nxb = sc.nextLine();

        System.out.print("Nhap tinh trang (moi/cu): ");
        String tinhTrang = sc.nextLine();

        SachGiaoKhoa sgk = new SachGiaoKhoa(
                ma, ngay, gia, sl, nxb, tinhTrang
        );

        danhSach.add(sgk);
        System.out.println("Them sach giao khoa thanh cong!");
    }

    // Nhap sach tham khao
    public static void nhapSachThamKhao() {
        System.out.print("Nhap ma sach: ");
        String ma = sc.nextLine();

        LocalDate ngay = nhapNgay();

        System.out.print("Nhap don gia: ");
        double gia = Double.parseDouble(sc.nextLine());

        System.out.print("Nhap so luong: ");
        int sl = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap nha xuat ban: ");
        String nxb = sc.nextLine();

        System.out.print("Nhap thue: ");
        double thue = Double.parseDouble(sc.nextLine());

        SachThamKhao stk = new SachThamKhao(
                ma, ngay, gia, sl, nxb, thue
        );

        danhSach.add(stk);
        System.out.println("Them sach tham khao thanh cong!");
    }

    // Xuat danh sach
    public static void xuatDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach rong!");
            return;
        }

        for (Sach s : danhSach) {
            s.hienThi();
            System.out.println("-------------------------");
        }
    }

    // Tong thanh tien sach giao khoa
    public static void tongSachGiaoKhoa() {
        double tong = 0;

        for (Sach s : danhSach) {
            if (s instanceof SachGiaoKhoa) {
                tong += s.thanhTien();
            }
        }

        System.out.println("Tong thanh tien sach giao khoa: " + tong);
    }

    // Tong thanh tien sach tham khao
    public static void tongSachThamKhao() {
        double tong = 0;

        for (Sach s : danhSach) {
            if (s instanceof SachThamKhao) {
                tong += s.thanhTien();
            }
        }

        System.out.println("Tong thanh tien sach tham khao: " + tong);
    }

    // Trung binh don gia sach tham khao
    public static void trungBinhDonGia() {
        double tong = 0;
        int dem = 0;

        for (Sach s : danhSach) {
            if (s instanceof SachThamKhao) {
                tong += s.getDonGia();
                dem++;
            }
        }

        if (dem == 0) {
            System.out.println("Chua co sach tham khao!");
        } else {
            System.out.println(
                "Trung binh don gia sach tham khao: " + tong / dem
            );
        }
    }

    // Xuat sach giao khoa cua nha xuat ban X
    public static void timSachNXBX() {
        boolean timThay = false;

        for (Sach s : danhSach) {
            if (s instanceof SachGiaoKhoa &&
                s.getNhaXuatBan().equalsIgnoreCase("X")) {

                s.hienThi();
                timThay = true;
            }
        }

        if (!timThay) {
            System.out.println("Khong co sach giao khoa cua NXB X!");
        }
    }

    // Menu chinh
    public static void main(String[] args) {

        int chon;

        do {
            System.out.println("\n===== QUAN LY SACH THU VIEN =====");
            System.out.println("1. Nhap sach giao khoa");
            System.out.println("2. Nhap sach tham khao");
            System.out.println("3. Xuat danh sach sach");
            System.out.println("4. Tong thanh tien sach giao khoa");
            System.out.println("5. Tong thanh tien sach tham khao");
            System.out.println("6. Trung binh don gia sach tham khao");
            System.out.println("7. Xuat sach giao khoa cua NXB X");
            System.out.println("8. Thoat");
            System.out.print("Moi ban chon: ");

            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    nhapSachGiaoKhoa();
                    break;

                case 2:
                    nhapSachThamKhao();
                    break;

                case 3:
                    xuatDanhSach();
                    break;

                case 4:
                    tongSachGiaoKhoa();
                    break;

                case 5:
                    tongSachThamKhao();
                    break;

                case 6:
                    trungBinhDonGia();
                    break;

                case 7:
                    timSachNXBX();
                    break;

                case 8:
                    System.out.println("Ket thuc chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (chon != 8);

        sc.close();
    }
}
