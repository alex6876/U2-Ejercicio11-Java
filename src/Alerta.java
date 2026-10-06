public class Alerta {
    private int idZona;
    private String tipoSensor;
    private String marcaTemporal;

    public Alerta(int idZona, String tipoSensor, String marcaTemporal) {
        this.idZona = idZona;
        this.tipoSensor = tipoSensor;
        this.marcaTemporal = marcaTemporal;
    }

    public void mostrarAlerta(){
        System.out.println("Id de Zona: " + idZona);
        System.out.println("Tipo de Sensor: " + tipoSensor);
        System.out.println("Marca de Temporal: " + marcaTemporal);
    }
}
