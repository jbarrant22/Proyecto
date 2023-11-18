package Aerolinea.IndexController;

import Aerolinea.Domain.Tripulacion;
import Aerolinea.Service.TripulacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TripulacionController {

    @Autowired
    private TripulacionService tripulacionService;

    @GetMapping("/tripulacion/listado")
    public String inicio(Model model) {
        var tripulacion = tripulacionService.getTripulacions();
        model.addAttribute("tripulacion", tripulacion);
        return "index";
    }

    @GetMapping("/tripulacion/nuevo")
    public String nuevoTripulacion(Tripulacion tripulacion) {
        return "modificarTripulacion";
    }

    @PostMapping("/tripulacion/guardar")
    public String guardarTripulacion(Tripulacion tripulacion) {
        tripulacionService.save(tripulacion);
        return "redirect:/tripulacion/listado";
    }

    @GetMapping("/tripulacion/modificar/{idTripulacion}")
    public String modificarTripulacion(Tripulacion tripulacion, Model model) {
        tripulacion = tripulacionService.getTripulacion(tripulacion);
        model.addAttribute("tripulacion", tripulacion);
        return "/tripulacion/modificar/";
    }

    @GetMapping("/tripulacion/eliminar/{idTripulacion}")
    public String eliminarTripulacion(Tripulacion tripulacion) {
        tripulacionService.delete(tripulacion);
        return "redirect:/tripulacion/listado";
    }
}
