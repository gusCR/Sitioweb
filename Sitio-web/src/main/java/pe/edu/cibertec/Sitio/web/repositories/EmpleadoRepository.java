package pe.edu.cibertec.Sitio.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.Sitio.web.entities.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {

    
}
