
package com.proyectoFinal.mrd.Repository;

import com.proyectoFinal.mrd.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository  extends JpaRepository<Persona, Long>{

}
