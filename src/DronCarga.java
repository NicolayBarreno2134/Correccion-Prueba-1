public class DronCarga extends Dron {
    private double costoPorKg = 1.20;
    private double limitePeso = 30.0;
    private double limiteHoras = 5.0;

    public DronCarga() {
        super("DC-000", "CargaDefault", 5.0, 2.0, 1.0, 6.00);
        this.limitePeso = 30.0;
        this.limiteHoras = 5.0;
    }

    public DronCarga(String codigo, String modelo, double distanciaKm, double pesoPaquete, double horasVuelo, double costoBase, double costoPorKg) {
        super(codigo, modelo, distanciaKm, pesoPaquete, horasVuelo, costoBase);
        this.costoPorKg = costoPorKg;
    }

    public double getCostoPorKg() {
        return costoPorKg;
    }
    public double getLimitePeso() {
        return limitePeso;
    }
    public double getLimiteHoras() {
        return limiteHoras;
    }

    public void setCostoPorKg(double costoPorKg) {
        if (costoPorKg >= 0) {
            this.costoPorKg = costoPorKg;
        }
    }

    public void setLimitePeso(double limitePeso) {
        if (limitePeso > 0) {
            this.limitePeso = limitePeso;
        }
    }

    public void setLimiteHoras(double limiteHoras) {
        if (limiteHoras > 0) {
            this.limiteHoras = limiteHoras;
        }
    }

    @Override
    public double calcularCostoEntrega() {
        return costoBase + (getDistanciaKm() * 1.20) + (getPesoPaquete() * costoPorKg);
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
        if (getPesoPaquete() <= 0 || getPesoPaquete() > limitePeso) {
            return false;
        }
        if (getHorasVuelo() <= 0 || getHorasVuelo() > limiteHoras) {
            return false;
        }
        return true;
    }

    @Override
    public void mostrarInformacion() {
        if (validarDatos()==true){
            System.out.println("--- Dron Carga ---");
            super.mostrarInformacion();
            System.out.println("Costo por kg:"+ costoPorKg);
            System.out.println("Límite de peso:"+ limitePeso);
            System.out.println("Límite de horas: "+ limiteHoras);
        }else{
            System.out.println("--- Dron Carga ---");
            super.mostrarInformacion();
        }

    }
}
