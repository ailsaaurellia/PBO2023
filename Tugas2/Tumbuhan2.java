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
public class Tumbuhan2 extends MakhlukHidup2 {

    public Tumbuhan2() {
        super();
        this.habitat = "Darat";
        this.hidup = true;
        this.tinggi = 120;
        this.ukuranSel = 0.4;
    }

    public Tumbuhan2(String habitat) {
        super("Darat");
        this.habitat = habitat;
        this.hidup = true;
        this.tinggi = 120;
        this.ukuranSel = 0.4;
    }

    public Tumbuhan2(boolean hidup) {
        super(true);
        this.habitat = "Darat";
        this.hidup = hidup;
        this.tinggi = 120;
        this.ukuranSel = 0.4;
    }

    public Tumbuhan2(int tinggi) {
        super(120);
        this.habitat = "Darat";
        this.hidup = true;
        this.tinggi = tinggi;
        this.ukuranSel = 0.4;
    }
    
     public Tumbuhan2(double ukuranSel) {
        this.ukuranSel = 0.4;
        this.habitat = "Darat";
        this.hidup = true;
        this.tinggi = 120;
        this.ukuranSel = ukuranSel;
    }
    /**
     * @return the ukuranSel
     */
    public double getUkuranSel() {
        return ukuranSel;
    }

    /**
     * @return the jenisDaun
     */
    public String getJenisDaun() {
        return jenisDaun;
    }

    /**
     * @param jenisDaun the jenisDaun to set
     */
    public void setJenisDaun(String jenisDaun) {
        this.jenisDaun = jenisDaun;
    }
    
    private String jenisDaun;
    protected double ukuranSel;
}
