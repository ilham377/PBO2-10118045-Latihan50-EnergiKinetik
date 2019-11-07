/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan50energikinetik;

/**
 *
 * @author
 *  Nama              : Muhammad Ilham Apriyadi
 *  Kelas             : IF2
 *  NIM               : 10118045
 *  Deskripsi Program : hitung energi kinetik dan usaha bola baseball
 */
public class PBO10118045Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Energi energi = new Energi(145, 25);
        System.out.println("Massa bola = "+energi.getMassa()+" Kg");
        System.out.println("Kecepatan bola = "+energi.getKec()+" m/s");
        System.out.println("Energi Kinetik = "+energi.EnergiKinetik(energi.getMassa(), energi.getKec()));
        System.out.println("Usaha = "+energi.usaha(energi.getMassa(), energi.getKec(), 0));
    }
    
}
