package edu.sabanciuniv.exchangecurrency.model.dto;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RateRequest {

    private String target;
    private String source;
}
