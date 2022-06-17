
package Controlador;

import Modelo.Factura;
import Servicio.FacturaServicio;
import java.util.List;


public class FacturaControl {
    
    private FacturaServicio facturaServicio = new FacturaServicio();
    
     public Factura crearFactura(String [] args){
    Factura factura = new Factura(Integer.valueOf(args[0]),Integer.valueOf(args[1]),args[3],args[4]);
    this.facturaServicio.crear(factura);
    return factura;
     }
 
    public List<Factura> listar(){
        return this.facturaServicio.listar();
    }
}
