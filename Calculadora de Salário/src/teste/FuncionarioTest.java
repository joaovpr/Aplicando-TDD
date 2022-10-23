package teste;

import funcao.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class FuncionarioTest {

    private Funcionario Funcionario1;

    @BeforeEach
    void beforeTest(){
        this.Funcionario1 = new Funcionario("Mike Wazowski","mike.wazowski@ccc.ufcg.edu.br","Desenvolvedor",4567);
    }

    @Test
    void testeTest(){
        Assertions.assertTrue(this.Funcionario1.getFunciona());
    }

    @Test
    void assertNomeTest() {Assertions.assertEquals("Mike Wazowski", this.Funcionario1.getNome());}

    @Test
    void assertEmailTest() {Assertions.assertEquals("mike.wazowski@ccc.ufcg.edu.br", this.Funcionario1.getEmail());}

    @Test
    void assertSalarioBaseTest() {Assertions.assertEquals(4567,this.Funcionario1.getSalarioBase());}

    @Test
    void assertCargo() {Assertions.assertEquals("Desenvolvedor", this.Funcionario1.getCargo());}
}