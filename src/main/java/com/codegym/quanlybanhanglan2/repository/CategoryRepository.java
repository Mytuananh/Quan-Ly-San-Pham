package com.codegym.quanlybanhanglan2.repository;

import com.codegym.quanlybanhanglan2.model.Category;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends PagingAndSortingRepository<Category, Long> {
}
