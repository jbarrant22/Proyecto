package Aerolinea.Service;

import java.util.List;
import Aerolinea.Domain.Tripulacion;


public interface TripulacionService {
    
    public List<Tripulacion> getTripulacions();

    public Tripulacion getTripulacion(Tripulacion tripulacion);

    public void save(Tripulacion tripulacion);

    public void delete(Tripulacion tripulacion);

  

    
}
