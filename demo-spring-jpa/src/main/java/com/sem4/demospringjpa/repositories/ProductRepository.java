package com.sem4.demospringjpa.repositories;

import com.sem4.demospringjpa.entities.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

    @Query("from Product where price >= :min and price <= :max")
    List<Product> findByPrice(@Param("min") double min, @Param("min") double max);

    @Query("from Product where name like:keyword%")
    List<Product> findNameStartWith(@Param("keyword")String keyword);

    @Query("from Product where name like %:keyword")
    List<Product> findNameEndWith(@Param("keyword")String keyword);

    @Query("from Product where name like %:keyword%")
    List<Product> findNameContains(@Param("keyword")String keyword);

    @Query(nativeQuery = true, value = "select * from product order by id desc limit :n offset 0")
    List<Product> findTopProduct(@Param(value = "name") int number);

    @Query("select sum(price * quantity) from Product ")
    Long sumQuantity();
}
