/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Factura;
import java.util.ArrayList;
import java.util.List;

public class FacturaServicio implements IFacturaServicio {
        
    private static List<Factura> facturaList = new ArrayList<>();

    @Override
    public Factura crear(Factura factura) {
    this.facturaList.add(factura);
    return factura;
    }
    @Override
    public List<Factura> listar() {
        return this.facturaList;
    }
    
}
