package Aerolinea.IndexController;
import Aerolinea.Domain.Paises;
import Aerolinea.Service.PaisesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class PaisesController {

    @Autowired
    private PaisesService paisesService;

    @GetMapping("/paises/listado")
    public String inicio(Model model) {
        var paises = paisesService.getPaises(false);
        model.addAttribute("paises", paises);
        return "index";
    }

    @GetMapping("/paises/nuevo")
    public String nuevoPaises(Paises paises) {
        return "modificarPaises";
    }

    @PostMapping("/paises/guardar")
    public String guardarPaises(Paises paises) {
        paisesService.save(paises);
        return "redirect:/paises/listado";
    }

    @GetMapping("/paises/modificar/{idPaises}")
    public String modificarPaises(Paises paises, Model model) {
        paises = paisesService.getPaises(paises);
        model.addAttribute("paises", paises);
        return "/paises/modificar/";
    }

    @GetMapping("/paises/eliminar/{idPaises}")
    public String eliminarPaises(Paises paises) {
        paisesService.delete(paises);
        return "redirect:/paises/listado";
    }
}


