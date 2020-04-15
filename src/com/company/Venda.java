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

    private List<Marca> carros;


    public Venda() {
        carros = new ArrayList<Marca>();
    }


    public void adicionarCarro(Marca carro) {
        carros.add(carro);
    }

    @Override
    public String toString() {
        return "\nLista de Carros:\n" + carros + "\n";
    }

//    public List<Carro> buscar(Carro exemplo) {
//
//        var found = carros.find(function(element) {
//        return element = 20;
//        });
//        return null;
//        }
//
    public Marca obterVeiculo(String chassi) {
        for (Marca carro : carros){
          if (carro.getChassi().equals(chassi)) {
              return carro;
          }

        }
        return null;
    }
}