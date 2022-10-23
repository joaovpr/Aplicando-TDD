package teste;

import funcao.Aplicacao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class AplicacaoTest {

    private Aplicacao newCalculadora;

    @BeforeEach
    void beforeTest(){
        this.newCalculadora = new Aplicacao();
    }

    @Test
    void testeTest(){
        Assertions.assertTrue(this.newCalculadora.getFunciona());
    }

}