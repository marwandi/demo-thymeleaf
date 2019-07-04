package repository;

import entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("productRepository")
public interface ProductRepository extends CrudRepository<ProductEntity, Integer> {
    public ProductEntity findById(String id);
}
