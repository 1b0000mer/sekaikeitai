package com.nnq.quanlydienthoai.DAO;

import com.nnq.quanlydienthoai.Model.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface ProductJpaRepository extends JpaRepository<Product,String> {
}



