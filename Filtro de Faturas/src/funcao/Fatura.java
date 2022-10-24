package funcao;

public class Fatura {

    private String codigo;

    private double valor;

    private String data;

    private String cliente;

    public Fatura(String codigo, double valor, String data, String cliente) {
        this.codigo = codigo;
        this.valor = valor;
        this.data = data;
        this.cliente = cliente;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getValor() {
        return valor;
    }

    public String getData() {
        return data;
    }

    public String getCliente() {
        return cliente;
    }
}
