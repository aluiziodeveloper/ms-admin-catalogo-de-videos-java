package br.com.aluiziodeveloper.admin.catalogo.application.category.delete;

import br.com.aluiziodeveloper.admin.catalogo.domain.category.Category;
import br.com.aluiziodeveloper.admin.catalogo.domain.category.CategoryGateway;
import br.com.aluiziodeveloper.admin.catalogo.domain.category.CategoryID;
import br.com.aluiziodeveloper.admin.catalogo.domain.exceptions.DomainException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;

@ExtendWith(MockitoExtension.class)
public class DeleteCategoryUseCaseTest {

    @InjectMocks
    private DefaultDeleteCategoryUseCase useCase;

    @Mock
    private CategoryGateway categoryGateway;

    @BeforeEach
    void cleanUp() {
        Mockito.reset(categoryGateway, useCase);
    }

    @Test
    public void givenAValidCategoryId_whenCallsDeleteCategory_shouldBeOK() {
        final var aCategory = Category.newCategory("Filmes", "A categoria mais assistida", true);

        final var expectedId = aCategory.getId();

        Assertions.assertDoesNotThrow(() -> useCase.execute(expectedId.getValue()));

        Mockito.verify(categoryGateway, times(1)).deleteById(eq(expectedId));
    }

    @Test
    public void givenAInvalidCategoryId_whenCallsDeleteCategory_shouldThrowsNotFound() {
        final var expectedId = CategoryID.from("123");

        Assertions.assertThrows(DomainException.class, () -> useCase.execute(expectedId.getValue()));

        Mockito.verify(categoryGateway, times(1)).deleteById(eq(expectedId));
    }
}