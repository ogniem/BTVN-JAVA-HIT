package bai1;

import java.util.Scanner;

public class DieuHoa extends SanPham {
    public double CongSuat, GiaBan;
    Scanner sc= new Scanner(System.in);

    @Override
    public void NHAP(){
        super.NHAP();
        System.out.println("Nhập công suất: ");
        CongSuat= sc.nextDouble();
        System.out.println("Nhập giá bán: ");
        GiaBan= sc.nextDouble();
    }
    @Override
    public void XUAT(){
        super.XUAT();
        System.out.println("Công suất: "+ CongSuat+" Giá bán: "+GiaBan);
    }
    public double getGiaBan(){
        return GiaBan;
    }

    public DieuHoa(){
    }
    public DieuHoa( double CongSuat, double GiaBan){
        this.CongSuat= CongSuat;
        this.GiaBan=GiaBan;

    }
    public double getCongSuat(){
        return CongSuat;
    }

    public double getGiaban(){
        return GiaBan;
    }
}
