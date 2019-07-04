package service;


import entity.ProductEntity;

import javax.persistence.criteria.CriteriaBuilder;

public interface ProductService {
    Iterable<ProductEntity> getAllProducts();
    public ProductEntity getProductEntityById(Integer id);
    ProductEntity saveProductEntity (ProductEntity productEntity);
    void deleteProductEntity(Integer id);
}
