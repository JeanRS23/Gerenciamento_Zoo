package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Mamifero extends Animal {

    Scanner scanner = new Scanner(System.in);

    public void cadastrarMamifero(){

        System.out.println("Informe a espécie do Mamífero: ");
        super.setEspecie(scanner.nextLine());
        System.out.println("Informe o nome do Mamífero: ");
        super.setNome(scanner.nextLine());
        System.out.println("Informe o sexo do Mamífero: ");
        super.setSexo(scanner.nextLine());
        System.out.println("Informe a Idade: ");
        super.setIdade(scanner.nextInt());


    }

}
