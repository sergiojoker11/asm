/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sj11.asm.controllers;

import sj11.asm.entities.Formato;
import sj11.asm.entities.Producto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import sj11.asm.repositories.ProductoRepository;

/**
 *
 * @author SeRGiO11
 */
@Controller
public class ProductoController {

    @Autowired
    ProductoRepository productoRepository;

    /*@ModelAttribute("allProductos")
    public List<Producto> getProductos() {
        return productoRepositorio.dameProductos();
    }*/
    @RequestMapping({"/", "/index"})
    public String showSeedstarters() {
        return "index";
    }

    @RequestMapping("/insert")
    public String create() {

        Formato y1 = new Formato("1KG");
        Formato y2 = new Formato("2KG");
        Formato y3 = new Formato("3KG");
        Formato y4 = new Formato("4KG");
        Formato y5 = new Formato("5KG");
        Formato y6 = new Formato("6KG");
        Formato y7 = new Formato("7KG");
        Formato y8 = new Formato("8KG");
        List<Formato> listaFormatos1 = new ArrayList<>();
        List<Formato> listaFormatos2 = new ArrayList<>();
        listaFormatos1.add(y1);
        listaFormatos1.add(y2);
        listaFormatos1.add(y3);
        listaFormatos1.add(y4);
        listaFormatos1.add(y5);
        listaFormatos2.add(y6);
        listaFormatos2.add(y7);
        listaFormatos2.add(y8);
        Producto x1 = new Producto("Mierda");
        Producto x2 = new Producto("Polla");
        List<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(x1);
        listaProductos.add(x2);

        productoRepository.save(x1);
        return "menu";
    }
}
