package com.prueba.altiorajonathan.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "product")
@ToString
@EqualsAndHashCode(of = "id")
public class Product {

    @Id
    @GeneratedValue
    private UUID id;

    private String code;
    private String name;
    private BigDecimal priceUnit;
}
