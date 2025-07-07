package BebidaBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BebidaCafeBuilderTest {

    @Test
    void testCafeBuilderCreatesCafe() {
        Barista barista = new Barista();
        Bebida cafe = barista.hacerBebida(new BebidaCafeBuilder());

        // Verificar que la bebida creada no sea nula y contenga "café molido"
        assertNotNull(cafe);
        assertTrue(cafe.toString().contains("café molido"));
    }
}
