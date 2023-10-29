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
public class Komodo extends Hewan {
    
     public void setHabitat() {
        super.setHabitat("Air dan Darat ");
    }
    
    public Komodo() {
        this.setHabitat();
    }
}

//abstract class adalah class yang tidak dapat dibuat intance sebelum diturunkan 
//jadi harus pake keyword extends seperrti public class bayu extends janin ()