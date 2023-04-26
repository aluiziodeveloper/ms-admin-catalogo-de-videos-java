package br.com.aluiziodeveloper.admin.catalogo.application;

import br.com.aluiziodeveloper.admin.catalogo.domain.category.Category;

public class UseCase {
    public Category execute() {
        return Category.newCategory("Filmes", "Category description", true);
    }
}