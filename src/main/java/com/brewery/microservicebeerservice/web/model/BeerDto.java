package com.brewery.microservicebeerservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
    private UUID    uuid;
    private Integer version;

    private String     beerName;
    private BeerStyle  beerStyle;
    private Long       universalProductCode;
    private BigDecimal price;
    private Integer    quantityOnHand;

    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
}