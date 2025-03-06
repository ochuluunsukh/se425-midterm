package edu.miu.cs.cs544.oderdene.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Publisher {
    private Integer id;
    private String name;
    private String email;
}
