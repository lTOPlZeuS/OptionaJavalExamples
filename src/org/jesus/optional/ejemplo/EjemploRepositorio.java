package org.jesus.optional.ejemplo;

import org.jesus.optional.ejemplo.models.Computador;
import org.jesus.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.jesus.optional.ejemplo.repositorio.Repositorio;

public class EjemploRepositorio {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        repositorio.filtrar("rog").ifPresentOrElse(System.out::println,
                () -> System.out.println("No se encontró"));

        //Optional<Computador> pc = repositorio.filtrar("asus rog");

        /*if(pc.isPresent()) {
            System.out.println(pc.get());
        } else {
            System.out.println("No se encontró");
        }*/
    }
}
