/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author USER
 */
public class InisialisasiArray1 {
    public static void main(String[] args)
    {
    int i;
    double[] nil_akhir = {56.5, 66.7, 87.6, 98.5, 78.9, 85.4};
    
    System.out.print("\nData yang diinput ke elemen array ");
    //menampilkan data dari  elemen array 
    for (i=0; i<6; i++)
    {
        System.out.print("Nilai akhir index " +i);
        System.out.println(" = " + nil_akhir[i]);
    }
    }
}
