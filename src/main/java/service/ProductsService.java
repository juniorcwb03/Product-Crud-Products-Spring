package service;


import entily.Products;

import java.util.List;


public interface ProductsService {
    Products saveProducts(Products products);

    List<Products> fetchProductsList();


    Products updateProducts(Products products,
                            Long ProductsId);

    void deleteProductsById(Long ProductsId);
}
