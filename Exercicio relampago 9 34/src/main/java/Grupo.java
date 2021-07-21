public class Grupo extends Funcionario{

    private Pais sede;
    private Funcionario presidente;

    public Pais getSede() {
        return sede;
    }

    public void setSede(Pais sede) {
        this.sede = sede;
    }

    public String getPaisSede() {
        if (sede == null) {
            throw new NullPointerException("Sem Pais");
        }
        return sede.getNomePais();
    }


    public Funcionario getPresidente() {
        return presidente;
    }

    public void setPresidente(Funcionario presidente) {
        this.presidente = presidente;
    }

    public String getDescricaoEscolaridadePresidente() {
        if (presidente == null) {
            throw new NullPointerException("Sem presidente");
        }
        return presidente.getDescricaoEscolaridade();
    }
}
