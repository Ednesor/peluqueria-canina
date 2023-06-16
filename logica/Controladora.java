/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;

/**
 *
 * @author Edgardo
 */
public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMascota, String razaMascota, String colorMascota, String celDueno, String obsMascota, String nombreDueno, String alergico, String ateEsp) {
        
        Dueno dueno = new Dueno();
        dueno.setNombre(nombreDueno);
        dueno.setCelDueno(celDueno);
        
        Mascota masco = new Mascota();
        masco.setNombre(nombreDueno);
        masco.setRaza(razaMascota);
        masco.setColor(colorMascota);
        masco.setObservaciones(obsMascota);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(ateEsp);
        masco.setDueno(dueno);
        
        controlPersis.guardar(dueno, masco);
    }

    
    
    
}
