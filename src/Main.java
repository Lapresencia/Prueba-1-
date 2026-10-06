import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
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

        int opcion = 0;

        while (opcion != 4) {

            System.out.println("\n--- MENU ---");
            System.out.println("1. Registrar bicicleta");
            System.out.println("2. Buscar bicicleta");
            System.out.println("3. Ver todas");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");

            try {
                opcion = sc.nextInt();
                sc.nextLine();

                if (opcion == 1) {
                    System.out.print("Codigo: ");
                    String cod = sc.nextLine();

                    System.out.print("Anio: ");
                    int anio = sc.nextInt();

                    System.out.print("Peso: ");
                    double peso = sc.nextDouble();

                    System.out.print("Suspensiones: ");
                    int susp = sc.nextInt();

                    BicicletaMontanya nueva = new BicicletaMontanya(cod, anio, peso, susp);
                    gestor.registrar(nueva);

                } else if (opcion == 2) {
                    System.out.print("Codigo a buscar: ");
                    ArrayList<Bicicleta> res = gestor.buscarPorCodigo(sc.nextLine());

                    if (res.isEmpty()) {
                        System.out.println("no se encontro nada");
                    } else {
                        for (Bicicleta b : res) {
                            System.out.println(b);
                        }
                    }

                } else if (opcion == 3) {
                    for (Bicicleta b : gestor.getBicicletas()) {
                        System.out.println(b);
                    }

                } else if (opcion == 4) {
                    System.out.println("saliendo del sistema");

                } else {
                    System.out.println("opcion no valida");
                }

            } catch (Exception e) {
                System.out.println("error al ingresar los datos");
                sc.nextLine();
            }
        }

        sc.close();
    }
}