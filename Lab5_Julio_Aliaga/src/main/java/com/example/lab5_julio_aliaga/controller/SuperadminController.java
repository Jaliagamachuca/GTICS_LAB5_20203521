package com.example.lab5_julio_aliaga.controller;

import com.example.lab5_julio_aliaga.entity.Medicamentos;
import com.example.lab5_julio_aliaga.repository.MedicamentosRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("")
public class SuperadminController {

    final
    MedicamentosRepository medicamentosRepository;


    public SuperadminController(MedicamentosRepository medicamentosRepository
                                ) {

        this.medicamentosRepository = medicamentosRepository;

    }
    @GetMapping("")
    public String Plantilla() {
        return "Plantilla";
    }

    @GetMapping("/Medicamentos")
    public String BuscarMedicamentos(Model model) {
        List<Medicamentos> lista = medicamentosRepository.findAll();
        model.addAttribute("listTransportation", lista);
        return "/Plantilla_Vista_Medicamentos";
    }


}
