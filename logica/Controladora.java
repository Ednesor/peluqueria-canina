/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;

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
        masco.setNombre(nombreMascota);
        masco.setRaza(razaMascota);
        masco.setColor(colorMascota);
        masco.setObservaciones(obsMascota);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(ateEsp);
        masco.setDueno(dueno);
        
        controlPersis.guardar(dueno, masco);
    }

    public List<Mascota> traerMascotas() {
        
        return controlPersis.traerMascotas();
    }

    public void borrarMascota(int num_cliente) {
        controlPersis.borrarMascota(num_cliente);
    }

    public Mascota traerMascota(int num_cliente) {
        return controlPersis.traerMascota(num_cliente);
    }

    public void modificarMascota(Mascota masco, String nombreMascota, String razaMascota, String colorMascota, String obsMascota, String alergico, String ateEsp, String nombreDueno, String celDueno) {
        masco.setNombre(nombreMascota);
        masco.setRaza(razaMascota);
        masco.setColor(colorMascota);
        masco.setObservaciones(obsMascota);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(ateEsp);
        
        controlPersis.modificarMascota(masco);
        
        Dueno dueno = this.buscarDueno(masco.getDueno().getId_dueno());
        dueno.setCelDueno(celDueno);
        dueno.setNombre(nombreDueno);
        
        this.modificarDueno(dueno);
    }

    private Dueno buscarDueno(int id_dueno) {
        return controlPersis.buscarDueno(id_dueno);
    }

    private void modificarDueno(Dueno dueno) {
        controlPersis.modificarDueno(dueno);
    }

}
