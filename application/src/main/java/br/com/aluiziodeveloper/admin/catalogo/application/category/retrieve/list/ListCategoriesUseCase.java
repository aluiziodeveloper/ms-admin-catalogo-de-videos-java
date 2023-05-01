package br.com.aluiziodeveloper.admin.catalogo.application.category.retrieve.list;

import br.com.aluiziodeveloper.admin.catalogo.application.UseCase;
import br.com.aluiziodeveloper.admin.catalogo.domain.category.CategorySearchQuery;
import br.com.aluiziodeveloper.admin.catalogo.domain.pagination.Pagination;

public abstract class ListCategoriesUseCase
        extends UseCase<CategorySearchQuery, Pagination<CategoryListOutput>> {
}