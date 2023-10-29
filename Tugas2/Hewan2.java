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
public class Hewan2 extends MakhlukHidup2 {

    public Hewan2() {
        super();
        this.habitat = "Tempat Suhu Dingin";
        this.hidup = true;
        this.umur = 25;
        this.beratBadan = 45.0;
    }

    public Hewan2(String habitat) {
        super("Tempat Suhu Dingin");
        this.habitat = habitat;
        this.hidup = true;
        this.umur = 25;
        this.beratBadan = 45.0;
    }

    public Hewan2(boolean hidup) {
        super(true);
        this.habitat = "Tempat Suhu Dingin";
        this.hidup = hidup;
        this.umur = 25;
        this.beratBadan = 45.0;
    }

    public Hewan2(int umur) {
        super(25);
        this.habitat = "Tempat Suhu Dingin";
        this.hidup = true;
        this.umur = umur;
        this.beratBadan = 45.0;
    
    }

    public Hewan2(double berat) {
        this.beratBadan = 45.0;
        this.habitat = "Tempat Suhu Dingin";
        this.hidup = true;
        this.umur = 25;
        this.beratBadan = berat;

    }
    /**
     * @return the beratBadan
     */
    public Double getBeratBadan() {
        return beratBadan;
    }

    /**
     * @return the umur
     */
    public int getUmur() {
        return umur;
    }

    /**
     * @param umur the umur to set
     */
    public void setUmur(int umur) {
        this.umur = umur;
    }

    private int umur;
    protected Double beratBadan;
    
}
