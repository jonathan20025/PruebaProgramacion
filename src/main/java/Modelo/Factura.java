
package Modelo;


public class Factura {
    private int codigo;
    private int ruc;
    private String nombre;
    private String fecha;

    public Factura(int codigo, int ruc, String nombre) {
        this.codigo = codigo;
        this.ruc = ruc;
        this.nombre = nombre;
    }

    public Factura(int codigo, int ruc, String nombre, String fecha) {
        this.codigo = codigo;
        this.ruc = ruc;
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Fractura{" + "codigo=" + codigo + ", ruc=" + ruc + ", nombre=" + nombre + ", fecha=" + fecha + '}';
    }
   
            
}
