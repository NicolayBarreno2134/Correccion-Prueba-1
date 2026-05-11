public class DronLiviano extends Dron{
    private double limiteHoras = 2.0;
    private double limitePeso = 5.0;

    public DronLiviano() {
        super("DL-000", "LivianoDefault", 5.0, 2.0, 1.0, 3.00);
    this.limiteHoras = 2.0;
    this.limitePeso = 5.0;
    }

    public DronLiviano(String codigo, String modelo, double distanciaKm, double pesoPaquete, double horasVuelo, double costoBase) {
        super(codigo, modelo, distanciaKm, pesoPaquete, horasVuelo, costoBase);
        setLimiteHoras(limiteHoras);
        setLimitePeso(limitePeso);
    }

    public double getLimiteHoras() {
        return limiteHoras;
    }
    public double getLimitePeso() {
        return limitePeso;
    }

    public void setLimiteHoras(double limiteHoras) {
        if (limiteHoras > 0) this.limiteHoras = limiteHoras;
    }

    public void setLimitePeso(double limitePeso) {
        if (limitePeso > 0) this.limitePeso = limitePeso;
    }

    @Override
    public double calcularCostoEntrega() {
        return costoBase + (getDistanciaKm() * 0.80) + (getPesoPaquete() * 0.50);
    }

    @Override
    public boolean validarDatos() {
        if (getCodigo() == null || getCodigo().trim().isEmpty())
            return false;
        if (getModelo() == null || getModelo().trim().isEmpty())
            return false;
        if (getDistanciaKm() <= 0)
            return false;
        if (getPesoPaquete() <= 0 || getPesoPaquete() > limitePeso)
            return false;
        if (getHorasVuelo() <= 0 || getHorasVuelo() > limiteHoras)
            return false;
        return true;
    }

    @Override

    public void mostrarInformacion() {
        if (validarDatos()==true){
            System.out.println("--- Dron Liviano ---");
            super.mostrarInformacion();
            System.out.println("Límite de peso: "+ getLimitePeso());
            System.out.println("Límite de horas: "+getLimiteHoras());
        }else{
            System.out.println("--- Dron Liviano ---");
            super.mostrarInformacion();
        }

    }

}
