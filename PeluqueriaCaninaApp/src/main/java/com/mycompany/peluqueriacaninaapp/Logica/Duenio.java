
package com.mycompany.peluqueriacaninaapp.Logica;

public class Duenio
{
    private int idDuenio;
    private String nombre;
    private String celularDelDuenio;

    public Duenio()
    {
    }

    public Duenio(int idDuenio, String nombre, String celularDelDuenio)
    {
        this.idDuenio = idDuenio;
        this.nombre = nombre;
        this.celularDelDuenio = celularDelDuenio;
    }

    public String getCelularDelDuenio()
    {
        return celularDelDuenio;
    }

    public void setCelularDelDuenio(String celularDelDuenio)
    {
        this.celularDelDuenio = celularDelDuenio;
    }

    public int getIdDuenio()
    {
        return idDuenio;
    }

    public void setIdDuenio(int idDuenio)
    {
        this.idDuenio = idDuenio;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    
}
