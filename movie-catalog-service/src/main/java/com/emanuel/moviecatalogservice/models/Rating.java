package com.emanuel.moviecatalogservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
public class Rating {
    private String movieId;
    private int rating;
}
