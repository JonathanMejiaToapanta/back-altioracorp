package com.prueba.altiorajonathan.presenter;

import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderByClient {
    private Date dateCreated;
    private String code;
    private String name;
    private BigDecimal priceUnit;
    private BigDecimal cant;
}
