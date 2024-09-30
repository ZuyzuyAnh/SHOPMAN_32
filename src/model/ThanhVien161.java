package model;

import java.util.Date;

public class ThanhVien161 {
    private int id;
    private String username;
    private String password;
    private Date ngaySinh;
    private String email;
    private String sdt;
    private Ten161 ten;

    public ThanhVien161(String username, String password, Date ngaySinh, String email, String sdt, Ten161 ten) {
        this.username = username;
        this.password = password;
        this.ngaySinh = ngaySinh;
        this.email = email;
        this.sdt = sdt;
        this.ten = ten;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Ten161 getTen() {
        return ten;
    }

    public void setTen(Ten161 ten) {
        this.ten = ten;
    }
}
