package Aerolinea.IndexController;

import Aerolinea.Domain.Boletos;
import Aerolinea.Service.BoletosService;
import Aerolinea.Service.PaisesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class BoletosController {

    @Autowired
    private BoletosService boletosService;

    @Autowired
    private PaisesService paisesService;

    @GetMapping("/boletos/listado")
    public String inicio(Model model) {
        var boletos = boletosService.getBoletos(false);
        model.addAttribute("boletos", boletos);
        return "index";
    }

    @GetMapping("/boletos/nuevo")
    public String nuevoBoletos(Boletos boletos, Model model) {
        var paises = paisesService.getPaises(true);
        model.addAttribute("paises", paises);
        return "modificarBoletos";
    }

    @PostMapping("/boletos/guardar")
    public String guardarBoletos(Boletos boletos) {
        boletosService.save(boletos);
        return "redirect:/boletos/listado";
    }

    @GetMapping("/boletos/modificar/{idBoletos}")
    public String modificarBoletos(Boletos boletos, Model model) {
        var paises = paisesService.getPaises(false);
        model.addAttribute("paises", paises);
        boletos = boletosService.getBoletos(boletos);
        model.addAttribute("boletos", boletos);
        return "/boletos/modificar/";
    }

    @GetMapping("/boletos/eliminar/{idBoletos}")
    public String eliminarBoletos(Boletos boletos) {
        boletosService.delete(boletos);
        return "redirect:/boletos/listado";
    }
}


///sdassaaa