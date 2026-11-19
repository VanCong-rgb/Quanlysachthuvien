/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LVC
 */
public class TEST {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Sach> danhSachSach = new ArrayList<>();

        int chon;

        do {
            System.out.println("\n===== QUAN LY SACH THU VIEN =====");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi danh sach sach");
            System.out.println("3. Tim sach theo ma");
            System.out.println("4. Xoa sach");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");

            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {

                case 1:
                    // Nhap thong tin sach
                    System.out.print("Nhap ma sach: ");
                    String ma = sc.nextLine();

                    System.out.print("Nhap tieu de: ");
                    String ten = sc.nextLine();

                    System.out.print("Nhap tac gia: ");
                    String tacGia = sc.nextLine();

                    System.out.print("Nhap nam xuat ban: ");
                    int nam = Integer.parseInt(sc.nextLine());

                    System.out.print("Nhap so luong: ");
                    int soLuong = Integer.parseInt(sc.nextLine());

                    // Tao doi tuong Sach
                    Sach sach = new Sach(ma, ten, tacGia, nam, soLuong);

                    // Them vao ArrayList
                    danhSachSach.add(sach);

                    System.out.println("Them sach thanh cong!");
                    break;

                case 2:
                    // Hien thi danh sach
                    if (danhSachSach.isEmpty()) {
                        System.out.println("Danh sach sach trong!");
                    } else {
                        System.out.println("\n===== DANH SACH SACH =====");

                        for (Sach s : danhSachSach) {
                            s.hienThiThongTin();
                            System.out.println("----------------------");
                        }
                    }
                    break;

                case 3:
                    // Tim sach theo ma
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();

                    boolean timThay = false;

                    for (Sach s : danhSachSach) {
                        if (s.getMaSach().equalsIgnoreCase(maTim)) {
                            s.hienThiThongTin();
                            timThay = true;
                            break;
                        }
                    }

                    if (!timThay) {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;

                case 4:
                    // Xoa sach theo ma
                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();

                    boolean daXoa = false;

                    for (int i = 0; i < danhSachSach.size(); i++) {
                        if (danhSachSach.get(i).getMaSach()
                                .equalsIgnoreCase(maXoa)) {

                            danhSachSach.remove(i);
                            daXoa = true;
                            System.out.println("Xoa sach thanh cong!");
                            break;
                        }
                    }

                    if (!daXoa) {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;

                case 0:
                    System.out.println("Ket thuc chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (chon != 0);

        sc.close();
    }
}

