package com.openwebinars.inyecciondependencias;

public class VehiculoV3 {
	
    private IMotor m;

    // Dependency injection via interface === Adding as argument the interface
    // Less coupling
    public VehiculoV3(IMotor motorVehiculo) {
        m = motorVehiculo;
    }

    public int getRevolucionesMotor() {
        return m.getRevoluciones();
    }
}
