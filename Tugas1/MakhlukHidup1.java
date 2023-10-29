/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbo1;

/**
 *
 * @author Ailsa
 */
public class MakhlukHidup1 {

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
     * @return the namaIlmiah
     */
    public String getNamaIlmiah() {
        return namaIlmiah;
    }

    /**
     * @param namaIlmiah the namaIlmiah to set
     */
    public void setNamaIlmiah(String namaIlmiah) {
        this.namaIlmiah = namaIlmiah;
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
     * @return the asal
     */
    public String getAsal() {
        return asal;
    }

    /**
     * @param asal the asal to set
     */
    public void setAsal(String asal) {
        this.asal = asal;
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
     * @return the warnaBulu
     */
    public String getWarnaBulu() {
        return warnaBulu;
    }

    /**
     * @param warnaBulu the warnaBulu to set
     */
    public void setWarnaBulu(String warnaBulu) {
        this.warnaBulu = warnaBulu;
    }

    /**
     * @return the makanan
     */
    public String getMakanan() {
        return makanan;
    }

    /**
     * @param makanan the makanan to set
     */
    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }
    private String nama; 
    private String namaIlmiah;
    private String species;
    private String asal;
    private String habitat;
    private String bentukTubuh;
    private String warnaBulu;
    private String makanan;
    
    protected String berkembangBiak(){ //Atribut dengan akses modifier "protected"
        return "Penguin Berkembang Biak dengan bertelur ";
    }
    
    protected String bernafas(){
        return "Penguin bernafas dengan paru-paru mereka dalam air";
    }
    
    protected String bergerak(){
        return "Penguin berjalan dan berenang menggunakan kaki dan sirip berbentuk sayap";
    }
    /**
     * @param args the command line arguments
     */
    
    
    
    public MakhlukHidup1 (){
        nama = "Penguin";
    }
    private static void Main(String[] args) { 
       System.out.println("Nama makhluk hidup ");
    }
     
    
}
