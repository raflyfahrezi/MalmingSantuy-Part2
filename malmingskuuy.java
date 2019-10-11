/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raflyfahrezi;

/**
 *
 * @author Farhan R
 */
import java.util.Scanner;

public class malmingskuuy {
    String namadepan, namabelakang, id, alamat, tahun, telepon;
    
    void setnamadepan(String input_nama){
        namadepan = input_nama;
    }
    
    String getnamadepan(){
        return namadepan;
    }
    
    void setnamabelakang(String input_nama){
        namabelakang = input_nama;
    }
    
    String getnamabelakang(){
        return namabelakang;
    }
    
    void setid(String input_id){
        id = input_id;
    }
    
    String getid(){
        return id;
    }
    
    void settelepon(String input_telepon){
        telepon = input_telepon;
    }
    
    String gettelepon(){
        return telepon;
    }
    
    void settahun(String input_tahun){
        tahun = input_tahun;
    }
    
    String gettahun(){
        return tahun;
    }
    
    void setalamat(String input_alamat){
        alamat = input_alamat;
    }
    
    String getalamat(){
        return alamat;
    }
    
    public static void main(String[] args) {
        malmingskuuy prosedur = new malmingskuuy();
        
        prosedur.setnamadepan("Farhan Rafly");
        prosedur.setnamabelakang("Fahrezi");
        prosedur.setid("10118377");
        prosedur.setalamat("Bandung");
        prosedur.settelepon("081324894552");
        prosedur.settahun("2019");
        
        System.out.println("Nama Depan    : " + prosedur.getnamadepan());
        System.out.println("Nama Belakang : " + prosedur.getnamabelakang());
        System.out.println("ID Anggota    : " + prosedur.getid());
        System.out.println("Alamat        : " + prosedur.getalamat());
        System.out.println("No Telepon    : " + prosedur.gettelepon());
        System.out.println("Tahun         : " + prosedur.gettahun());
    }
    
    
}
