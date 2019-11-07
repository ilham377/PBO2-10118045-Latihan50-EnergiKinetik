/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan50energikinetik;

/**
 *
 * @author Ilham
 */
public class Energi {
    private double massa,kec;

    public Energi(double massa, double kec) {
        this.massa = massa/1000;
        this.kec = kec;
    }

    public double getMassa() {
        return massa;
    }

    public double getKec() {
        return kec;
    }
    
    public double EnergiKinetik(double m , double v){
        return 0.5*m*Math.pow(v, 2);
    }
    
    public double usaha(double m, double v1, double v2){
        return m*(Math.pow(v1, 2)-Math.pow(v2, 2))/2;
    }
    
}
