package com.fomkin.testspringapp.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private String email;
    private int age;
}
