package com.prueba.altiorajonathan.repository;

import com.prueba.altiorajonathan.entity.Client;
import com.prueba.altiorajonathan.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, UUID> {

    Optional<Orders> findByIdOrder(UUID idOrder);

    @Query(nativeQuery = true,
    value = "select o.date_created, p.code, p.\"name\", p.price_unit from orders o " +
            "join client c on c.id_client = o.id_client " +
            "join product p on p.id = o.id_product " +
            "where c.id_client = :idClient")
    List<Object[]> getOrderClient(@Param("idClient") UUID idClient);
}
