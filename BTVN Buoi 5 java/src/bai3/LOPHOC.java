package bai3;
import bai2.SANPHAM;

import java.util.ArrayList;
import java.util.List;


public class LOPHOC {
    private String MaLH;
    private String TenLH;
    private String NgayMo;
    private int n;
    private String GiaoVien;
    List <SINHVIEN> SinhViens = new ArrayList<>();
    public LOPHOC(){};
    public String getMaLH(){
        return MaLH;
    }
    public String getTenLH(){

        return TenLH;
    }
    public String getGiaoVien() {
        return GiaoVien;
    }
    public String getNgayMo() {
        return NgayMo;
    }
    public List<SINHVIEN> getSinhViens() {
        return SinhViens; }
    public int getn() {
        return n;
    }

    public void setMaLH(String MaLH) {

        this.MaLH = MaLH;
    }
    public void setTenLH(String TenLH) {

        this.TenLH = TenLH;
    }
    public void setNgayMo(String NgayMo) {

        this.NgayMo = NgayMo;
    }
    public void setGiaoVien(String GiaoVien) {

        this.GiaoVien = GiaoVien;
    }
    public void setn(int n) {

        this.n = n;
    }
    public void setSinhViens(List<SINHVIEN> SinhViens) {

        this.SinhViens = SinhViens;
    }

}
