package Planos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanoPreBigTest {
    PlanoPreBig planoPreBig;
    @BeforeEach
    void setUp() {
        planoPreBig = new PlanoPreBig("Plano PreBig de Teste", "654987321", "0159632481", 10, 8, 6);
    }

    @Test
    void calculaPreco() {
        assertEquals(40, planoPreBig.calculaPreco(1, 2, 3));
    }
}