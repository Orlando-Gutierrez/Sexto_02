/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.educalibro.entidades;

/**
 *
 * @author orlando
 */
public class cliente {
    
    private int id;
    private String RUC;
    private String nombre;
    private String telefono;

    public cliente() {
    }

    public cliente(int id, String RUC, String nombre, String telefono) {
        this.id = id;
        this.RUC = RUC;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "cliente{" + "id=" + id + ", RUC=" + RUC + ", nombre=" + nombre + ", telefono=" + telefono + '}';
    }
    
    
    
    
}
