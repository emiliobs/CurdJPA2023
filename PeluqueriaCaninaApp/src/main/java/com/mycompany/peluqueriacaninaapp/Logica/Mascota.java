
package com.mycompany.peluqueriacaninaapp.Logica;

public class Mascota
{
    private int numeroCliente;
    private String nombre;
    private String raza;
    private String color;
    private String alergico;
    private String atencionEspecial;
    private String observaciones;
    
    private Duenio unDuenio;

    public Mascota()
    {
    }

    public Mascota(int numeroCliente, String nombre, String raza, String color, String alergico, String atencionEspecial, String observaciones, Duenio unDuenio)
    {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atencionEspecial = atencionEspecial;
        this.observaciones = observaciones;
        this.unDuenio = unDuenio;
    }

    public Duenio getUnDuenio()
    {
        return unDuenio;
    }

    public void setUnDuenio(Duenio unDuenio)
    {
        this.unDuenio = unDuenio;
    }

    public int getNumeroCliente()
    {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente)
    {
        this.numeroCliente = numeroCliente;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getRaza()
    {
        return raza;
    }

    public void setRaza(String raza)
    {
        this.raza = raza;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getAlergico()
    {
        return alergico;
    }

    public void setAlergico(String alergico)
    {
        this.alergico = alergico;
    }

    public String getAtencionEspecial()
    {
        return atencionEspecial;
    }

    public void setAtencionEspecial(String atencionEspecial)
    {
        this.atencionEspecial = atencionEspecial;
    }

    public String getObservaciones()
    {
        return observaciones;
    }

    public void setObservaciones(String observaciones)
    {
        this.observaciones = observaciones;
    }
    
    
}
