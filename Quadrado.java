public class Quadrado implements Forma {
    private float lado;

    public Quadrado(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    @Override
    public float calcularArea() {
        return lado*lado;
    }

    @Override
    public float calcularPerimetro() {
        return 4*lado;
    }

    public void imprimirDados() {
        System.out.println("Lado do Quadrado: " + lado);
    }
}