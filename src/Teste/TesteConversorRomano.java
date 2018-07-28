package Teste;

import static org.junit.jupiter.api.Assertions.*;

import model.AlgorismoRomanoInvalido;
import org.junit.jupiter.api.Test;

import model.AlgorismmoRomano;


class TesteConversorRomano {

    private AlgorismmoRomano algRomano = new AlgorismmoRomano();
    private AlgorismoRomanoInvalido algRomanoInvalido = new AlgorismoRomanoInvalido();

    @Test
    void testaSeConverteRomanoSimplesValidoParaArabico() {
        for (String key : algRomano.getListaAlgRomano().keySet()){
            int valor = algRomano.getListaAlgRomano().get(key);
            assertEquals(valor,algRomano.converteRomanoSimples(key));
        }
    }
    @Test
    void testaSeRejeitaRomanoInvalido() {

        for (String key : algRomanoInvalido.getListaRomanoInvalidos().keySet()) {
            assertEquals(false,algRomano.romanoSimplesValido(key));
        }
    }
    /*
    @Test
    void testaSeRejeitaRomanoSimplesInvalidoParaArabico() {
        assertEquals(10,algRomano.converteRomanoSimples("X"));
    }
    @Test
    void testaSeConverteRomanoDuploValidoParaArabico() {
        assertEquals(9,algRomano.converteDoisAlgRomano("IX"));
    }

    @Test
    void testaSeConverteRomanoDuploValidoIguaisParaArabico(){
        assertEquals(1990,algRomano.converteQuatroAlgRomano(""));
    }

    @Test
    void testaSeConverteRomanoDuploDiferentesValidoParaArabico() {
        assertEquals(1990,algRomano.converteQuatroAlgRomano(""));
    }
    @Test
    void testaSeRejeitaRomanoDuploInvalidoParaArabico() {
        assertEquals(1990,algRomano.converteQuatroAlgRomano(""));
    }*/

}


