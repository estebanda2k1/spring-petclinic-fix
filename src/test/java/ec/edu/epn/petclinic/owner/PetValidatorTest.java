package ec.edu.epn.petclinic.owner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PetValidatorTest {
    private PetValidator validator;
    private Pet pet;

    @BeforeEach
    void setup() {
        validator= new PetValidator();
        pet = new Pet();
    }

    // Caso 1: Pet completamente válido
    @Test
    void ValidPetTest() {
        pet.setName("Firu");
        pet.setBirthDate(LocalDate.of(2025, 1, 1));
        PetType type = new PetType();
        type.setName("Dog");
        pet.setType(type);

        Errors errors = new BeanPropertyBindingResult(pet, "pet");
        validator.validate(pet, errors);
        assertThat(errors.hasErrors()).isFalse();
    }
}
