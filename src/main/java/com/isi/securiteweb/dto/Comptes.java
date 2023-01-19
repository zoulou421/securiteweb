package com.isi.securiteweb.dto;


import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comptes {
    private int id;
 
    @NotNull(message = "le username ne doit pas être null")
    private String username;
    @NotNull(message = "le mot de passe ne doit pas être null")
    private String password;
    @NotNull
    private int etat;
}
