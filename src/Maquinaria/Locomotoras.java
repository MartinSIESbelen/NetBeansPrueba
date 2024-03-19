/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maquinaria;
import Personal.Mecanicos;
import java.time.LocalDateTime;
/**
 *
 * @author sierr
 */
class Locomotoras {
    String matricula;
    double potenciaMotor;
    LocalDateTime anoFabricacion;
    Mecanicos mecanico;

    public Locomotoras(String matricula, double potenciaMotor, LocalDateTime anoFabricacion, Mecanicos mecanico) {
        this.matricula = matricula;
        this.potenciaMotor = potenciaMotor;
        this.anoFabricacion = anoFabricacion;
        this.mecanico = mecanico;
    }
    
    
}
