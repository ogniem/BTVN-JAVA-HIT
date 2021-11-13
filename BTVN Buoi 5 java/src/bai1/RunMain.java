package bai1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RunMain {
    public static void main(String []args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n: ");
        n=sc.nextInt();
        System.out.println("Nhập danh sách n điều hòa: ");
        List <DieuHoa> x = new ArrayList<>();
        int dem=0;
        for(int i=0; i<n; i++){
            DieuHoa  dieuhoa= new DieuHoa();
            dieuhoa.NHAP();
            x.add(dieuhoa);

        }
        System.out.println("Các sản phẩm có tên hãng sx là Electrolux: ");
        DieuHoa min = x.get(0);
        for(int i=0; i<n; i++){
            if(x.get(i).getTenHangSx().compareToIgnoreCase("Electrolux")==0){
                System.out.println("Điều hòa thứ "+(i+1));
                dem++;
            }
            if(x.get(i).getGiaBan()<min.getGiaBan()){
                min=x.get(i);
            }

        }
        if(dem==0){
            System.out.println("Không có điều hòa có hãng sx là Electrolux");
        }
        System.out.println("Thông tin sản phẩm có giá bán thấp nhất là:");
        min.XUAT();

    }
}
