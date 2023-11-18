package Aerolinea.Service;

import Aerolinea.Dao.BoletosDao;
import Aerolinea.Domain.Boletos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoletosServicelmpl implements BoletosService {

    @Autowired
    BoletosDao boletosDao;

    @Override
    public List<Boletos> getBoletos(boolean activos) {
        var lista = (List<Boletos>) boletosDao.findAll();

        if (activos) {
            lista.removeIf(e -> e.isActivo());
        }

        return lista;
    }

    @Override
    public Boletos getBoletos(Boletos boletos) {
        return boletosDao.findById(boletos.getIdBoletos()).orElse(null);

    }

    @Override
    public void save(Boletos boletos) {
        boletosDao.save(boletos);
    }

    @Override
    public void delete(Boletos boletos) {
        boletosDao.delete(boletos);

    }

    @Override
    public List<Boletos> getPorBoletos(int boletos) {
        return null;
    }
}
