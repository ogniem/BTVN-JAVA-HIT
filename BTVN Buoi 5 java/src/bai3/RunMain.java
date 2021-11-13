package bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LOPHOC lopHoc = new LOPHOC();
        System.out.println("Nhập mã lớp học: ");
        lopHoc.setMaLH(sc.nextLine());
        System.out.println("Nhập tên lớp học:  ");
        lopHoc.setTenLH(sc.nextLine());
        System.out.println("Nhập ngày mở: ");
        lopHoc.setNgayMo(sc.nextLine());
        System.out.println("Nhập số sinh viên: ");
        lopHoc.setn(sc.nextInt());
        System.out.println("Nhập giáo viên:  ");
        lopHoc.setGiaoVien(sc.nextLine());

        List<SINHVIEN> SinhViens = new ArrayList<>();
        for (int i = 0; i < lopHoc.getn(); i++) {
            SINHVIEN sv = new SINHVIEN();
            sv.Nhap();
            SinhViens.add(sv);
        }
        lopHoc.setSinhViens(SinhViens);
        int dem = 0;
        for (int i = 0; i < lopHoc.getn(); i++) {
            if (lopHoc.getSinhViens().get(i).getKhoaHoc() == 15) {
                dem++;
            }
        }
        System.out.println("Có " + dem + " sinh viên khoa 15");

        System.out.println("Danh sách lớp theo chiều tăng dần của khóa học: ");
        for (int i = 0; i < lopHoc.getn() - 1; i++) {
            for (int j = i + 1; j < lopHoc.getn(); j++) {
                if (lopHoc.getSinhViens().get(i).getKhoaHoc() > lopHoc.getSinhViens().get(j).getKhoaHoc()) {
                    SINHVIEN temp = lopHoc.getSinhViens().get(i);
                    lopHoc.getSinhViens().set(i, lopHoc.getSinhViens().get(j));
                    lopHoc.getSinhViens().set(j, temp);
                }
            }
        }
        System.out.println("Mã lớp học: "+ lopHoc.getMaLH()+" Tên lớp học: "+lopHoc.getTenLH() + " Ngày: "+ lopHoc.getNgayMo() +" Giáo viên: "+ lopHoc.getGiaoVien());

        for (int i = 0; i < lopHoc.getn(); i++) {
            lopHoc.getSinhViens().get(i).Xuat();
            System.out.println(" ");
        }

    }
}
