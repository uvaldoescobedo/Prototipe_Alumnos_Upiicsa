package com.example.miupiicsa.OBJ;

public class Persona {
    private String Nombre,ApMaterno,ApPaterno;
    private String id_firer,Correo,Password;


    public Persona() {
    }

    public String getId_firer() {
        return id_firer;
    }

    public void setId_firer(String id_firer) {
        this.id_firer = id_firer;
    }

    public String getApMaterno() {
        return ApMaterno;
    }

    public void setApMaterno(String apMaterno) {
        ApMaterno = apMaterno;
    }

    public String getApPaterno() {
        return ApPaterno;
    }

    public void setApPaterno(String apPaterno) {
        ApPaterno = apPaterno;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }



    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
