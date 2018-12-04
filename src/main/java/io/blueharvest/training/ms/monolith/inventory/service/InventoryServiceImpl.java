package io.blueharvest.training.ms.monolith.inventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.blueharvest.training.ms.monolith.inventory.data.ProductRepository;
import io.blueharvest.training.ms.monolith.inventory.domain.entity.Product;

@Service
class InventoryServiceImpl implements InventoryService {

    private final ProductRepository productRepository;

    @Autowired
    public InventoryServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void add(Product product) {
        productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

}
