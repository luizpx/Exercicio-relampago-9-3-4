import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrupoTest {

    @Test
    void deveRetornarEscolaridadePresidente(){
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setDescricao("Mestrado");

        Funcionario funcionario = new Funcionario();
        funcionario.setEscolaridade(escolaridade);

        Grupo grupo = new Grupo();
        grupo.setPresidente(funcionario);

        assertEquals("Mestrado", funcionario.getDescricaoEscolaridade());
    }

    @Test
    void deveRetornarExcecaoParaGrupoSemPresidente(){
        try {
            Grupo grupo = new Grupo();
            grupo.getDescricaoEscolaridadePresidente();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("sem presidente", e.getMessage());
        }
    }

}