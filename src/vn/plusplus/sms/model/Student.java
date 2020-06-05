package vn.plusplus.sms.model;

public class Student {
    private String fullName;
    private int idName;
    private String lopHoc;
    private String ngaySinh;
    private String diaChi;
    private String hanhKiem;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getIdName() {
        return idName;
    }

    public void setIdName(int idName) {
        this.idName = idName;
    }

    public String getLopHoc() {
        return lopHoc;
    }

    public void setLopHoc(String lopHoc) {
        this.lopHoc = lopHoc;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getHanhKiem() {
        return hanhKiem;
    }

    public void setHanhKiem(String hanhKiem) {
        this.hanhKiem = hanhKiem;
    }

    public Student(String fullName, int idName, String lopHoc, String ngaySinh, String diaChi, String hanhKiem) {
        this.fullName = fullName;
        this.idName = idName;
        this.lopHoc = lopHoc;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.hanhKiem = hanhKiem;
    }
}
