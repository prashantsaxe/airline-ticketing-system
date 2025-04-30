package com.rishi.airline.model.search;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

// search request model class
// This class is used to represent the search request for flights
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchRequest {
    private String source;
    private String destination;
    private String date;
}
