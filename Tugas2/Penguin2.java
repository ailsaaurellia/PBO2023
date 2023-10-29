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
public class Penguin2 extends Hewan2 {
    
    public Penguin2() {
        this.habitat = "Tempat Dingin";
        this.hidup = true;
        this.tinggi = 81;
        this.beratBadan = 45.0;
    }

    public Penguin2(String habitat) {
        this.habitat = habitat;
        this.hidup = true;
        this.tinggi = 150;
        this.beratBadan = 45.0;
    }

    public Penguin2(boolean hidup) {
        this.hidup = hidup;
        this.habitat = "Tempat Dingin";
        this.tinggi = 81;
        this.beratBadan = 45.0;
    }

    public Penguin2(int tinggi) {
        this.tinggi = tinggi;
        this.habitat = "Tempat Dingin";
        this.hidup = true;
        this.beratBadan = 45.0;
    }

    public Penguin2(double berat) {
        this.beratBadan = berat;
        this.habitat = "Tempat Dingin";
        this.hidup = true;
        this.tinggi = 81;
    }
    
}
