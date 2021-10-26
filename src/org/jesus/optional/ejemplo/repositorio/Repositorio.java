package org.jesus.optional.ejemplo.repositorio;

import org.jesus.optional.ejemplo.models.Computador;

import java.util.Optional;

public interface Repositorio<T> {

    Optional<Computador> filtrar(String nombre);

}
