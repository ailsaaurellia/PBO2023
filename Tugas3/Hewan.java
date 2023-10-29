/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hewan;

/**
 *
 * @author Ailsa
 */
public class Hewan {

    public Hewan() {
        this.habitat = "Di Darat";
    }
    
    /**
     * @return the jenisMakanan
     */
    public String getJenisMakanan() {
        return jenisMakanan;
    }

    /**
     * @param jenisMakanan the jenisMakanan to set
     */
    public void setJenisMakanan(String jenisMakanan) {
        this.jenisMakanan = jenisMakanan;
    }

    /**
     * @return the jenisSpecies
     */
    public String getJenisSpecies() {
        return jenisSpecies;
    }

    /**
     * @param jenisSpecies the jenisSpecies to set
     */
    public void setJenisSpecies(String jenisSpecies) {
        this.jenisSpecies = jenisSpecies;
    }

    /**
     * @return the bentukTubuh
     */
    public String getBentukTubuh() {
        return bentukTubuh;
    }

    /**
     * @param bentukTubuh the bentukTubuh to set
     */
    public void setBentukTubuh(String bentukTubuh) {
        this.bentukTubuh = bentukTubuh;
    }

    /**
     * @return the habitat
     */
    public String getHabitat() {
        return habitat;
    }

    /**
     * @param habitat the habitat to set
     */
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    private String jenisMakanan;
    private String jenisSpecies;
    private String bentukTubuh;
    private String habitat = "Di Darat";
   
    public String berat() {
        return "Cukup berat";
    }

    public String berat(String berat) {
        return "Cukup berat " + "beratnya sekitar " + berat;
    }

    public String berat(int berat) {
        return "Cukup berat " + "beratnya sekitar " + String.valueOf(berat);
    }

    public String berat(double berat) {
        return "Cukup berat " + "beratnya sekitar " + String.valueOf(berat);
    }
    
    }


    

