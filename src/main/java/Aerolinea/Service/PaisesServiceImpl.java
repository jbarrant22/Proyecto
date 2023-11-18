package Aerolinea.Service;

import Aerolinea.Dao.PaisesDao;
import Aerolinea.Domain.Paises;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaisesServiceImpl implements PaisesService {

        @Autowired
        PaisesDao paisesDao;

        @Override
        public List<Paises> getPaises(boolean activos) {
            var lista = (List<Paises>) paisesDao.findAll();

            if (activos) {
                lista.removeIf(e -> e.isActivo());
            }

            return lista;
        }

    @Override
        public Paises getPaises(Paises paises) {
            return paisesDao.findById(paises.getIdPaises()).orElse(null);

        }

        @Override
        public void save(Paises paises) {
            paisesDao.save(paises);
        }

        @Override
        public void delete(Paises paises) {
            paisesDao.delete(paises);

        }

        @Override
        public List<Paises> getPorPaises(int paises) {
            return null;
        }
    }

