package model;

import java.util.Date;

public class KhachHang161 extends ThanhVien161{
    private DiaChi161 diaChiNhanHang;

    public KhachHang161(String username, String password, Date ngaySinh, String email, String sdt, Ten161 ten, DiaChi161 diaChiNhanHang) {
        super(username, password, ngaySinh, email, sdt, ten);
        this.diaChiNhanHang = diaChiNhanHang;
    }

    public DiaChi161 getDiaChiNhanHang() {
        return diaChiNhanHang;
    }

    public void setDiaChiNhanHang(DiaChi161 diaChiNhanHang) {
        this.diaChiNhanHang = diaChiNhanHang;
    }
}
