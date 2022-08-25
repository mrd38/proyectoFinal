
package com.proyectoFinal.mrd.Interface;

import com.proyectoFinal.mrd.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //traer lista persona
    public List<Persona> getPersona();
    
    //Guardar objeto tipo persona
    public void savePersona(Persona persona);
    
    //eliminar objeto ppor id
    public void deletePersona(Long id);
    
    //buscar por id
    public Persona findPersona(Long id);
    
}
