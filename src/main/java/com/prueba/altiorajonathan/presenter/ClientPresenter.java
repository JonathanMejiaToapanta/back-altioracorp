package com.prueba.altiorajonathan.presenter;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(of = "idClient")
public class ClientPresenter {

    private UUID idClient;
    private String name;
    private  String lastName;

}
