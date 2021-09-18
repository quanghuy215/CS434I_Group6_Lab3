/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanly_hoso;

import java.util.ArrayList;

/**
 *
 * @author Long
 */
public class DSHS {

    private ArrayList<HOSO> ds;

    public DSHS() {
        ds = new ArrayList<>();
    }

    public DSHS(ArrayList<HOSO> ds) {
        this.ds = ds;
    }

    public ArrayList<HOSO> getDs() {
        return ds;
    }

    public void setDs(ArrayList<HOSO> ds) {
        this.ds = ds;
    }

    public void Them(HOSO hs) {
        ds.add(hs);
    }
    
    // code by Lưu Vĩnh Toàn
    public void Xoa(String maHS) {
        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).maHoSo.equalsIgnoreCase(maHS)) {
                ds.remove(i);
                break;
            }
        }
    }
    // ------------------------
   
   // code by nguyễn đại long 
    public HOSO Tim(String maHS) {
        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).maHoSo.trim().equalsIgnoreCase(maHS.trim())) {
                return ds.get(i);
            }
        }
        return null;
    }
    //-----------------------------------------------
   
     public int ThongKeGV(){
        int demgv=0;
        for(HOSO hs : ds){
            if(hs instanceof GIAOVIEN){
                demgv++;
            }
        }
        return demgv;
    }
     public String NgheNghiep(){
       for( HOSO hs : ds){
        if(hs instanceof HOCSINH){
            return "Há»�c sinh";
        }
        else{
            return "GiÃ¡o viÃªn";
        }
    } return null;
    }
}
