package com.isi.securiteweb.dto;


import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Droits {

    private int id;
    @NotNull(message = "le nom  du droit ne doit pas être null")
    private String nom;


}
