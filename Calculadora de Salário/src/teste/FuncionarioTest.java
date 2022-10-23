package teste;

import funcao.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class FuncionarioTest {

    private Funcionario funcionario1;
    private Funcionario funcionario2;

    @BeforeEach
    void beforeTest(){
        this.funcionario1 = new Funcionario("Mike Wazowski","mike.wazowski@ccc.ufcg.edu.br","Desenvolvedor",4567);
        this.funcionario2 = new Funcionario("James P. Sullivan","james.sullivan@ccc.ufcg.edu.br","Desenvolvedor",2459);
    }

    @Test
    void testeTest(){
        Assertions.assertTrue(this.funcionario1.getFunciona());
    }

    @Test
    void assertNomeTest() {Assertions.assertEquals("Mike Wazowski", this.funcionario1.getNome());}

    @Test
    void assertEmailTest() {Assertions.assertEquals("mike.wazowski@ccc.ufcg.edu.br", this.funcionario1.getEmail());}

    @Test
    void assertSalarioBaseTest() {Assertions.assertEquals(4567,this.funcionario1.getSalarioBase());}

    @Test
    void assertCargo() {Assertions.assertEquals("Desenvolvedor", this.funcionario1.getCargo());}

    @Test
    void assertSalarioLiquidoDesenvolvedor() {
        Assertions.assertEquals(3653.6,this.funcionario1.calculaLiquido());
        Assertions.assertEquals(1967.2, this.funcionario2.getSalarioLiquido());
    }
    
}