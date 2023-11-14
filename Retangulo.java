public class Retangulo implements Forma {
    private float lado;
    private float altura;

    public Retangulo(float lado, float altura) {
        this.lado = lado;
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }

    @Override
    public float calcularArea() {
        return lado * altura;
    }

    @Override
    public float calcularPerimetro() {
        return 2 * (lado + altura);
    }

    public float getLado() {
        return lado;
    }

    public void imprimirDados() {
        System.out.println("Lado do Retângulo: " + lado + ", Altura: " + altura);
    }
}
