package teste;

import funcao.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class FuncionarioTest {

    private Funcionario newFuncionario;

    @BeforeEach
    void beforeTest(){
        this.newFuncionario = new Funcionario();
    }

    @Test
    void testeTest(){
        Assertions.assertTrue(this.newFuncionario.getFunciona());
    }

    @Test
    void assertNomeTest() {Assertions.assertEquals("Mike Wazowski", this.newFuncionario.getName());}

    @Test
    void assertEmailTest() {Assertions.assertEquals("mike.wazowski@ccc.ufcg.edu.br", this.newFuncionario.getEmail());}

    @Test
    void assertSalarioBaseTest() {Assertions.assertEquals(4567,this.newFuncionario.getSalarioBase());}

    @Test
    void assertCargo() {Assertions.assertEquals("Desenvolvedor", this.newFuncionario.getSalarioBase());}
}