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
public class Penguin {
    
    public static void main(String[] args) {
        Hewan1 penguin = new Hewan1();
        penguin.setNama("Penguin");
        penguin.setNamaIlmiah("Sphenisciidae");
        penguin.setSpecies("Species Aves/Burung");
        penguin.setAsal("Samudra Selatan");
        penguin.setHabitat("Di tempat dingin");
        penguin.setBentukTubuh("Aerodinamis dan torpedo");
        penguin.setWarnaBulu("Hitam dan Putih");
        penguin.setMakanan("Ikan Laut");
        
        System.out.println("Nama makhluk hidup "+penguin.getNama());
        System.out.println("Berasal dari "+penguin.getAsal());
        System.out.println("Memakan "+penguin.getMakanan());
        System.out.println(penguin.bernafas());
        System.out.println(penguin.bergerak());
    }
}
