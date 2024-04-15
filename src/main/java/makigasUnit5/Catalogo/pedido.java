package makigasUnit5.Catalogo;

import makigasUnit5.pagos.PagoException;
import makigasUnit5.pagos.ProveedorPagos;

import java.util.ArrayList;
import java.util.List;

public class pedido implements Carrito,pagable {
    private final List<Producto> productos = new ArrayList<>();

    @Override
    public void agregar(Producto p) {
        this.productos.add(p);
    }

    @Override
    public int cantidad() {
        return productos.size();
    }

    @Override
    public int total() {
        return this.productos.stream()
                .map(Producto::getPrecio)
                .reduce(0, Integer::sum);
    }

    @Override
    public void vaciar() {
        productos.clear();
    }

    @Override
    public void pagar(ProveedorPagos pagos) throws PagoException {

    }
}

