package Aerolinea.Service;

import Aerolinea.Dao.ClienteDao;
import Aerolinea.Domain.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteServiceImpl {
    @Autowired
    private ClienteDao clienteDao;

  
    @Transactional(readOnly = true)
    public List<Cliente> getClientes() {
        var clientes = (List<Cliente>) clienteDao.findAll();

        return clientes;
    
}
    
    @Transactional(readOnly = true)
    public Cliente getCliente(Cliente cliente) {

        return clienteDao.findById(cliente.getIdCliente()).orElse(null);
    }

    
    @Transactional
    public void save(Cliente cliente) {
        clienteDao.save(cliente);
    }

    @Transactional
    public void delete(Cliente cliente) {
        clienteDao.delete(cliente);
    }

}

