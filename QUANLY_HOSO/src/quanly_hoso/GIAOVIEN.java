/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanly_hoso;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Long
 */
public class GIAOVIEN extends HOSO {

    private String maGV;
    private Date ngayVao;
    private double diemThiDua;
    private double HSL;
    private final double LUONGCB = 1150000;

    public GIAOVIEN() {
    }

    public GIAOVIEN(String maGV, Date ngayVao, double diemThiDua, double HSL) {
        this.maGV = maGV;
        this.ngayVao = ngayVao;
        this.diemThiDua = diemThiDua;
        this.HSL = HSL;
    }

    public GIAOVIEN(String maGV, Date ngayVao, double diemThiDua, double HSL, String maHoSo, String hoTen, long soCMND, Date ngaySinh) {
        super(maHoSo, hoTen, soCMND, ngaySinh);
        this.maGV = maGV;
        this.ngayVao = ngayVao;
        this.diemThiDua = diemThiDua;
        this.HSL = HSL;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public Date getNgayVao() {
        return ngayVao;
    }

    public void setNgayVao(Date ngayVao) {
        this.ngayVao = ngayVao;
    }

    public double getDiemThiDua() {
        return diemThiDua;
    }

    public void setDiemThiDua(double diemThiDua) {
        this.diemThiDua = diemThiDua;
    }

    public double getHSL() {
        return HSL;
    }

    public void setHSL(double HSL) {
        this.HSL = HSL;
    }

    @Override
    public String DanhGiaXepLoai() {
        if (diemThiDua >= 85.5) {
            return "A";
        } else if (diemThiDua >= 70) {
            return "B";
        } else if (diemThiDua >= 60) {
            return "C";
        } else {
            return "D";
        }
    }

    public int ThamNien() {
        Calendar c1 = new GregorianCalendar();
        Calendar c2 = new GregorianCalendar();
        c1.setTime(ngayVao);
        Date ngayHT = Calendar.getInstance().getTime();
        c2.setTime(ngayHT);
        int thamNien = c2.get(Calendar.YEAR) - c1.get(Calendar.YEAR);
        return thamNien;
    }

    public double PhuCap() {
        if (ThamNien() >= 10) {
            if (DanhGiaXepLoai().equals("A")) {
                return 2000000;
            } else if (DanhGiaXepLoai().equals("B")) {
                return 1500000;
            } else if (DanhGiaXepLoai().equals("C")) {
                return 1000000;
            } else {
                return 500000;
            }
        } else {
            if (DanhGiaXepLoai().equals("A")) {
                return 1000000;
            } else if (DanhGiaXepLoai().equals("B")) {
                return 500000;
            } else {
                return 0;
            }
        }
    }

    public double Luong() {
       return HSL*LUONGCB+PhuCap();
    }
}
