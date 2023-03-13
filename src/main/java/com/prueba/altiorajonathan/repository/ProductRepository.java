package com.prueba.altiorajonathan.repository;

import com.prueba.altiorajonathan.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {

    Optional<Product> findById(UUID id);

    @Query(nativeQuery = true,
    value = "select cast(p.id as varchar) id, p.code, p.name, p.price_unit from product p where p.id = :id")
    List<Object[]> findByIds(@Param("id") UUID id);

}
