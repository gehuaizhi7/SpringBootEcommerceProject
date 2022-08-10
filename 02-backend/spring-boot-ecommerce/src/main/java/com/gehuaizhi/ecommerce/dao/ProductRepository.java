package com.gehuaizhi.ecommerce.dao;

import com.gehuaizhi.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
