package Aerolinea.Service;

import java.util.List;
import Aerolinea.Domain.Cliente;


public interface ClienteService {
    
    public List<Cliente> getClientes();

    public Cliente getCliente(Cliente cliente);

    public void save(Cliente cliente);

    public void delete(Cliente cliente);

    
}
