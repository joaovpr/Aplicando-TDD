package funcao;

public class Fatura {

    private String codigo;

    private double valor;

    private String data;

    private Cliente cliente;

    public Fatura(String codigo, double valor, String data, Cliente cliente) throws Exception {
        if(codigo == null || data == null || cliente == null){
            throw new Exception("Variable can't be null");
        }
        else if(valor < 0 ){
            throw new Exception("Valor can't be negative");
        }
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

    public Cliente getCliente() {
        return cliente;
    }
}
