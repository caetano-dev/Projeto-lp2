import java.util.Scanner;

public class DemoFormas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            System.out.println("Escolha uma forma: r para Retângulo, c para Círculo e q para Quadrado:");
            char escolha = scanner.next().charAt(0);

            switch (escolha) {
                case 'r':
                    System.out.println("lado do retângulo:");
                    float ladoRetangulo = scanner.nextFloat();
                    System.out.println("altura do retângulo:");
                    float alturaRetangulo = scanner.nextFloat();

                    Retangulo retangulo = new Retangulo(ladoRetangulo, alturaRetangulo);
                    retangulo.imprimirDados();
                    System.out.println("Área do retângulo: " + retangulo.calcularArea());
                    System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());
                    break;

                case 'c':
                    System.out.println("raio do círculo:");
                    float raioCirculo = scanner.nextFloat();

                    Circulo circulo = new Circulo(raioCirculo);
                    circulo.imprimirDados();
                    System.out.println("Área do círculo: " + circulo.calcularArea());
                    System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());
                    break;

                case 'q':
                    System.out.println("lado do quadrado:");
                    float ladoQuadrado = scanner.nextFloat();

                    Quadrado quadrado = new Quadrado(ladoQuadrado);
                    quadrado.imprimirDados();
                    System.out.println("Área do quadrado: " + quadrado.calcularArea());
                    System.out.println("Perímetro do quadrado: " + quadrado.calcularPerimetro());
                    break;

                default:
                    System.out.println("Invalido");
                    break;
            }

            System.out.println("Deseja continuar (S/N)?");
            continuar = scanner.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');

        scanner.close();
    }
}