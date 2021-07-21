import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveRetornarEstadoFilialFuncionario() {
        Funcionario funcionario = new Funcionario();
        Filial filial = new Filial();
        Cidade cidade = new Cidade();
        Estado estado = new Estado();

        funcionario.setCoordenacao(filial);
        filial.setNomeCidade("Juiz de Fora");
        filial.setNomeEstado("MG");

        assertEquals("MG", funcionario.getEstadoFilialFuncionario());

    }

    @Test
    void deveRetornarPaisAlocacaoFuncionario() {
        Funcionario funcionario = new Funcionario();
        Departamento departamento = new Departamento();
        Empresa empresa = new Empresa();
        Grupo grupo = new Grupo();
        Pais pais = new Pais();
        pais.setNomePais("BR");

        funcionario.setAlocacao(departamento);
        departamento.setEmpresa(grupo);
        grupo.setSede(pais);


        assertEquals("BR", funcionario.getPaisAlocacaoFuncionario());

    }

}