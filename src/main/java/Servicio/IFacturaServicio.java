
package Servicio;

import Modelo.Factura;
import java.util.List;


public interface IFacturaServicio {
    public Factura crear(Factura factura);
    public List<Factura> listar();
}
