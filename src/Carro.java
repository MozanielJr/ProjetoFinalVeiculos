public class Carro extends CVeiculo {
    private int km;

    public Carro(String modelo, double preco) {
        super(modelo, preco);
    }

    public double getPreco() {
        if (km > 100000) {
            return preco * 0.92; // 8% de desconto
        } else {
            return preco;
        }
    }

    public void setKm(int km) {
        this.km = km;
    }
}
