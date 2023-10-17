package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Animal {

    String nome, sexo, especie;
    int idade;
    Animal animal = new Animal();
    List<Animal> listAnimal = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    public void cadastrarAnimal() {

        System.out.println("/----- Cadastrar Animal -----/");
        System.out.println("Informe a espécie do animal: ");
        especie = scanner.nextLine();
        System.out.println("Informe o nome do animal: ");
        nome = scanner.nextLine();
        System.out.println("Informe o sexo do animal: ");
        sexo = scanner.nextLine();
        System.out.println("Informe a idade do animal: ");
        idade = scanner.nextInt();
    }


    public void adicionarAnimais(){
        listAnimal.add(animal);
    }


    public void listarAnimais(){
        for (Animal animal : listAnimal){
            System.out.println("Nome: " + animal.nome);
        }

    }









    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
