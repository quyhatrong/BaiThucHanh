package shapes;

public class HinhTru extends HinhTron {
    private double chieuCao;
    
    public HinhTru(double banKinh, double chieuCao) {
        super(banKinh);
        this.chieuCao = chieuCao;
    }
    
    public double getChieuCao() {
        return chieuCao;
    }
    
    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }
    
    public double tinhDienTich() {
        return 2 * super.tinhDienTich() + super.tinhChuVi() * chieuCao;
    }
    
    public double tinhTheTich() {
        return super.tinhDienTich() * chieuCao;
    }
}