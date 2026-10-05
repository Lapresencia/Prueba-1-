public class BicicletaMontanya extends Bicicleta {

    private int cantidadSuspensiones;

    public BicicletaMontanya(String codigoBicicleta, int anioFabricacion, double pesokg, int cantidadSuspensiones) {
        super(codigoBicicleta, anioFabricacion, pesokg);
        setCantidadSuspensiones(cantidadSuspensiones);
    }

    @Override
    public double calcularCostoMantencion() {
        double costo = 30000;
        if (cantidadSuspensiones > 1) {
            costo = costo * 1.15;
        }
        return costo;
    }

    public int getCantidadSuspensiones() {
        return cantidadSuspensiones;
    }

    public void setCantidadSuspensiones(int cantidadSuspensiones) {
        if (cantidadSuspensiones < 0) {
            throw new IllegalArgumentException("Suspensiones no pueden ser negativas");
        }
        this.cantidadSuspensiones = cantidadSuspensiones;
    }
}