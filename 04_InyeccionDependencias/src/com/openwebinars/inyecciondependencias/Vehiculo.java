package com.openwebinars.inyecciondependencias;

public class Vehiculo {

    // Composition relation
    // High coupling. Any change in Motor --> it can affect to Vehiculo class
    private Motor m;

    public Vehiculo() {
        m = new Motor();
    }

    public int getRevolucionesMotor() {
        return m.getRevoluciones();
    }
    
}
