/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
package pewarisan ;
    
/**
 *
 * @author gadhing
 */
class Sepeda{
int kecepatan = 0;
int gir = 0;
//mehod
void ubahGir(int pertambahanGir) {
gir= gir+ pertambahanGir ;
System.out.println("gir:" + gir);
}
void tambahkecepatan(int pertambahankecepatan){
kecepatan = kecepatan+ pertambahankecepatan;
System.out.println("kecepatan:" + kecepatan );      
}
}

