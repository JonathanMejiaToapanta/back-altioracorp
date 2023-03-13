package com.prueba.altiorajonathan.repository;

import com.prueba.altiorajonathan.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ClientRepository extends JpaRepository<Client, UUID> {

    Optional<Client> findByIdClient(UUID idClient);

    @Transactional
    void deleteByIdClient(UUID idClient);
}
