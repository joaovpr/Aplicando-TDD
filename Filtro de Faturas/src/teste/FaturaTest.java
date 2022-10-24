package teste;

import funcao.Fatura;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class FaturaTest {

    private Fatura faturaAttributesTest;

    @BeforeEach
    void beforeTest(){
        this.faturaAttributesTest = new Fatura("123", 20.0, "23/10/2022", "Arthur");
    }

    @Test
    void assertAttributesTest(){
        Assertions.assertNotNull(this.faturaAttributesTest.getCodigo());
        Assertions.assertNotNull(this.faturaAttributesTest.getValor());
        Assertions.assertNotNull(this.faturaAttributesTest.getData());
        Assertions.assertNotNull(this.faturaAttributesTest.getCliente());
    }
}