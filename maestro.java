//--------------------------------------------
//Programa: maestro
//Fecha: 05/11/2016
//Autor: Petra Almanza Lobatos
//Tamaño: 21LOC
//--------------------------------------------
package Entidades;

public class maestro {

    private String idMaestro;
    private String nombre;

    public maestro() {
        this.idMaestro = null;
        this.nombre = null;
    }

    public String getId() {
        return this.idMaestro;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setId(String id) {
        this.idMaestro = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}//end maestro
