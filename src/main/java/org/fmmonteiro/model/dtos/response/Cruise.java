package org.fmmonteiro.model.dtos.response;

import lombok.Builder;

@Builder
public record Cruise(String shipName, int passengerCapacity, String avatarUrl) {

}
