package funcao;

public class Cliente {

    private String name;

    private String dataDeInclusao;

    private String estado;

    public Cliente(String name, String dataDeInclusao, String estado) {
        this.name = name;
        this.dataDeInclusao = dataDeInclusao;
        this.estado = estado;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDataDeInclusao() {
        return dataDeInclusao;
    }

    public void setDataDeInclusao(String dataDeInclusao) {
        this.dataDeInclusao = dataDeInclusao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
