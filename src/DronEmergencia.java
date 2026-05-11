public class DronEmergencia extends Dron {
    private double recargoUrgencia = 10.0;
    private int nivelPrioridad = 1; // 1..3
    private double limitePeso = 10.0;
    private double limiteHoras = 3.0;

    public DronEmergencia() {
        super("DE-000", "EmergenciaDefault", 5.0, 2.0, 1.0, 8.00);
        this.recargoUrgencia = 10.0;
        this.nivelPrioridad = 2;
    }

    public DronEmergencia(String codigo, String modelo, double distanciaKm, double pesoPaquete, double horasVuelo, double costoBase, double recargoUrgencia, int nivelPrioridad) {
        super(codigo, modelo, distanciaKm, pesoPaquete, horasVuelo, costoBase);
        setRecargoUrgencia(recargoUrgencia);
        setNivelPrioridad(nivelPrioridad);
    }

    public double getRecargoUrgencia() {
        return recargoUrgencia;
    }
    public int getNivelPrioridad() {
        return nivelPrioridad;
    }
    public double getLimitePeso() {
        return limitePeso;
    }
    public double getLimiteHoras() {
        return limiteHoras;
    }

    public void setRecargoUrgencia(double recargoUrgencia) {
        if (recargoUrgencia >= 0) {
            this.recargoUrgencia = recargoUrgencia;
        }
    }

    public void setNivelPrioridad(int nivelPrioridad) {
        if (nivelPrioridad >= 1 && nivelPrioridad <= 3) {
            this.nivelPrioridad = nivelPrioridad;
        }
    }

    @Override
    public double calcularCostoEntrega() {
        return costoBase + (getDistanciaKm() * 1.50) + (getPesoPaquete() * 0.90) + recargoUrgencia;
    }

    @Override
    public boolean validarDatos() {
        if (getCodigo() == null || getCodigo().trim().isEmpty()) {
            return false;
        }
        if (getModelo() == null || getModelo().trim().isEmpty()) {
            return false;
        }
        if (getDistanciaKm() <= 0) {
            return false;
        }
        if (getPesoPaquete() <= 0 || getPesoPaquete() > limitePeso){
            return false;
        }
        if (getHorasVuelo() <= 0 || getHorasVuelo() > limiteHoras) {
            return false;
        }
        if (nivelPrioridad < 1 || nivelPrioridad > 3) {
            return false;
        }
        return true;
    }

    @Override
    public void mostrarInformacion() {
        if (validarDatos()==true) {
            System.out.println("--- Dron Emergencia ---");
            super.mostrarInformacion();
            System.out.println("RecargoUrgencia: " + getRecargoUrgencia());
            System.out.println("NivelPrioridad: " + getNivelPrioridad());
            System.out.println("LimitePeso: " + getLimitePeso());
            System.out.println("LimiteHoras: " + getLimiteHoras());
        }else{
            System.out.println("--- Dron Emergencia ---");
            super.mostrarInformacion();
        }
    }
}
