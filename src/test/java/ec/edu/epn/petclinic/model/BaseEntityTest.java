package ec.edu.epn.petclinic.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BaseEntityTest {

    //Caso 1 entidad nueva sin id, el isNew debe ser verdadero
    @Test
    public void whenIdIsNull_thenIsNew(){
        BaseEntity entity = new BaseEntity();
        assert(entity.isNew());
    }

    // Caso 2: Entidad con id asignado → isNew() debe ser false
    @Test
    void whenIdIsSet_thenIsNotNew() {
        BaseEntity entity = new BaseEntity();
        entity.setId(1);
        assertThat(entity.isNew()).isFalse();
    }

    // Caso 3: getId retorna el valor asignado correctamente
    @Test
    void whenIdIsSet_thenGetIdReturnsCorrectValue() {
        BaseEntity entity = new BaseEntity();
        entity.setId(42);
        assertThat(entity.getId()).isEqualTo(42);
    }
}
