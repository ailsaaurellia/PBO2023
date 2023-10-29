/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utama;

import hewan.Hewan;
import hewan.Kambing;
import hewan.Komodo;
/**
 *
 * @author Ailsa
 */
public class Utama {
    
    public static void main(String[] args) {
        Komodo flores = new Komodo();
        System.out.println("Komodo Flores tinggal di " + flores.getHabitat());
        System.out.println("Berat saya " + flores.berat("100kg"));
        System.out.println("                                   ");
        System.out.println("                                   ");
        Kambing kosta = new Kambing();
        System.out.println("Kambing kosta tinggal di " + kosta.getHabitat());
        System.out.println("Berat saya " + kosta.berat(27.0));
        kosta.makanTumbuhan();
        kosta.bergerakJalan();
        kosta.bersuaraMbek();
        System.out.println("                                   ");
        System.out.println("                                   ");
        Hewan y = new Hewan();
        System.out.println("Ayam hidup " + y.getHabitat());
        System.out.println("Ayam " + y.berat());
    }
    }

    
