//--------------------------------------------
//Programa: Login
//Fecha: 30/10/2016
//Autor: Petra Almanza Lobatos
//Tamaño: 32LOC
//--------------------------------------------

package controlcalificacionesv2;

public class usuario {

    int id,
            tipoUsuario;
    String nombre,
            contraseña;

    public usuario() {
        id = 0;
        nombre = null;
        contraseña = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}
