package com.codegym.quanlybanhanglan2.repository;

import com.codegym.quanlybanhanglan2.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
}
