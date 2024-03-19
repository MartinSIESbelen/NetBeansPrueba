/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personal;

/**
 *
 * @author sierr
 */
public class Mecanicos {
    String nombre;
    String telefono;
    enum especialidad{freno, hidraulica, electricidad, motor}
    especialidad es;
    
    public Mecanicos(String nombre, String telefono, String es) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.es = especialidad.valueOf(es);
    }
    
    
}
