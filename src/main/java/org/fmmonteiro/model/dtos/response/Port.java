package org.fmmonteiro.model.dtos.response;

import lombok.Builder;

@Builder
public record Port(String name, String flagUrl) {
}
