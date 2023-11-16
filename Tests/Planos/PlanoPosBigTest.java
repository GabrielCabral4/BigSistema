package Planos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanoPosBigTest {
    PlanoPosBig planoPosBig;
    @BeforeEach
    void setUp() {
        planoPosBig = new PlanoPosBig("Plano PosBig de Teste", "357159842", "2589631471", 14);
    }

    @Test
    void calculaPreco() {
        assertEquals(100,planoPosBig.calculaPreco(5, 20));
    }
}