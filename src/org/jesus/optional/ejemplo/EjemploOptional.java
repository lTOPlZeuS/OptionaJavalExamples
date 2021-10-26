package org.jesus.optional.ejemplo;

import java.util.Optional;

public class EjemploOptional {
  public static void main(String[] args) {
    String nombre = "Jesus";
    Optional<String> opt = Optional.of(nombre);
    System.out.println(opt);
    System.out.println(opt.isPresent());
    System.out.println(opt.isEmpty());
    Optional<String> nombreOpcional = Optional.ofNullable(nombre);
    System.out.println(nombreOpcional);

    opt.ifPresent(System.out::println);

    nombre = null;
    // opt = Optional.of(nombre); //solo se utiliza cuando es 100% que no es null
    opt = Optional.ofNullable(nombre);
    System.out.println(opt);
    System.out.println(opt.isPresent());
    System.out.println(opt.isEmpty());
    opt.ifPresentOrElse(System.out::println, () -> System.out.println("No hay nombre"));
  }
}