/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanly_hoso;

import java.util.Date;

/**
 *
 * @author Long
 */
public abstract class HOSO implements XEPLOAI{
    protected String maHoSo;
    protected String hoTen;
    protected long soCMND;
    protected Date ngaySinh;

    public HOSO() {
    }

    public HOSO(String maHoSo, String hoTen, long soCMND, Date ngaySinh) {
        this.maHoSo = maHoSo;
        this.hoTen = hoTen;
        this.soCMND = soCMND;
        this.ngaySinh = ngaySinh;
    }

    public String getMaHoSo() {
        return maHoSo;
    }

    public void setMaHoSo(String maHoSo) {
        this.maHoSo = maHoSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public long getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(long soCMND) {
        this.soCMND = soCMND;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
    
}
