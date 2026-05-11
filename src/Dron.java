public abstract class Dron {
    private String codigo;
    private String modelo;
    private double distanciaKm;
    private double pesoPaquete;
    private double horasVuelo;
    protected double costoBase;

    public Dron() {
        this.codigo = "";
        this.modelo = "";
        this.distanciaKm = 0.0;
        this.pesoPaquete = 0.0;
        this.horasVuelo = 0.0;
        this.costoBase = 0.0;
    }

    public Dron(String codigo, String modelo, double distanciaKm, double pesoPaquete, double horasVuelo, double costoBase) {
        setCodigo(codigo);
        setModelo(modelo);
        setDistanciaKm(distanciaKm);
        setPesoPaquete(pesoPaquete);
        setHorasVuelo(horasVuelo);
        setCostoBase(costoBase);
    }

    public String getCodigo() {
        return codigo;
    }
    public String getModelo() {
        return modelo;
    }
    public double getDistanciaKm() {
        return distanciaKm;
    }
    public double getPesoPaquete() {
        return pesoPaquete;
    }
    public double getHorasVuelo() {
        return horasVuelo;
    }
    public double getCostoBase() {
        return costoBase;
    }

    public void setCodigo(String codigo) {
        if (codigo != null && !codigo.trim().isEmpty()) {
            this.codigo = codigo.trim();
        }
    }

    public void setModelo(String modelo) {
        if (modelo != null && !modelo.trim().isEmpty()) {
            this.modelo = modelo.trim();
        }
    }

    public void setDistanciaKm(double distanciaKm) {
        if (distanciaKm > 0) {
            this.distanciaKm = distanciaKm;
        }
    }

    public void setPesoPaquete(double pesoPaquete) {
        if (pesoPaquete > 0) {
            this.pesoPaquete = pesoPaquete;
        }
    }

    public void setHorasVuelo(double horasVuelo) {
        if (horasVuelo > 0) {
            this.horasVuelo = horasVuelo;
        }
    }

    public void setCostoBase(double costoBase) {
        if (costoBase >= 0) {
            this.costoBase = costoBase;
        }
    }

    public abstract double calcularCostoEntrega();
    public abstract boolean validarDatos();
    public void mostrarInformacion() {
        System.out.println("--- Información general ---");
        System.out.println("Codigo: "+getCodigo());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Distancia Km: "+getDistanciaKm());
        System.out.println("Peso paquete: "+getPesoPaquete());
        System.out.println("Horas Vuelo: "+getHorasVuelo());
        System.out.println("Costo Base: "+getCostoBase());
        System.out.println("Costo de Entrega: "+calcularCostoEntrega());
    }
}
