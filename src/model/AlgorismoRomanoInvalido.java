package model;

import java.util.HashMap;
import java.util.Map;

public class AlgorismoRomanoInvalido {

    Map<String, Integer> listaRomanoInvalidos = new HashMap<>();

    public Map<String, Integer> getListaRomanoInvalidos() {
        return listaRomanoInvalidos;
    }

    public AlgorismoRomanoInvalido() {

        this.listaRomanoInvalidos.put("", -1);
        this.listaRomanoInvalidos.put("%", -1);
        this.listaRomanoInvalidos.put("@", -1);
        this.listaRomanoInvalidos.put("1", -1);
        this.listaRomanoInvalidos.put("s", -1);
    }
}
