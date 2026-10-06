import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        GestorTallerBicicletas gestor = new GestorTallerBicicletas();

        BicicletaElectrica e1 = new BicicletaElectrica("BIC-E01", 2023, 22.5, 60.0, false);
        BicicletaElectrica e2 = new BicicletaElectrica("BIC-E02", 2022, 24.0, 45.0, true);
        BicicletaMontanya m1 = new BicicletaMontanya("BIC-M01", 2021, 13.5, 2);
        BicicletaMontanya m2 = new BicicletaMontanya("BIC-M02", 2020, 12.0, 1);

        e1.activarGarantiaExtendida();

        gestor.registrar(e1);
        gestor.registrar(e2);
        gestor.registrar(m1);
        gestor.registrar(m2);

        System.out.println();

        System.out.println("=== BUSQUEDA DE BICICLETA ===");
        ArrayList<Bicicleta> resultado = gestor.buscarPorCodigo("BIC-E01");

        for (Bicicleta b : resultado) {
            System.out.println("Bicicleta encontrada: " + b.getCodigoBicicleta());
            System.out.println("Costo de mantencion: $" + b.calcularCostoMantencion());
        }

        System.out.println();

        System.out.println("=== LISTADO DE TODAS LAS BICICLETAS ===");
        ArrayList<Bicicleta> todas = gestor.getBicicletas();

        for (Bicicleta b : todas) {
            System.out.println(b);
        }
    }
}