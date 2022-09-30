package com.example.listviewdactrung;

public class Truyen {
    private int hinh;
    private String ten;
    private String chuong;

    public Truyen(int hinh, String ten, String chuong) {
        this.hinh = hinh;
        this.ten = ten;
        this.chuong = chuong;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getChuong() {
        return chuong;
    }

    public void setChuong(String chuong) {
        this.chuong = chuong;
    }
}
