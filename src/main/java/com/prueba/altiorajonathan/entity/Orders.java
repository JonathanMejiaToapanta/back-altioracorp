package com.prueba.altiorajonathan.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orders")
@EqualsAndHashCode(of ="id")
@Builder
@ToString
public class Orders {

    @Id
    @GeneratedValue
    private UUID idOrder;

    private UUID idClient;
    private UUID idProduct;
    private Date dateCreated;
}
