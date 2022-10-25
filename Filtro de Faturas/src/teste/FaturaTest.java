package teste;

import funcao.Cliente;
import funcao.Fatura;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class FaturaTest {

    private Fatura faturaAttributesTest;

    @BeforeEach
    void beforeTest() throws Exception {
        Cliente cliente = new Cliente("Arthur", "23/10/2022", "Paraiba");
        this.faturaAttributesTest = new Fatura("123", 20.0, "23/10/2022", cliente);
    }

    @Test
    void assertAttributesTest() {
        Assertions.assertNotNull(this.faturaAttributesTest.getCodigo());
        Assertions.assertNotNull(this.faturaAttributesTest.getValor());
        Assertions.assertNotNull(this.faturaAttributesTest.getData());
        Assertions.assertNotNull(this.faturaAttributesTest.getCliente());

        // Validações de Atributos
        try {
            this.faturaAttributesTest = new Fatura(null, 20.0, "23/10/2022", this.faturaAttributesTest.getCliente());
        } catch (Exception e) {
            Assertions.assertEquals(e.getMessage(), "Variable can't be null");
        }
        try {
            this.faturaAttributesTest = new Fatura("123", -1, "23/10/2022", this.faturaAttributesTest.getCliente());
        } catch (Exception e) {
            Assertions.assertEquals(e.getMessage(), "Valor can't be negative");
        }
        try {
            this.faturaAttributesTest = new Fatura("123", 20.0, null, this.faturaAttributesTest.getCliente());
        } catch (Exception e) {
            Assertions.assertEquals(e.getMessage(), "Variable can't be null");
        }
        try {
            this.faturaAttributesTest = new Fatura("123", 20.0, "23/10/2022", null);
        } catch (Exception e) {
            Assertions.assertEquals(e.getMessage(), "Variable can't be null");
        }

        // Verifica data inválida
        try{
            this.faturaAttributesTest = new Fatura("123", 20.0, "31/02/2016",  this.faturaAttributesTest.getCliente());
        } catch (Exception e) {
            Assertions.assertEquals(e.getMessage(), "Data inválida");
        }
    }
}