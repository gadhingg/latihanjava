/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class LatIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String keterangan,nama;
        int nilai;
        
        System.out.print("Masukan Nama Siswa :");
        nama = input .nextLine();
        System.out.print("Masukan Nilai Akhir :");
        nilai = input.nextInt();
             if(nilai > 70) {
                 //perintah jika kondisi true
                 keterangan="Lulus";
            }else{
                 //perintah jika false  
                 keterangan="gagal";
             }
        System.out.println("Hasil akhir");     
        System.out.println("==========================================");     
        System.out.println("Nama Siswa               :"+nama);     
        System.out.println("Nilai akhir yang didapat :"+nilai);     
        System.out.println("keterangan               :"+keterangan);     
        System.out.println("==========================================");     
    }
    
}
