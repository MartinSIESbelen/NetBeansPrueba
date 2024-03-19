/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maquinaria;
import Personal.Maquinista;
/**
 *
 * @author sierr
 */
class Trenes {
    Locomotoras locomotora;
    Vagones vagon[];
    Maquinista maquinista;

    public Trenes(Locomotoras locomotora, Vagones vagones, Maquinista maquinista) {
        this.locomotora = locomotora;
        this.vagon = new Vagones[5];
        this.maquinista = maquinista;
    }
    
    
}
