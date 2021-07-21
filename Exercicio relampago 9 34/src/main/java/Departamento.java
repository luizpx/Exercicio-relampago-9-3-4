public class Departamento extends Empresa{

    private Empresa empresa;
    private Funcionario chefe;

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Funcionario getChefe() {
        return chefe;
    }

    public void setChefe(Funcionario chefe) {
        this.chefe = chefe;
    }

    public String getDescricaoEscolaridadeChefe() {
        if (chefe == null) {
            throw new NullPointerException("Sem chefe");
        }
        return chefe.getDescricaoEscolaridade();
    }

}
