package shapes;

public class HinhTron extends HinhHoc {
    private double banKinh;
    
    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }
    
    public double getBanKinh() {
        return banKinh;
    }
    
    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }
    
    public double tinhDienTich() {
        return Math.PI * Math.pow(banKinh, 2);
    }
    
    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }
}