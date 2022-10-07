package controller;

import entily.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.ProductsService;

import java.util.List;


@RestController

public class ProductsController {

    @Autowired
    private ProductsService productsService;


    @PostMapping("/products")
    public Products saveProducts(
            @RequestBody Products products) {
        return productsService.saveProducts(products);
    }

    @GetMapping("/products")
    public List<Products> fetchProductsList() {
        return productsService.fetchProductsList();
    }

    @PutMapping("/products/{id}")
    public Products
    updateProducts(@RequestBody Products products,
                   @PathVariable("id") Long productsId) {
        return productsService.updateProducts(
                products, productsId);
    }

    @DeleteMapping("/products/{id}")
    public String deleteProductsById(@PathVariable("id")
                                     Long productsId) {
        productsService.deleteProductsById(
                productsId);
        return "Deleted Successfully";
    }
}
