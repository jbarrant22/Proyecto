package Aerolinea.Dao;

import Aerolinea.Domain.Boletos;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface BoletosDao extends CrudRepository<Boletos, Long> {

    List<Boletos> findByBoletos(int boletos);


    }
