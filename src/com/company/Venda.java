package com.company;

import java.util.ArrayList;
import java.util.List;

public class Venda {
// A classe Venda tem três funcionalidades, adicionarVeiculo, obterVeiculo e buscar, implemente as mesmas.
//
//   - o método obterVeiculo recebe o chassi e busca o mesmo na lista de Veiculos de Venda, se existir, devolve o objeto Veiculo
//
//   - o método buscar recebe um objeto Veiculo preenchido com os parametros de busca, por exemplo, pode receber um objeto somente com a
//   Marca Volkswagen e então deve percorrer a lista e devolver uma lista com todos os Veiculos de Marca Volkwagen existentes nas Vendas.

    private List<Carro> carros;


    public Venda(){
        carros = new ArrayList<Carro>();
    }


    public void adicionarCarro(Carro carro){
        carros.add(carro);
    }

    @Override
    public String toString() {
        return "\nLista de Carros: " +
                "carros" + carros;
        };
    }

    //    public List<Carro> buscar(Carro exemplo) {
//        return null;
//    }
//
//    public String obterCarro(String chassi){
//        return null;
//    }
}
