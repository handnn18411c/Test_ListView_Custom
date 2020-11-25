package com.example.test_listview_custom;

//Tạo dữ liệu
public class SanPham {
    private String tenSP;
    private double giaTien;
    private int anh; //Ảnh được đại diện bởi 1 con số

    //Tạo constructor
    public SanPham(String tenSP, double giaTien, int anh) {
        this.tenSP = tenSP;
        this.giaTien = giaTien;
        this.anh = anh;
    }

    //Tạo get set
    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    public int getAnh() {
        return anh;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }
}
