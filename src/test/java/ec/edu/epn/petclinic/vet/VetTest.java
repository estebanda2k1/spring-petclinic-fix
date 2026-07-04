package ec.edu.epn.petclinic.vet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class VetTest {
    private Vet vet;

    @BeforeEach
    void setUp()
    {
        vet = new Vet();
        vet.setFirstName("John");
        vet.setLastName("Doe");
    }

    // Caso 1: Vet sin especialidades → getNrOfSpecialties retorna 0
    @Test
    void whenNoSpecialties_thenNrOfSpecialtiesIsZero() {
        assertThat(vet.getNrOfSpecialties()).isEqualTo(0);
    }
}
