package com.prueba.altiorajonathan.presenter;

import lombok.*;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(of = "id")
public class OrdersPresenter {
    private UUID idOrder;
    private UUID idClient;
    private UUID idProduct;
    private Date dateCreated;
}
