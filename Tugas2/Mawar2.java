/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbo2;

/**
 *
 * @author Ailsa
 */
public class Mawar2 extends Tumbuhan2{
    
    public Mawar2() {
        this.habitat = "Taman";
        this.hidup = true;
        this.tinggi = 110;
        this.ukuranSel = 0.04;
    }

    public Mawar2(String habitat) {
        this.habitat = habitat;
        this.hidup = true;
        this.tinggi = 100;
        this.ukuranSel = 0.04;
    }

    public Mawar2(boolean hidup) {
        this.hidup = hidup;
        this.habitat = "Taman";
        this.tinggi = 110;
        this.ukuranSel = 0.04;
    }

    public Mawar2(int tinggi) {
        this.tinggi = tinggi;
        this.habitat = "Taman";
        this.hidup = true;
        this.ukuranSel = 0.04;
    }

    public Mawar2(double ukuranSel) {
        this.ukuranSel = ukuranSel;
        this.habitat = "Taman";
        this.hidup = true;
        this.tinggi = 110;
    }
}
