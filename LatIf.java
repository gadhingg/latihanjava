/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

import java.util.*;

/**
 *
 * @author Dingga
 */
public class LatIf 
{
public static void main(String[] args)
{
    double tot_beli, potongan=0, jum_bayar=0;
    Scanner input = new Scanner(System.in);
    
    System.out.print("Total pembelian Rp. ");
    tot_beli = input.nextDouble();
        if(tot_beli >= 50000)
            potongan = 0.2 * tot_beli;
    System.out.println("Besarnya potongan Rp. ");
    jum_bayar = tot_beli - potongan;
    System.out.println("Jumlah yang harus dibayarkan Rp. " + jum_bayar);
    
    
}
}
