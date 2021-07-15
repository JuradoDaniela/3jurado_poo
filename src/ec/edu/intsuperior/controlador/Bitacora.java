/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.modelo.Parqueadero;
import ec.edu.intsuperior.modelo.Vehiculo;

/**
 *
 * @author User
 */
public class Bitacora {
    
    private String idBitacora;
    private Parqueadero parqueadero;
    private Vehiculo vehiculo;
    private Float horaIngreso;
    private Float horaSalida;
    private String fechaIngreso;
    private String fechaSalida;

    public Bitacora() {
    }

    public Bitacora(String idBitacora, Parqueadero parqueadero, Vehiculo vehiculo, Float horaIngreso, Float horaSalida, String fechaIngreso, String fechaSalida) {
        this.idBitacora = idBitacora;
        this.parqueadero = parqueadero;
        this.vehiculo = vehiculo;
        this.horaIngreso = horaIngreso;
        this.horaSalida = horaSalida;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
    }

    public String getIdBitacora() {
        return idBitacora;
    }

    public void setIdBitacora(String idBitacora) {
        this.idBitacora = idBitacora;
    }

    public Parqueadero getParqueadero() {
        return parqueadero;
    }

    public void setParqueadero(Parqueadero parqueadero) {
        this.parqueadero = parqueadero;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Float getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(Float horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public Float getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Float horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    
}
