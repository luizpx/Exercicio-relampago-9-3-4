import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartamentoTest {

    @Test
    void deveRetornarEscolaridadeChefe() {
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setDescricao("Doutorado");

        Funcionario funcionario = new Funcionario();
        funcionario.setEscolaridade(escolaridade);

        Departamento departamento = new Departamento();
        departamento.setChefe(funcionario);

        assertEquals("Doutorado", funcionario.getDescricaoEscolaridade());
    }

    @Test
    void deveRetornarExcecaoParaDepartamentoSemChefe(){
        try {
            Departamento departamento = new Departamento();
            departamento.getDescricaoEscolaridadeChefe();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("sem chefe", e.getMessage());
        }
    }

}