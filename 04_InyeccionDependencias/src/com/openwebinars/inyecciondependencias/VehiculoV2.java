package com.openwebinars.inyecciondependencias;

public class VehiculoV2 {
	
    private Motor m;

    // Dependency injection via class--> Adding as argument the class
    // It still has got dependency
    public VehiculoV2(Motor motorVehiculo) {
        m = motorVehiculo;
    }

    public int getRevolucionesMotor() {
        return m.getRevoluciones();
    }
}
