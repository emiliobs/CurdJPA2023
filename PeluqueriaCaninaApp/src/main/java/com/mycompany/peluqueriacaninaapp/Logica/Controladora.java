package com.mycompany.peluqueriacaninaapp.Logica;

import com.mycompany.peluqueriacaninaapp.Persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora
{

    ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();

    public void Guardar(String nombreMascota, String raza, String color,
            String alergenos, String atencionEspecial,
            String observaciones, String celularDuenio,
            String nombreDuenio)
    {
        // Creamos el dueno y asignamos los valores:
        Duenio duenio = new Duenio();

        duenio.setCelularDelDuenio(celularDuenio);
        duenio.setNombre(nombreDuenio);

        //Creamos mascotas y asignamos los valores:
        Mascota mascota = new Mascota();

        mascota.setAlergico(alergenos);
        mascota.setAtencionEspecial(atencionEspecial);
        mascota.setColor(color);
        mascota.setNombre(nombreMascota);
        mascota.setObservaciones(observaciones);
        mascota.setRaza(raza);
        mascota.setUnDuenio(duenio);

        //Guardar en la BAse de datos:
        controladoraPersistencia.Guardar(duenio, mascota);
    }

    public List<Mascota> TraerMascotas()
    {
        return controladoraPersistencia.TraerMascotas();
    }

    public void BorrarMascotaPorId(int numeroCliente)
    {
        controladoraPersistencia.BorrarMascotaPorId(numeroCliente);
    }

}
