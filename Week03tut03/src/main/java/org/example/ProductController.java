package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return  productService.getAllProducts();
    }
    //getting only the id
    @GetMapping("/{id}")
    public Product getById(@PathVariable("id")Long id){  //(@PathVariable Long id)
        return new Product(id, "Laptop", 999.99);
    }
    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable Long id){
        return productService.getProductById(id).orElse(null);
    }
    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }
    @DeleteMapping("/products/(id)")
    public void deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
    }
    @GetMapping("/products/search")
    public List<Product> search(@RequestParam String name){
        return productService.findByName(name);
    }

}
