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
public class HOCSINH extends HOSO{
    private String maHS;
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    public HOCSINH() {
    }

    public HOCSINH(String maHS, double diemToan, double diemLy, double diemHoa) {
        this.maHS = maHS;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public HOCSINH(String maHS, double diemToan, double diemLy, double diemHoa, String maHoSo, String hoTen, long soCMND, Date ngaySinh) {
        super(maHoSo, hoTen, soCMND, ngaySinh);
        this.maHS = maHS;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public String getMaHS() {
        return maHS;
    }

    public void setMaHS(String maHS) {
        this.maHS = maHS;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }
    public double DTB(){
        return ((diemToan*2+diemLy+diemHoa) / 4) ;
    }
            
    @Override
    public String DanhGiaXepLoai() {
       if(DTB()>=9){
           return "Xuất sắc";
       }else if(DTB()>=8) {
           return "Giỏi";
       }
       else if(DTB()>=7){
           return "Khá";
       }else return "Trung bình";
    }
    public double TinhHocBong(){
        if(DanhGiaXepLoai().equals("Xuất sắc")){
            return 1800000;
        }else if(DanhGiaXepLoai().equals("Giỏi")){
            return 1200000;
        }else return 0;
    }
    
}
