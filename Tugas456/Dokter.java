/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo5;

/**
 *
 * @author Ailsa
 */
public class Dokter {

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
     * @return the id_dokter
     */
    public String getId_dokter() {
        return id_dokter;
    }

    /**
     * @param id_dokter the id_dokter to set
     */
    public void setId_dokter(String id_dokter) {
        this.id_dokter = id_dokter;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    private String nama;
    private String id_dokter;
    private String alamat;
    
}