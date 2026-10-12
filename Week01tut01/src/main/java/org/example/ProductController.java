package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Product")
public class ProductController {

    //getting only the id
    @GetMapping("/{id}")
    public Product getById(@PathVariable("id")Long id){  //(@PathVariable Long id)
        return new Product(id, "Laptop", 999.99);
    }
}
