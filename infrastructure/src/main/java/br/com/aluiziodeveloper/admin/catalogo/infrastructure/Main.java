package br.com.aluiziodeveloper.admin.catalogo.infrastructure;

import br.com.aluiziodeveloper.admin.catalogo.application.UseCase;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello world!");
        System.out.println(new UseCase().execute());
    }
}