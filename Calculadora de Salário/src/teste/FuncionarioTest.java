package teste;

import funcao.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class FuncionarioTest {

    private Funcionario funcionario1;
    private Funcionario funcionario2;
    private Funcionario funcionario3;
    private Funcionario funcionario4;

    @BeforeEach
    void beforeTest(){
        this.funcionario1 = new Funcionario("Mike Wazowski","mike.wazowski@ccc.ufcg.edu.br","DESENVOLVEDOR",4567);
        this.funcionario2 = new Funcionario("James P. Sullivan","james.sullivan@ccc.ufcg.edu.br","DESENVOLVEDOR",2459);
        this.funcionario3 = new Funcionario("George Sanderson","george.sanderson@ccc.ufcg.edu.br","DBA",2987);
        this.funcionario4 = new Funcionario("Celia Mae","celia.mae@ccc.ufcg.edu.br","DBA",1567);
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
        Assertions.assertEquals(3653.6, this.funcionario1.getSalarioLiquido());     // Desenvolvedor com salário maior ou igual a 3000
        Assertions.assertEquals(2213.1, this.funcionario2.getSalarioLiquido());     // Desenvolvedor com salário menor que 3000
    }

    @Test
    void assertSalarioLiquidoDba() {
        Assertions.assertEquals(2240.2, this.funcionario3.getSalarioLiquido());     // DBA com salário maior ou igual a 2000
        Assertions.assertEquals(1331.9, this.funcionario4.getSalarioLiquido());     // DBA com salário menor que 2000
    }

}