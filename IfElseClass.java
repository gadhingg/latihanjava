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
public class IfElseClass {
    public String nama,ket;
    public int nilAkhir;
    Scanner input = new Scanner(System.in);
    
    public void SetInputData(){
        System.out.print("Masukan Nama Siswa :");
        nama = input.nextLine ();
        System.out.print("Masukan Nilai Akhir :");
        nilAkhir = input.nextInt();
    }
        
            public String getKeterangan(){
                if(nilAkhir > 70) {
                    //perintah jika kodisi true 
                    ket="lulus";
                }else{
                    //perintah jika kondisi false
                    ket="gagal";
                }
                return ket;
            }
    
    
   }
