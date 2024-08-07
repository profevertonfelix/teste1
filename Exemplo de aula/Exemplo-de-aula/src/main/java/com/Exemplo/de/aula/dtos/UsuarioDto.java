package com.Exemplo.de.aula.dtos;

import jakarta.validation.constraints.NotBlank;

public record UsuarioDto(@NotBlank String nome, @NotBlank String email, @NotBlank String senha, @NotBlank String tipo) {

}
