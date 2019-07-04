package service;

import entity.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ProductRepository;

@Service("ProductService")
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Iterable<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public ProductEntity getProductEntityById(Integer id) {
        return productRepository.findOne(id);
    }

    @Override
    public ProductEntity saveProductEntity(ProductEntity productEntity) {
        return productRepository.save(productEntity);
    }

    @Override
    public void deleteProductEntity(Integer id) {
        productRepository.delete(id);
    }
}
