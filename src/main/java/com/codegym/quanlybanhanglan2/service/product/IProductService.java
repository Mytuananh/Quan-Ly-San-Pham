package com.codegym.quanlybanhanglan2.service.product;

import com.codegym.quanlybanhanglan2.model.Product;
import com.codegym.quanlybanhanglan2.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IProductService extends IGeneralService<Product> {
    Page<Product> findAll(Pageable pageable);
    Iterable<Product> findProductByName(String name);
}
