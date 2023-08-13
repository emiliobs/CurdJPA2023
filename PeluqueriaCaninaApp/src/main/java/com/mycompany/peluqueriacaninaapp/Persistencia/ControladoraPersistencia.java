
package com.mycompany.peluqueriacaninaapp.Persistencia;

import com.mycompany.peluqueriacaninaapp.Logica.Duenio;
import com.mycompany.peluqueriacaninaapp.Logica.Mascota;
import java.util.List;

public class ControladoraPersistencia
{
     DuenioJpaController duenioJpaController = new DuenioJpaController();
     MascotaJpaController mascotaJpaController = new MascotaJpaController();

    public void Guardar(Duenio duenio, Mascota mascota)
    {
        //Crear en la base de datos Duenio
        duenioJpaController.create(duenio);
        
        //Crear en la base de datos Macota
        mascotaJpaController.create(mascota);
    }

    public List<Mascota> TraerMascotas()
    {
        return mascotaJpaController.findMascotaEntities();
    }
     
     
}
