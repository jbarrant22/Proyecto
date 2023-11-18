package Aerolinea.Service;

import Aerolinea.Dao.TripulacionDao;
import Aerolinea.Domain.Tripulacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TripulacionServicelmpl {

    @Autowired
    private TripulacionDao tripulacionDao;

    @Transactional(readOnly = true)
    public List<Tripulacion> getTripulacions() {
        var tripulacions = (List<Tripulacion>) tripulacionDao.findAll();

        return tripulacions;

    }

    @Transactional(readOnly = true)
    public Tripulacion getTripulacion(Tripulacion tripulacion) {

        return tripulacionDao.findById(tripulacion.getIdTripulacion()).orElse(null);
    }

    @Transactional
    public void save(Tripulacion tripulacion) {
        tripulacionDao.save(tripulacion);
    }

    @Transactional
    public void delete(Tripulacion tripulacion) {
        tripulacionDao.delete(tripulacion);
    }

}
