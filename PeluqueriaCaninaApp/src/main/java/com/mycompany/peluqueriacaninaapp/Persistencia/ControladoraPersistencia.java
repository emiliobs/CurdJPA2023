
package com.mycompany.peluqueriacaninaapp.Persistencia;

import com.mycompany.peluqueriacaninaapp.Logica.Duenio;
import com.mycompany.peluqueriacaninaapp.Logica.Mascota;
import com.mycompany.peluqueriacaninaapp.Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public void BorrarMascotaPorId(int numeroCliente)
    {
         try
         {
             mascotaJpaController.destroy(numeroCliente);
         }
         catch (NonexistentEntityException ex)
         {
             Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

    public Mascota TraerMascotaPorId(int numCliente)
    {
        return mascotaJpaController.findMascota(numCliente);
    }
     
     
}
