/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;

/**
 *
 * @author Aluno
 */
public class Carro {
    //Atributos
    private String modelo;
    private String cor;
    private int ano;
    
    //Construtor
    public Carro(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }
    
    //Método para exibir informações do caro
    public void exibirInformacoes()  {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
    }           
     // Método para alterar a cor do carro
    public void alterarCor(String novaCor) {
        cor = novaCor;
    }
   
    // Métodoa para obter o modelo do carro
    public String getModelo() {
        return modelo;
    }

    //Método principal para testar a classe Carro
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Fusca", "Azul",1975);

        // Exibindo informções do carro
        System.out.println("Informações do carro: ");
        meuCarro.exibirInformacoes();

        // Alterando a cor do carro
        meuCarro.alterarCor("Vermelho");

        // Exibindo informações atualizadas do carro
        System.out.println("\nInformações atualizadas do carro:");
        meuCarro.exibirInformacoes();
    }
}

