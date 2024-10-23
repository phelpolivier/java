/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cachorro;

/**
 *
 * @author Aluno
 */
public class Cachorro {
    //Atributos
    private String nome;
    private String raca;
    private int idade;

    // Construtor
    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    // Método para exibir informações do cachorro
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + raca);
        System.out.println("Idade: " + idade);
    }

    // Método para fazer o cachorro latir
    public void latir() {
        System.out.println(nome + "Está latindo: Au Au!");
    }

    // Método principal para testar a classe cachorro
    public static void main(String[] args) {
        // Criando um objeto cachorro
        Cachorro meuCachorro = new Cachorro("Rex", "Labrador", 3);

        // Exibindo informações do cachorro
        System.out.println("Informações do cachorro:");
        meuCachorro.exibirInformacoes();

        // Fazendo o cachorro latir
        System.out.println("\n" + meuCachorro.getNome() + " está fazendo barulho:");
        meuCachorro.latir();
    }

    // Método para obter o nome do cachorro
    public String getNome() {
        return nome;
    }
    
}