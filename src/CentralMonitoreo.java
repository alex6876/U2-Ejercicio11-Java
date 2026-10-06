public class CentralMonitoreo {

    Alerta alerta1;
    Alerta alerta2;
    Alerta alerta3;

    public void procesarAlerta(Alerta alerta) {
        if(alerta1 == null){
            alerta1=alerta;
        }else if(alerta2 == null){
            alerta2=alerta;
        }else if(alerta3 == null){
            alerta3=alerta;
        }

        System.out.println("Alerta registrada en la central");
    }

    public void mostrarReporte(){
        System.out.println("========== Reporte en la central ==========");

        if(alerta1!=null){
            alerta1.mostrarAlerta();
        }

        if(alerta2!=null){
            alerta2.mostrarAlerta();
        }

        if(alerta3!=null){
            alerta3.mostrarAlerta();
        }
    }
}
