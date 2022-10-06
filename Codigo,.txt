import java.util.Random;
import java.util.Scanner;

public class Sprint04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();

        int equipes, i, j;


        System.out.print("Digite o numero de equipes: ");
        equipes = input.nextInt();
        System.out.println();

        String idEquipe[] = new String [equipes];
        int notaDesign[] = new int[equipes];
        for (i = 0; i < equipes; i++) {
            System.out.print("Digite o nome da " + (i+1) + " equipe: ");
            idEquipe[i] = input.next().toUpperCase();

            //System.out.print("Digita a nota de design do robo da equipe: ");
            notaDesign[i] = r.nextInt(11);

            System.out.println();
        }

        System.out.println();
        System.out.println("---------------- PARTIDAS PRIMEIRA FASE ---------------");
        int pontuacao[] = new int[equipes];
        for (i = 0; i < equipes; i++) {
            for (j = 0; j < equipes; j++) {
                int pontoA = r.nextInt(11);
                int pontoB = r.nextInt(11);

                if (j > i) {
                    System.out.println("\t\t\t\t\t" + idEquipe[i] + " " + pontoA + "x" + pontoB + " " + idEquipe[j]);
                    if (pontoA > pontoB) {
                        pontuacao[i] += 5;
                    }
                    else if (pontoB > pontoA) {
                        pontuacao[j] += 5;
                    }
                    else {
                        if (notaDesign[i] > notaDesign[j]) {
                            pontuacao[i] += 3;
                        } else if (notaDesign[j] > notaDesign[i]) {
                            pontuacao[j] += 3;
                        }
                        else {
                            pontuacao[i] += 3;
                            pontuacao[j] += 3;
                        }
                    }
                }
                pontoA = 0;
                pontoB = 0;


            }
        }
        System.out.println("------------------------------------------------------");

        for (i = 1; i < equipes; i++) {
            for (j = 0; j < equipes; j++) {
                if (pontuacao[i] > pontuacao[j] || pontuacao[i] == pontuacao[j] && notaDesign[i] > notaDesign[j]) {
                    int pontTemp, notaTemp;
                    String nomeTemp;

                    pontTemp = pontuacao[i];
                    pontuacao[i] = pontuacao[j];
                    pontuacao[j] = pontTemp;

                    nomeTemp = idEquipe[i];
                    idEquipe[i] = idEquipe[j];
                    idEquipe[j] = nomeTemp;

                    notaTemp = notaDesign[i];
                    notaDesign[i] = notaDesign[j];
                    notaDesign[j] = notaTemp;
                }
            }
        }


        System.out.println();
        System.out.println();
            System.out.println("------------------- PRIMEIRA FASE --------------------");
        System.out.println();
            System.out.println("------------------- CLASSIFICACAO --------------------");
            System.out.println("Posicao\t\t" + "Nome do Robo\t" + "Pontuacao\t" + "Nota de Design");
        for (i = 0; i<equipes; i++) {
            System.out.println((i+1) + " Lugar \t\t" + idEquipe[i] + "\t\t\t\t" + pontuacao[i] + "\t\t\t" + notaDesign[i]);
            if ((i+1) == 3) {
                System.out.println("-------------------------------------------------------");
            }
        }
        System.out.println("-------------------------------------------------------");

        System.out.println();
        System.out.println();

        System.out.println("------------------- CLASSIFICADOS ---------------------");
        for (i=0; i < 3; i++) {
                System.out.print("\t\t" + idEquipe[i] + "\t\t");
        }
        System.out.println();
        System.out.println("-------------------------------------------------------");

        System.out.println();
        System.out.println();


        pontuacao[0] = 0;
        pontuacao[1] = 0;
        pontuacao[2] = 0;

        System.out.println("----------------- PARTIDAS FASE FINAL ----------------");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                int pontoA = r.nextInt(11);
                int pontoB = r.nextInt(11);

                if (j > i) {
                    System.out.println("\t\t\t\t\t\t" + idEquipe[i] + " " + pontoA + "x" + pontoB + " " + idEquipe[j]);
                    if (pontoA > pontoB) {
                        pontuacao[i] += 2;
                    }
                    else if (pontoB > pontoA) {
                        pontuacao[j] += 2;
                    }
                    else {
                        if (notaDesign[i] > notaDesign[j]) {
                            pontuacao[i] += 2;
                        } else if (notaDesign[j] > notaDesign[i]) {
                            pontuacao[j] += 2;
                        }
                        else {
                            pontuacao[i] += 1;
                            pontuacao[j] += 1;
                        }
                    }
                }
                pontoA = 0;
                pontoB = 0;


            }
        }
        System.out.println("-------------------------------------------------------");

        System.out.println();
        System.out.println();

        for (i = 1; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (pontuacao[i] > pontuacao[j] || pontuacao[i] == pontuacao[j] && notaDesign[i] > notaDesign[j]) {
                    int pontTemp, notaTemp;
                    String nomeTemp;

                    pontTemp = pontuacao[i];
                    pontuacao[i] = pontuacao[j];
                    pontuacao[j] = pontTemp;

                    nomeTemp = idEquipe[i];
                    idEquipe[i] = idEquipe[j];
                    idEquipe[j] = nomeTemp;

                    notaTemp = notaDesign[i];
                    notaDesign[i] = notaDesign[j];
                    notaDesign[j] = notaTemp;
                }
            }
        }

        System.out.println("-------------------- FASE FINAL ----------------------");
        System.out.println();
        System.out.println("------------------- CLASSIFICACAO --------------------");
        System.out.println("Posicao\t\t" + "Nome do Robo\t" + "Pontuacao\t" + "Nota de Design");
        for (i = 0; i<3; i++) {
            System.out.println((i+1) + " Lugar \t\t" + idEquipe[i] + "\t\t\t\t" + pontuacao[i] + "\t\t\t" + notaDesign[i]);
            if ((i+1) == 3) {
                System.out.println("-------------------------------------------------------");
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("----------------------- CAMPEAO -----------------------");
        System.out.println("|                          " + idEquipe[0] + "                           |");
        System.out.println("-------------------------------------------------------");









        input.close();
    }

}
