public class BicicletaElectrica extends Bicicleta {

    private double autonomiaKm;
    private boolean bateriaCertificada;

    public BicicletaElectrica(String codigoBicicleta, int anioFabricacion, double pesokg, double autonomiaKm, boolean bateriaCertificada) {
        super(codigoBicicleta, anioFabricacion, pesokg);
        setAutonomiaKm(autonomiaKm);
        this.bateriaCertificada = bateriaCertificada;
    }

    @Override
    public double calcularCostoMantencion() {
        double costo = 45000;
        if (bateriaCertificada == false) {
            costo = costo * 1.25;
        }
        return costo;
    }

    public double getAutonomiaKm() {
        return autonomiaKm;
    }

    public void setAutonomiaKm(double autonomiaKm) {
        if (autonomiaKm <= 0) {
            throw new IllegalArgumentException("Autonomia invalida");
        }
        this.autonomiaKm = autonomiaKm;
    }

    public boolean isBateriaCertificada() {
        return bateriaCertificada;
    }

    public void setBateriaCertificada(boolean bateriaCertificada) {
        this.bateriaCertificada = bateriaCertificada;
    }
}