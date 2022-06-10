/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.controller;

import com.tienda.entity.Persona;
import com.tienda.service.IPersonaInterface;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonaController {

    //2:28
    @Autowired
    private IPersonaInterface personaInterface;//No era interface era service 

    @GetMapping("/persona")//Definir url a utilizar, ejecuta lo de abajo
    public String index(Model model) {
        List<Persona> listaPersona = personaInterface.getAllPersona();
        model.addAttribute("titulo", "Tabla Personas");
        model.addAttribute("personas", listaPersona);
        return "personas";
    }

}
