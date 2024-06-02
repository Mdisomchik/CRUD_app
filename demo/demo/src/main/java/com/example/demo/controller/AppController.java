package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AppController {
    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String showCars(Model model,
                           @RequestParam(value = "brand", required = false) String brand,
                           @RequestParam(value = "color", required = false) String color,
                           @RequestParam(value = "fuelType", required = false) String fuelType) {
        List<Product> carList;
        if ((brand != null && !brand.isEmpty()) || (color != null && !color.isEmpty()) || (fuelType != null && !fuelType.isEmpty())) {
            carList = productService.filterProducts(brand, color, fuelType);
        } else {
            carList = productService.listAll();
        }
        model.addAttribute("listProducts", carList);
        model.addAttribute("str", "List of Cars");
        return "index";
    }

    @GetMapping("/new")
    @Secured("ROLE_ADMIN")
    public String showNewCarForm(Model model) {
        Product car = new Product();
        model.addAttribute("car", car);
        return "edit_car";
    }

    @PostMapping("/save")
    @Secured("ROLE_ADMIN")
    public String saveCar(@ModelAttribute("car") Product car) {
        productService.save(car);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    @Secured("ROLE_ADMIN")
    public String showEditCarForm(@PathVariable("id") Long id, Model model) {
        Product car = productService.get(id);
        model.addAttribute("car", car);
        return "edit_car";
    }

    @GetMapping("/delete/{id}")
    @Secured("ROLE_ADMIN")
    public String deleteCar(@PathVariable("id") Long id) {
        productService.delete(id);
        return "redirect:/";
    }

    @GetMapping("/logout")
    public String logout() {
        return "redirect:/logout";
    }
}
