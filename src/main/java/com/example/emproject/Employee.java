package com.example.emproject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private long id;
    private String name;
    private String phone;
    private String email;
}
     