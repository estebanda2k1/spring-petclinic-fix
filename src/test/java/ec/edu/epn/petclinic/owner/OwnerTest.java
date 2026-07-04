package ec.edu.epn.petclinic.owner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class OwnerTest {
    private Owner owner;

    @BeforeEach
    void setUp() {
        owner = new Owner();
        owner.setFirstName("Juan");
        owner.setLastName("Lopez");
        owner.setAddress("Av. Siempre Viva 123");
        owner.setCity("Quito");
        owner.setTelephone("0987654321");
    }

    // Caso 1: addPet solo agrega pets nuevos (sin id)
    @Test
    void whenPetIsNew_thenAddPetAddsIt() {
        Pet pet = new Pet();
        pet.setName("Firulais");
        // pet.id == null → isNew() == true

        owner.addPet(pet);

        assertThat(owner.getPets()).hasSize(1);
    }
}
