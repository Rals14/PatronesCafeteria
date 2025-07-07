package BebidaBuilder;

import BebidaDecorator.AzucarDecorator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

class AzucarDecoratorTest {

    @Test
    void testAzucarDecoratorAddsSugar() {
       Barista barista = new Barista();
        Bebida bebida = barista.hacerBebida(new BebidaCafeBuilder());

        // Decorar la bebida con azúcar
        Bebida bebidaConAzucar = new AzucarDecorator(bebida);

        // Verificar que la bebida contenga azúcar
        assertTrue(bebidaConAzucar.toString().contains("azúcar"));

        // Verificar que los otros ingredientes de la bebida original se mantengan
        assertTrue(bebidaConAzucar.toString().contains("café molido"));

    }
}
