public class Circulo implements Forma {
    private float raio;

    public Circulo(float raio) {
        this.raio = raio;
    }

    @Override
    public float calcularArea() {
        return (float) (Math.PI * raio * raio);
    }

    public float getRaio() {
        return raio;
    }

    @Override
    public float calcularPerimetro() {
        return (float) (2 * Math.PI * raio);
    }

    public void imprimirDados() {
        System.out.println("Raio do círculo: " + raio);
    }
}