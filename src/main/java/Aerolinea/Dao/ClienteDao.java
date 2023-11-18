
package Aerolinea.Dao;

import Aerolinea.Domain.Cliente;
import org.springframework.data.repository.CrudRepository;


public interface ClienteDao extends CrudRepository<Cliente,Long> {
    
}


