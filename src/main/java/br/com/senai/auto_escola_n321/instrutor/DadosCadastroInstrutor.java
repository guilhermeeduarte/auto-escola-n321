package br.com.senai.auto_escola_n321.instrutor;

import br.com.senai.auto_escola_n321.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroInstrutor(

        @NotBlank
        String nome,

        @NotBlank
        @Email
        String email,

        @NotBlank
        @Pattern(regexp = "\\d{9,11}")
        String cnh,

        @NotNull
        @Pattern(regexp = "[A-Z].")
        Especialidade especialidade,

        @NotNull
        @Valid
        DadosEndereco endereco) {

}