package org.fmmonteiro.model.dtos.response;

import lombok.Builder;

@Builder
public record UpcomingShip(String name, String companyAvatarUrl, String expectedDate) {
}
