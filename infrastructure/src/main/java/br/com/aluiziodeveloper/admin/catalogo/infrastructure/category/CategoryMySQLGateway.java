package br.com.aluiziodeveloper.admin.catalogo.infrastructure.category;

import br.com.aluiziodeveloper.admin.catalogo.domain.category.Category;
import br.com.aluiziodeveloper.admin.catalogo.domain.category.CategoryGateway;
import br.com.aluiziodeveloper.admin.catalogo.domain.category.CategoryID;
import br.com.aluiziodeveloper.admin.catalogo.domain.category.CategorySearchQuery;
import br.com.aluiziodeveloper.admin.catalogo.domain.pagination.Pagination;
import br.com.aluiziodeveloper.admin.catalogo.infrastructure.category.persistence.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryMySQLGateway implements CategoryGateway {

    private final CategoryRepository repository;

    public CategoryMySQLGateway(final CategoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public Category create(Category aCategory) {
        return null;
    }

    @Override
    public void deleteById(CategoryID anId) {

    }

    @Override
    public Optional<Category> findById(CategoryID anId) {
        return Optional.empty();
    }

    @Override
    public Category update(Category aCategory) {
        return null;
    }

    @Override
    public Pagination<Category> findAll(CategorySearchQuery aQuery) {
        return null;
    }
}