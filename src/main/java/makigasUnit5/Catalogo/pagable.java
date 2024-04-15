package makigasUnit5.Catalogo;


import makigasUnit5.pagos.PagoException;
import makigasUnit5.pagos.ProveedorPagos;

public interface pagable {
    void pagar(ProveedorPagos pagos) throws PagoException;
}
