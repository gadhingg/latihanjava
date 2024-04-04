/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author Dingga
 */
public class IfElseAksi {
    public static void main(String[] args) {
        
        //pembuatan objek baru dari class IfElseClass.java
        IfElseClass ifclass=new IfElseClass();
        
        ifclass.SetInputData();
        ifclass.getKeterangan();
           System.out.println("Hasil akhir");
           System.out.println("=======================================");
           System.out.println("Nama siswa               :"+ifclass.nama);
           System.out.println("Nilai akhir yang didapat :"+ifclass.nilAkhir);
           System.out.println("Keterangan               :"+ifclass.getKeterangan());
           System.out.println("========================================");
    }
}
