package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Menu {

    Animal refListAnimal = new Animal();
    List<Animal> listAnimal = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    public void Menu() {


        boolean continuar = true;

        while (continuar){


            System.out.println("1- Cadastrar animal [Mamífero | Áves | Repteis] ");
            System.out.println("2- Listar animal: ");
            System.out.println("3- Sair ");
            System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

            int opcaoUsuario = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoUsuario){


                case 1:
                    Animal animal = new Animal();
                    animal.cadastrarAnimal();
                    refListAnimal.cadastrarAnimal();
                    break;

                case 2:
                    refListAnimal.listarAnimais();
                    break;

                case 3:
                    continuar = false;

                    break;
            }

        }


    }

}
