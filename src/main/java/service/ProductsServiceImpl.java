package service;

import entily.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ProductsRepository;

import java.util.List;
import java.util.Objects;

@Service

public class ProductsServiceImpl implements ProductsService {

    @Autowired
    private ProductsRepository productsRepository;


    @Override
    public Products saveProducts(Products products) {
        return productsRepository.save(products);
    }

    @Override
    public List<Products> fetchProductsList() {
        return (List<Products>)
                productsRepository.findAll();
    }

    @Override
    public Products
    updateProducts(Products products,
                   Long ProductsId) {
        Products depDB
                = productsRepository.findById(ProductsId)
                .get();

        if (Objects.nonNull(products.getProductsName())
                && !"".equalsIgnoreCase(
                products.getProductsName())) {
            depDB.setProductsName(
                    products.getProductsName());
        }

        if (Objects.nonNull(
                products.getProductsCategory())
                && !"".equalsIgnoreCase(
                products.getProductsCategory())) {
            depDB.setProductsCategory(
                    products.getProductsCategory());
        }

        if (Objects.nonNull(products.getProductsQtd())
                && !"".equalsIgnoreCase(
                products.getProductsQtd())) {
            depDB.setProductsQtd(
                    products.getProductsQtd());
        }

        if (Objects.nonNull(products.getProductsPrice())
                && !"".equalsIgnoreCase(
                products.getProductsPrice())) {
            depDB.setProductsPrice(
                    products.getProductsPrice());
        }

        return productsRepository.save(depDB);
    }

    @Override
    public void deleteProductsById(Long productsId) {
        productsRepository.deleteById(productsId);
    }
}
