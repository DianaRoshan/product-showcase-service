package com.delivery.controller;

import com.delivery.entity.View;
import com.delivery.service.ViewService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/product-showcase/view")
public class ViewController {
    private final ViewService viewService;

    public ViewController(ViewService viewService) {
        this.viewService = viewService;
    }

    @GetMapping
    public List<View> showAllProducts(){
        return viewService.showAllProducts();
    }

}
