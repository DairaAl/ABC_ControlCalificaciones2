//--------------------------------------------
//Programa: Login
//Fecha: 30/10/2016
//Autor: Petra Almanza Lobatos
//Tamaño: 28LOC
//--------------------------------------------
package Entidades;

public class usuario {

    int id,
            tipoUsuario;
    String contraseña;

    public usuario() {
        id = 0;
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

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}
