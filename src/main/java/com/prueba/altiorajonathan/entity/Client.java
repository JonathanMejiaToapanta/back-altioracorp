package com.prueba.altiorajonathan.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "client")
@EqualsAndHashCode(of ="idClient")
@Builder
@ToString
public class Client {

    @Id
    @GeneratedValue
    private UUID idClient;
    private String name;
    private  String lastName;

}
