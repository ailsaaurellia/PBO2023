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
public class Kambing extends Hewan implements Herbivora, Gerak, Suara {
    //implementasikan secara detail
    
    @Override
    public void makanTumbuhan() {
        System.out.println("Saya makan rumput");
    }

    @Override
    public void bergerakJalan() {
        System.out.println("Saya berjalan");
    }
    
    @Override
    public void bersuaraMbek() {
        System.out.println("Suara saya MBEEKKK");
    }
    
    public void setHabitat() {
        super.setHabitat("Darat bukan Laut");
    }
    
    public Kambing() {
        this.setHabitat();
    }
}

