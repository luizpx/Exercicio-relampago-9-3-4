public class Funcionario extends Escolaridade {

    private Escolaridade escolaridade;
    private Departamento alocacao;
    private Filial coordenacao;

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getDescricaoEscolaridade() {
        if (escolaridade == null) {
            throw new NullPointerException("Funcionario sem escolaridade");
        }
        return escolaridade.getDescricao();
    }



    public Departamento getAlocacao() {
        return alocacao;
    }

    public void setAlocacao(Departamento alocacao) {
        this.alocacao = alocacao;
    }

    public String getPaisAlocacaoFuncionario() {
        if (alocacao == null) {
            throw new NullPointerException("Sem País");
        }
        return alocacao.getPaisSede();
    }



    public Filial getCoordenacao() {
        return coordenacao;
    }

    public void setCoordenacao(Filial coordenacao) {
        this.coordenacao = coordenacao;
    }

    public String getEstadoFilialFuncionario() {
        if (coordenacao == null) {
            throw new NullPointerException("Filial sem Estado");
        }
        return coordenacao.getNomeEstado();
    }


}
