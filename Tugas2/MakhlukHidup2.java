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
public class MakhlukHidup2 {

    public MakhlukHidup2() {
        this.habitat = "Dimana saja";
    }

    public MakhlukHidup2(String habitat) {
        this.habitat = habitat;
    }

    public MakhlukHidup2(boolean hidup) {
        this.hidup = hidup;
        this.hidup = true;
    }

    public MakhlukHidup2(int tinggi) {
        this.tinggi = tinggi;
        this.tinggi = 81;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the species
     */
    public String getSpecies() {
        return species;
    }

    /**
     * @param species the species to set
     */
    public void setSpecies(String species) {
        this.species = species;
    }
     /**
     * @return the hidup
     */
    public boolean isHidup() {
        return hidup;
    }

    /**
     * @return the habitat
     */
    public String getHabitat() {
        return habitat;
    }

    /**
     * @return the tinggi
     */
    public int getTinggi() {
        return tinggi;
    }


    private String nama;
    private String species;
    protected boolean hidup;
    protected String habitat;
    protected int tinggi;
    /**
     * @param args the command line arguments
     */
    }
   
