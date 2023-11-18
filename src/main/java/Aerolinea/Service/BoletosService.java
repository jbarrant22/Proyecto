
package Aerolinea.Service;

import Aerolinea.Domain.Boletos;
import java.util.List;


public interface BoletosService {
    
     public List<Boletos> getBoletos(boolean activos);

    public Boletos getBoletos(Boletos boletos);

    public void save(Boletos boletos);

    public void delete(Boletos boletos);
    
    public List<Boletos> getPorBoletos(int boletos);



}
    

