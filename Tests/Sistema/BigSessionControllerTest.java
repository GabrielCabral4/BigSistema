package Sistema;

import Planos.PlanoPosBig;
import Planos.PlanoPreBig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigSessionControllerTest {
    BigSessionController bigSessionController;
    PlanoPreBig planoPreBig;
    PlanoPosBig planoPosBig;
    @BeforeEach
    void setUp() {
        bigSessionController = new BigSessionController();
        planoPreBig = new PlanoPreBig("Plano PreBig de Teste", "654987321", "0159632481", 10, 8, 6);
        //+planoPosBig = new PlanoPosBig("Plano PosBig de Teste", "357159842", "2589631471", 14);
    }

    @Test
    void cadastrarPlanoPreBig() {
        assertEquals(1, bigSessionController.cadastrarPlanoPreBig("Plano do Ano", "135246684", "0123654695", 4, 4, 8));
    }

    @Test
    void cadastrarPlanoPosBig() {
        assertEquals(1, bigSessionController.cadastrarPlanoPosBig("Plano de Júlia","147852369", "752413659", 5));
    }

    @Test
    void valorAPagar() {
        bigSessionController.cadastrarPlanoPreBig("Plano de Testes", "123654879", "9517538462", 5, 52, 2);
        planoPreBig.calculaPreco(10, 8, 21);
        assertEquals(40, bigSessionController.valorAPagar(1, 21));
    }
    @Test
    void cadastrarAdicionalInternet() {
        assertEquals(1, bigSessionController.cadastrarAdicionalInternet("Plano de teste", 20));
    }

    @Test
    void cadastraAdicionalMusica() {
        assertEquals(1, bigSessionController.cadastraAdicionalMusica("Plano de teste", "Ouça música sem precisar de internet"));
    }

    @Test
    void setAdicional() {
    }
}