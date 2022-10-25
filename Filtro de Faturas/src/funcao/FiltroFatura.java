package funcao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class FiltroFatura {

    private static final String[] estados = {"Paraná", "Rio Grande do Sul", "Santa Catarina"};

    private List<Fatura> faturas;

    public FiltroFatura(List<Fatura> faturas) {
        this.faturas = faturas;
    }

    public List<Fatura> aplicaFiltroFatura(){
        List<Fatura> filtroFaturas = new ArrayList<>();
        for (Fatura fatura: this.faturas) {
            if(verificaUmMês(fatura.getData())){
                continue;
            }
            if (verificaDoisMêses(fatura.getData())){
                continue;
            }
            if (verificaSeEDoSul(fatura.getCliente())){
                continue;
            }
            if (fatura.getValor() < 2000.0){
                continue;
            }
            filtroFaturas.add(fatura);
        }

        return filtroFaturas;
    }

    private boolean verificaSeEDoSul(Cliente cliente){
        for (String estado: estados) {
            if(estado.equals(cliente.getEstado())){
                return true;
            }
        }
        return false;
    }

    private boolean verificaUmMês(String data){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataVerificada = LocalDate.parse(data, dtf);
        LocalDate date = LocalDate.now().minusDays(30);
        return dataVerificada.compareTo(date) <= 0;
    }

    private boolean verificaDoisMêses(String data){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataVerificada = LocalDate.parse(data, dtf);
        LocalDate date = LocalDate.now().minusDays(60);
        return dataVerificada.compareTo(date) <= 0;
    }

    public List<Fatura> getFaturas() {
        return faturas;
    }

    public void setFaturas(List<Fatura> faturas) {
        this.faturas = faturas;
    }
}
