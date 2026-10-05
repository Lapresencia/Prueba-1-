
public abstract class Bicicleta {

    private String codigoBicicleta;
    private int anioFabricacion;
    private double pesokg;

    public Bicicleta(String codigoBicicleta, int anioFabricacion, double pesokg) {
        setCodigoBicicleta(codigoBicicleta);
        setAnioFabricacion(anioFabricacion);
        setPesokg(pesokg);
    }

    public abstract double calcularCostoMantencion() ;

    public double calcularCostoMantencion(double porcentajeDescuento) {
        if (porcentajeDescuento < 0 || porcentajeDescuento > 100) {
            throw new IllegalArgumentException("El porcentaje debe ser entre 0 y 100");
        }
        double costo = calcularCostoMantencion();
        return costo - (costo * (porcentajeDescuento / 100.0));
    }

    public String getCodigoBicicleta() {
        return codigoBicicleta;
    }

    public void setCodigoBicicleta(String codigoBicicleta) {
        if (codigoBicicleta == null || codigoBicicleta.trim().isEmpty()) {
            throw new IllegalArgumentException("Codigo no valido");
        }
        this.codigoBicicleta = codigoBicicleta;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        if (anioFabricacion < 2000 || anioFabricacion > 2026) {
            throw new IllegalArgumentException("Anio invalido");
        }
        this.anioFabricacion = anioFabricacion;
    }

    public double getPesokg() {
        return pesokg;
    }

    public void setPesokg(double pesokg) {
        if (pesokg <= 0) {
            throw new IllegalArgumentException("El peso debe ser mayor a 0");
        }
        this.pesokg = pesokg;
    }

    @Override
    public String toString() {
        return "Código: " + codigoBicicleta + " | Año: " + anioFabricacion;
    }
}