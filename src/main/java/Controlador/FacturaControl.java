/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Factura;
import Servicio.FacturaServicio;
import java.util.List;


public class FacturaControl {
    
    private FacturaServicio facturaServicio = new FacturaServicio();
    
    public List<Factura> listar(){
        return this.facturaServicio.listar();
    }
}
