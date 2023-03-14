package com.prueba.altiorajonathan.presenter;

import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(of = "id")
public class ProductPresenter {

    private UUID id;
    private String code;
    private String name;
    private BigDecimal priceUnit;
    private BigDecimal stock;

}
