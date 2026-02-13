package com.elbuensabor.usuario.data.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import com.elbuensabor.usuario.data.entities.db.UsuarioEntityDb;


public interface UsuarioRepository extends MongoRepository<UsuarioEntityDb, String> {


    
}