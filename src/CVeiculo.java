public class CVeiculo implements Veiculo {
    protected String modelo;
    protected double preco;

    public CVeiculo(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void printDados() {
        System.out.println("Modelo: " + getModelo() + ", Preço: " + getPreco());
    }
}
