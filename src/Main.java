public class Main {
    public static void main(String[] args) {
        CentralMonitoreo central = new CentralMonitoreo();

        SensorPerimetral sensor1 =
                new SensorPerimetral(1, "Barrera infrarroja", central);

        SensorPerimetral sensor2 =
                new SensorPerimetral(2, "Camara de movimiento", central);

        sensor1.detectarMovimiento();
        sensor2.detectarMovimiento();

        central.mostrarReporte();
    }
}