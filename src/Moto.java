public class Moto extends CVeiculo {
    private int ano;

    public Moto(String modelo, double preco) {
        super(modelo, preco);
    }

    public double getPreco() {
        if (ano >= 2008) {
            return preco * 1.10;
        } else {
            return preco;
        }
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
