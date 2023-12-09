import java.util.ArrayList;
import java.util.Scanner;

public class CadastroVeiculos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Veiculo> cadastroVeiculos = new ArrayList<>();

        while (true) {
            System.out.println("Escolha o tipo de veículo (Moto ou Carro) para inserir no cadastro (ou 'Sair' para encerrar):");
            String escolha = scanner.nextLine();

            if (escolha.equalsIgnoreCase("Sair")) {
                break;
            }

            System.out.println("Insira o modelo do veículo:");
            String modelo = scanner.nextLine();
            System.out.println("Insira o preço do veículo:");
            double preco = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha pendente

            if (escolha.equalsIgnoreCase("Moto")) {
                Moto moto = new Moto(modelo, preco);
                System.out.println("Insira o ano da moto:");
                int ano = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha pendente
                moto.setAno(ano);
                cadastroVeiculos.add(moto);
            } else if (escolha.equalsIgnoreCase("Carro")) {
                Carro carro = new Carro(modelo, preco);
                System.out.println("Insira a quilometragem do carro:");
                int km = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha pendente
                carro.setKm(km);
                cadastroVeiculos.add(carro);
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        System.out.println("\nRelatório de Veículos no Cadastro:\n");
        for (Veiculo veiculo : cadastroVeiculos) {
            veiculo.printDados();
        }

        // Levantamento de preços após ajustes
        double totalAntesAjustes = calcularTotalPreco(cadastroVeiculos);

        // Realizar ajustes
        ajustarPrecos(cadastroVeiculos);

        // Levantamento de preços após ajustes
        double totalAposAjustes = calcularTotalPreco(cadastroVeiculos);

        System.out.println("\nLevantamento de Preços:\n");
        System.out.println("Total de Preços Antes dos Ajustes: " + totalAntesAjustes);
        System.out.println("Total de Preços Após os Ajustes: " + totalAposAjustes);

        scanner.close();
    }

    private static double calcularTotalPreco(ArrayList<Veiculo> veiculos) {
        double total = 0;
        for (Veiculo veiculo : veiculos) {
            total += veiculo.getPreco();
        }
        return total;
    }

    private static void ajustarPrecos(ArrayList<Veiculo> veiculos) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo instanceof Moto) {
                ((Moto) veiculo).getPreco(); // Chamar o método para aplicar o ajuste, se necessário
            } else if (veiculo instanceof Carro) {
                ((Carro) veiculo).getPreco(); // Chamar o método para aplicar o ajuste, se necessário
            }
        }
    }
}
