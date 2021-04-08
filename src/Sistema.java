import Objetos.Aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {

        // INSTANCIAS DE OBJETOS
        ArrayList<Aluno> turma = new ArrayList<>(60);
        Scanner input = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);
        BuscaBinaria buscaBinaria = new BuscaBinaria();

        ArrayList<Rgm> rgmList = new ArrayList<>(60);
        Scanner dados = new Scanner(System.in);

        // ATRIBUTOS
        int menu = 99;
        String menuCadastro = "s";

        // PROGRAMA
        while (menu != 0) {

            // MENSAGEM PARA ENTRAR NO MENU PRINCIPAL
            System.out.println("-->  Digite (1) e aperte [enter] para cadastrar um novo usuário. \n"
                    + "-->  Digite (2) e aperte [enter] para buscar um usuário. \n"
                    + "-->  Digite (3) e aperte [enter] para deletar um usuário. \n"
                    + "-->  Digite (4) e aperte [enter] para visualizar todos os alunos da turma. \n"
                    + "-->  Digite (0) e aperte [enter] para finalizar o programa. \n");
            menu = input.nextInt();

            // MENU PRINCIPAL
            switch (menu) {

            // CADASTRO
            case 1:

                while (menuCadastro.equals("s") || turma.size() <= 60) {

                    // INSTANCIANDO OBJETOS

                    Aluno aluno = new Aluno();
                    Rgm rgm = new Rgm();

                    // ATRIBUTOS
                    String maisDisciplinas = "s";

                    // ENTRADA NOME ALUNO E SALVANDO O INPUT DO TIPO STRING
                    System.out.println("> Digite o nome do aluno e aperte enter: ");
                    aluno.nomeAluno = entradaString.nextLine();

                    // ENTRADA DO RGM E SALVANDO O INPUT DO TIPO INT
                    System.out.println("> Digite o RGM do aluno e aperte enter: ");
                    aluno.rgm = input.nextInt();

                    // ENTRADAS DAS DISCIPLINAS
                    while (maisDisciplinas.equals("s")) {

                        // ENTRADA DA DISCIPLINA E SALVANDO O INPUT DO TIPO STRING
                        System.out.println("> Digite uma disciplina: ");
                        aluno.disciplinas.add(entradaString.nextLine());

                        // PERGUNTANDO SE O USUARIO DESEJA ADICIONAR MAIS DISCIPLINAS
                        System.out.println("> Mais disciplinas? ");
                        maisDisciplinas = entradaString.nextLine();
                    }

                    // CONTINUAR CADASTRO DE MAIS ALUNOS OU NAO
                    System.out.println("> Deseja cadastrar outro aluno? ");
                    menuCadastro = entradaString.nextLine();

                    if (menuCadastro.equals("n")) {
                        break;
                    }
                }

                // BUSCA DE USUARIO
            case 2:
                System.out.println("> Qual aluno deseja pesquisar? \n");
                int rgm = input.nextInt();
                int nsei = BuscaBinaria.binario(turma, rgm);

                if (nsei >= 0) {
                    System.out.println("Nome do aluno: " + turma.get(nsei).getNomeAluno());
                    System.out.println("RGM do aluno: " + turma.get(nsei).getRgm());
                    System.out.println("Disciplinas: ");
                    for (String disciplina : turma.get(nsei).getDisciplinas()) {
                        System.out.print(disciplina);
                    }
                } else {
                    System.out.println("> Não existe.");
                }

                break;

            // DELETAR UM USUARIO
            case 3:

                System.out.println("> Qual aluno deseja deletar, favor digitar o [RGM] \n");
                int rg = dados.nextInt();

                for (int i = 0; i < rgmList.size(); i++) {

                    if (rg.getRgm().equals(rgm)) {

                        rgmList.remove(rg);

                        System.out.println("[[ Aluno Removido ]] \n");

                    } else {
                        System.out.println(" [[ Aluno não encontrado ]] \n");
                    }
                }

                break;

            // VISUALIZAR TURMA
            case 4:
                System.out.println("> Lista da Turma \n");

                for (int i = 0; i < turma.size(); i++) {
                    System.out.println(turma.get(i).getDados());
                }

                System.out.println("> Total de alunos na turma: \n" + turma.size());
                break;
            }

        }

        // ENCERRANDO Os OBJETOs SCANNER
        entradaString.close();
        input.close();
        dados.close();

        System.out.println("[[ Programa encerrado ]]");

    }

}