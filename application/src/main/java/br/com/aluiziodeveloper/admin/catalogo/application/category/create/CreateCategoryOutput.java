package br.com.aluiziodeveloper.admin.catalogo.application.category.create;

import br.com.aluiziodeveloper.admin.catalogo.domain.category.Category;
import br.com.aluiziodeveloper.admin.catalogo.domain.category.CategoryID;

public record CreateCategoryOutput(
        CategoryID id
) {

    public static CreateCategoryOutput from(final Category aCategory) {
        return new CreateCategoryOutput(aCategory.getId());
    }
}
