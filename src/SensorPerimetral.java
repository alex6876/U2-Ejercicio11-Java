public class SensorPerimetral {
    private int idZona;
    private String tipoSensor;
    private CentralMonitoreo central;

    public SensorPerimetral(int idZona, String tipoSensor, CentralMonitoreo central) {
        this.idZona = idZona;
        this.tipoSensor = tipoSensor;
        this.central = central;
    }

    public void detectarMovimiento() {
        System.out.println("Movimiento detectado.");

        Alerta alerta = new Alerta(
                idZona,
                tipoSensor,
                "05/10/2026 20:50"
        );

        central.procesarAlerta(alerta);
    }
}