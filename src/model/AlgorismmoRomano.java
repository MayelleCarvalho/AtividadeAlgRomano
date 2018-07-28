package model;

import java.util.HashMap;
import java.util.Map;

public class AlgorismmoRomano {

    Map<String, Integer> listaAlgRomano = new HashMap<>();


    public AlgorismmoRomano() {

        this.listaAlgRomano.put("I", 1);
        this.listaAlgRomano.put("V", 5);
        this.listaAlgRomano.put("X", 10);
        this.listaAlgRomano.put("L", 50);
        this.listaAlgRomano.put("C", 100);
        this.listaAlgRomano.put("D", 500);
        this.listaAlgRomano.put("M", 1000);
    }

    public Map<String, Integer> getListaAlgRomano() {
        return listaAlgRomano;
    }
    public int converteRomanoSimples(String algRomano) {
        if(romanoSimplesValido(algRomano)){
            return listaAlgRomano.get(algRomano.toUpperCase());
        }
        else{
            throw new IllegalArgumentException("Romano Inválido");
        }
    }

    public boolean romanoSimplesValido(String alg){
        if(!alg.isEmpty() && alg.length() == 1){
                if(this.listaAlgRomano.containsKey(alg.toUpperCase()))
                    return true;
                else
                    return false;
        }
        else{
            return false;
        }
    }
    /*public int converteDoisAlgRomano(String numRomano) {
        AlgorismmoRomano algRomano = new AlgorismmoRomano();

        if(algRomano.converteUmAlgRomano(String.valueOf(numRomano.charAt(0))) >
                algRomano.converteUmAlgRomano(String.valueOf(numRomano.charAt(1)))) {
            return (int) algRomano.converteUmAlgRomano(String.valueOf(numRomano.charAt(0)))
                    + algRomano.converteUmAlgRomano(String.valueOf(numRomano.charAt(1)));
        }
        else {
            return (int) algRomano.converteUmAlgRomano(String.valueOf(numRomano.charAt(0))) +
                    algRomano.converteUmAlgRomano(String.valueOf(numRomano.charAt(1)));
        }

    }


    public int converteTresAlgRomano(String numRomano) {
        return 61;
    }
    public int converteQuatroAlgRomano(String numRomano) {
        return 1990;
    }*/

}

