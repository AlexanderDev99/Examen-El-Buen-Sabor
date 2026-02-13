package com.elbuensabor.usuario.data.entities.db;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "usuarios")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioEntityDb {

    @Id
    private String id;

    private String nombreUsuario;
    private String apellidoUsuario;
    private String emailUsuario;
    private String passwordUsuario;
}
