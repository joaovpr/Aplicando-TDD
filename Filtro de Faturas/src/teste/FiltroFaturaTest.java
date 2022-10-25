package teste;

import funcao.Cliente;
import funcao.Fatura;
import funcao.FiltroFatura;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FiltroFaturaTest {

    private FiltroFatura filtroFatura;

    @BeforeEach
    void beforeTest() throws Exception {
        List<Fatura> faturas = new ArrayList<>();

        Cliente cliente1 = new Cliente("Arthur", "23/10/2022", "Paraiba");
        Fatura fatura1 = new Fatura("123", 20.0, "23/10/2022", cliente1);

        Cliente cliente2 = new Cliente("Gustavo", "23/09/2022", "Paraiba");
        Fatura fatura2 = new Fatura("123", 2000.0, "23/09/2022", cliente2);

        Cliente cliente3 = new Cliente("Joao", "23/08/2022", "Paraiba");
        Fatura fatura3 = new Fatura("123", 2500.0, "23/08/2022", cliente3);

        Cliente cliente4 = new Cliente("Caio", "23/07/2022", "Paraná");
        Fatura fatura4 = new Fatura("123", 4001.0, "23/07/2022", cliente4);

        Cliente cliente5 = new Cliente("Klebin", "23/07/2022", "Rio Grande do Sul");
        Fatura fatura5 = new Fatura("123", 4002.0, "23/07/2022", cliente5);

        Cliente cliente6 = new Cliente("Mariana", "23/07/2022", "Santa Catarina");
        Fatura fatura6 = new Fatura("123", 4003.0, "23/07/2022", cliente6);

        Cliente cliente7 = new Cliente("Maria", "23/10/2022", "Paraiba");
        Fatura fatura7 = new Fatura("123", 2000.0, "23/10/2022", cliente7);

        faturas.add(fatura1);
        faturas.add(fatura2);
        faturas.add(fatura3);
        faturas.add(fatura4);
        faturas.add(fatura5);
        faturas.add(fatura6);
        faturas.add(fatura7);

        this.filtroFatura = new FiltroFatura(faturas);
    }

    @Test
    void filtroFatura() {
        Assertions.assertEquals(1, this.filtroFatura.aplicaFiltroFatura().size());
    }
}
