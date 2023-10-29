/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package induk2;

import tugaspbo2.Mawar2;
import tugaspbo2.Hewan2;
import tugaspbo2.Penguin2;
/**
 *
 * @author Ailsa
 */
public class Induk2 {
    
    public static void main(String[] args) {
        Penguin2 wiuw = new Penguin2(100);
        wiuw.setNama("Penguin");
        wiuw.setSpecies("Aves");
        Hewan2 sapi = new Hewan2(50.0);
        sapi.setNama("Sapi");
        sapi.setSpecies("Mamalia");
        sapi.setUmur(25);
        Mawar2 yey = new Mawar2("Taman");
        yey.setNama("Bunga Mawar");
        yey.setSpecies(" Rosaceae");
        yey.setJenisDaun("Berselang dan Besirip");
        

        System.out.println("Nama saya " + wiuw.getNama() + ", species saya " + wiuw.getSpecies() + ", habitat saya " + wiuw.getHabitat() + ", tinggi saya " + wiuw.getTinggi() + " cm" + ", Berat saya " + wiuw.getBeratBadan() + " kg");
        System.out.println("Nama saya " + sapi.getNama() + ", species saya " + sapi.getSpecies() + ", habitat saya " + sapi.getHabitat() + ", tinggi saya " + sapi.getTinggi() + " cm" + ", Berat saya " + sapi.getBeratBadan() + " kg" + ", Jumlah kaki saya " + sapi.getUmur());
        System.out.println("Nama saya " + yey.getNama() + ", species saya " + yey.getSpecies() + ", habitat saya " + yey.getHabitat() + ", tinggi saya " + yey.getTinggi() + " cm" + ", Ukuran sel saya " + yey.getUkuranSel() + ", bau bunga " + yey.getJenisDaun());
    }
}


