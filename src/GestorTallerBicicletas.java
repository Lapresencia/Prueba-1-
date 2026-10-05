import java.util.ArrayList;

public class GestorTallerBicicletas {

    private ArrayList<Bicicleta> lista = new ArrayList<Bicicleta>();

    public void registrar(Bicicleta b) {
        lista.add(b);
        System.out.println(b.getCodigoBicicleta() + " registrada correctamente.");
    }

    public ArrayList<Bicicleta> buscarPorCodigo(String codigo) {
        ArrayList<Bicicleta> encontradas = new ArrayList<Bicicleta>();
        for (Bicicleta b : lista) {
            if (b.getCodigoBicicleta().equals(codigo)) {
                encontradas.add(b);
            }
        }
        return encontradas;
    }

    public ArrayList<Bicicleta> getBicicletas() {
        return lista;
    }
}